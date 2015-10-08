package com.gt.dao.Impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gt.dao.base.BaseDaoI;

public class BaseDaoImpl<T> implements BaseDaoI<T> {
	@Autowired
    private SessionFactory sessionFactory;
    private Class clazz;
	public BaseDaoImpl(){
	
		System.out.println("dao----this代表的是当前调用构造方法的对象："+this);
		System.out.println("dao----获取当前this对象的父类："+this.getClass().getSuperclass());
		System.out.println("dao----获取当前this对象父类的信息（包括泛型）:"+this.getClass().getGenericSuperclass());
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
	}
    public Session getSession(){
    	return sessionFactory.getCurrentSession();
    }
	@Override
	public void save(T t) {
		this.getSession().save(t);
	}

	@Override
	public void update(T t) {
		this.getSession().update(t);
	
	}

	@Override
	public  void delete(int id) {
		// TODO Auto-generated method stub
		String hql = "delete "+ clazz.getSimpleName() +" where id=:id";
		this.getSession().createQuery(hql).setInteger("id", id).executeUpdate();
	}

	@Override
	public T get(Class<T> class1,int id) {
		return (T)this.getSession().get(class1, id);
	}

	@Override
	public List<T> query() {
		String hql = "from "+clazz.getSimpleName();
		List<T> list = this.getSession().createQuery(hql).list();
		return list;
	}
	@Override
	public void deleteMore(String hql) {
		this.getSession().createQuery(hql).executeUpdate();
	}
	/**
	 * 从前台获取到list让后进行删除，但是我个人喜欢上面的方式，因为不需要循环，直接删除，可以降低处理时间
	 * 而这种方式比较适合当有多条记录要插入，这种方式是比较合适的
	 */
	@Override
	public void deleteArray(List<Integer> ids) {
		String sql = "delete from "+clazz.getSimpleName()+" where id in (";
	     for (Integer id : ids) {
			sql+=id+",";
		 }
	     String hql=sql.substring(0, sql.length()-1);
	     hql+=")";
	     getSession().createQuery(hql).executeUpdate();
	    }

}
