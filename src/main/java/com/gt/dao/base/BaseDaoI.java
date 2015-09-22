package com.gt.dao.base;

import java.util.List;

public interface BaseDaoI<T> {
     public void save(T t);
     
     public int update(T t);
     
     public int delete(int id);
     
     public List<T> query();

	 public T get(Class<T> class1, int id);
}
