/**
 * 
 */
package com.anup.serialize;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ANUP
 *
 */
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer id, String name, String address, Date jd) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.jd = jd;
	}

	static Integer id;
	
	String name;
	
	transient String address;
	
	Date jd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJd() {
		return jd;
	}

	public void setJd(Date jd) {
		this.jd = jd;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", jd=" + jd + "]";
	}
	
	

}
