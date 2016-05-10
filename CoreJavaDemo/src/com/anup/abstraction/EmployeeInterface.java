/**
 * 
 */
package com.anup.abstraction;

/**
 * @author ANUP
 *
 */
public interface EmployeeInterface {

	
	public void display();
	default void test(){
		System.out.println("TEST");
	}
	
	public static Integer getInt() {
		return 12;
	}
	
	
	
}
