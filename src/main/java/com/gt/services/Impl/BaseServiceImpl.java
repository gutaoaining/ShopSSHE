package com.gt.services.Impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;

import com.gt.dao.base.BaseDaoI;
import com.gt.services.base.BaseServiceI;

public class BaseServiceImpl<T> implements BaseServiceI<T> {
    private Class clazz;
	public BaseServiceImpl(){
		System.out.println("this代表当前构造方法的对象："+this);
		System.out.println("获取当前this对象的父类："+this.getClass().getSuperclass());
		System.out.println("获取当前this对象父类的信息（包括范型信息）:"+this.getClass().getGenericInterfaces());
		System.out.println();
		ParameterizedType type =(ParameterizedType)this.getClass().getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
		System.out.println(clazz);
		
	}
	private BaseDaoI<T> baseDao;
	
	public BaseDaoI<T> getBaseDao() {
		return null;
	}
	@Autowired
	public void setBaseDao(BaseDaoI<T> baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public T get() {
		// TODO Auto-generated method stub
		T t = baseDao.get(clazz, 1);
		return t;
	}

	

}
