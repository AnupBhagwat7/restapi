/**
 * 
 */
package com.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Store;
import com.rest.service.StoreService;

/**
 * @author Anup
 *
 */

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreService ss;
	
	@RequestMapping(value = "/addStore", method = RequestMethod.POST, headers = "Accept=application/json")
	public Store addStore(@RequestBody Store store) {
		return ss.addStore(store);
	}
	
	@RequestMapping(value="/getAllStores" , method = RequestMethod.GET , headers = "Accept=application/json")
	public ArrayList<Store> getStoreAllStores() {
		
		return ss.getAllStores();
	}
	
	@RequestMapping(value="/getStore/{id}" , method=RequestMethod.GET , headers = "Accept=application/json")
	public Store getStoreById(@PathVariable Integer id) {
		
		return ss.getStore(id);
	}
	
	
}
