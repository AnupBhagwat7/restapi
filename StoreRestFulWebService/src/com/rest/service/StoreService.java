/**
 * 
 */
package com.rest.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.rest.model.Store;

/**
 * @author Anup
 *
 */
@Service
public interface StoreService {

	
	public Store addStore(Store ss) ;
	public ArrayList<Store> getAllStores();
	public Store getStore(int id) ;
}
