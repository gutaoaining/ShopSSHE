package com.gt.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gt.dao.base.BaseDaoI;
@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDaoI<T> {
    private SessionFactory sessionFactory;
    
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
    @Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    public Session getSession(){
    	return sessionFactory.getCurrentSession();
    }
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(Class<T> class1,int id) {
		// TODO Auto-generated method stub
		return (T)this.getSession().get(class1, id);
	}

	@Override
	public List<T> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
