package com.gt.services.base;

import java.util.List;

public interface BaseServiceI<T> {
	public T get(int id);

	public void save(T t);

	public List<T> query();

	public void delete(int id);

	public void update(T t);
}
