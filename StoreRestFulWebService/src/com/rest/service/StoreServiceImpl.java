/**
 * 
 */
package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Store;

/**
 * @author Anup
 *
 */
public class StoreServiceImpl implements StoreService {


	static ArrayList<Store> storeList = new ArrayList<Store>();
	static{
		storeList.add(new Store(1, "Ram", "Clothes", 413102));
		storeList.add(new Store(2, "Shyam", "Garage", 411011));
		storeList.add(new Store(3, "Anup Traders", "Hardware", 411057));
		storeList.add(new Store(4, "RR", "Computer", 413102));
		storeList.add(new Store(5, "DD", "General", 413101));
		storeList.add(new Store(6, "KK", "Flowers", 413103));
		storeList.add(new Store(7, "MM", "Watches", 413107));
		storeList.add(new Store(8, "DSk", "Clothes", 413110));
		
	}
	@Override
	public Store addStore(Store ss) {
		// TODO Auto-generated method stub
		storeList.add(ss);
		return ss;
	}
	@Override
	public ArrayList<Store> getAllStores() {
		// TODO Auto-generated method stub
		return storeList;
	}
	@Override
	public Store getStore(int id) {
		// TODO Auto-generated method stub
		
		for (Store store :storeList  ){
			if (store.getId() == id){
				return store;
				}
		}
		return null;
	}

}
