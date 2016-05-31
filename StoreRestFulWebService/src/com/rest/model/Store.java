/**
 * 
 */
package com.rest.model;

/**
 * @author Anup
 *
 */
public class Store {

	
	private int id;
	private String name;
	private String type;
	private int pinCode;
	
	
	public Store() {
		super();
	}
	
	public Store(int id, String name, String type, int pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
