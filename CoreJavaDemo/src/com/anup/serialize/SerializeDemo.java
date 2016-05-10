/**
 * 
 */
package com.anup.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author ANUP
 *
 */
public class SerializeDemo {

	/**
	 * 
	 */
	public SerializeDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Employee e = new Employee(1, "Anup", "Pune", new Date());
			
			FileOutputStream f = new FileOutputStream(new File("anup.ser"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(e);
			
			FileInputStream fi = new FileInputStream(new File("anup.ser"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			System.out.println(oi.readObject().toString());
			
		}catch(Exception e){
			
		}
	}

}
