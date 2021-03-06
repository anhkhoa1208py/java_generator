/*
 * Created on 2022-04-14 ( Time 09:45:05 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package com.vpbank.innovation.business.service;

import java.util.List;

import com.vpbank.innovation.bean.FvUser;

/**
 * Business Service Interface for entity FvUser.
 */
public interface FvUserService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	FvUser findById( BigDecimal id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<FvUser> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	FvUser save(FvUser entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	FvUser update(FvUser entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	FvUser create(FvUser entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( BigDecimal id );


}
