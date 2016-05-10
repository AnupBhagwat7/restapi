/**
 * 
 */
package com.anup.abstraction;

/**
 * @author ANUP
 *
 */
public class EmployeeImpl implements EmployeeInterface {

	/**
	 * 
	 */
	public EmployeeImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.anup.abstraction.EmployeeInterface#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		EmployeeImpl impl = new EmployeeImpl();
		System.out.println(EmployeeInterface.getInt()  + "    ");
	}

}
