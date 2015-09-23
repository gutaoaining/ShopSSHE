package com.gt.services.Impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.BaseDaoI;
import com.gt.services.base.BaseServiceI;

public class BaseServiceImpl<T> implements BaseServiceI<T> {
    private Class clazz;
	public BaseServiceImpl(){
		System.out.println("this代表的是当前调用构造方法的对象："+this);
		System.out.println("获取当前this对象的父类："+this.getClass().getSuperclass());
		System.out.println("获取当前this对象父类的信息（包括泛型）:"+this.getClass().getGenericSuperclass());
		System.out.println();
		ParameterizedType type =(ParameterizedType)this.getClass().getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
		System.out.println(clazz);
		
	}
	@Autowired
	private BaseDaoI<T> baseDao;
	@Override
	public T get() {
		// TODO Auto-generated method stub
		T t = baseDao.get(clazz, 1);
		return t;
	}

	

}
