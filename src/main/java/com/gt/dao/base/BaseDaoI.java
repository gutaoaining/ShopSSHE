package com.gt.dao.base;

import java.util.List;

public interface BaseDaoI<T> {
     public void save(T t);
     
     public void update(T t);
     
     public void delete(int id);
     
     public List<T> query();

	 public T get(Class<T> class1, int id);
	 
	 public void deleteMore(String hql);
}
