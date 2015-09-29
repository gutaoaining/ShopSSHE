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

}
