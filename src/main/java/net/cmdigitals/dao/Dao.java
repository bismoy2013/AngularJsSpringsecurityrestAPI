package net.cmdigitals.dao;

import java.util.List;

import net.cmdigitals.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}