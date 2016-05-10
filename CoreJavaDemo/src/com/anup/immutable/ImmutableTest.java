/**
 * 
 */
package com.anup.immutable;

import java.util.Date;

/**
 * @author ANUP
 *
 */
public class ImmutableTest {

	/**
	 * 
	 */
	public ImmutableTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass ic = ImmutableClass.createNewInstance(12, "Anup", new Date());
		
		String s1 = "Anup";
		
		System.out.println("Before....."+ ic);
		ic.getMutableField().setHours(10000000);
		System.out.println("After....."+ ic);
				
		System.out.println(new Date());
		System.out.println((s1+"bhagwat").hashCode());
		System.out.println(new Date());
		
		
		Date utildate = new Date();
		
		java.sql.Date sqlDate = new java.sql.Date(2016,03, 26);
		
		System.out.println(utildate +"   "+ sqlDate);
		
	}

}
