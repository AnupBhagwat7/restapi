/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.menu;

/**
 *
 * @author Shrikant Jagtap <shrikant.jagtap@heckyl.com>
 */
public abstract class Starter implements MenuItem
{

    //Use factory pattern here to return specific starter
    // getStarter("Kebab")
	
	public static MenuItem  getStarter(String starterName) {
		
		if("kebab".equalsIgnoreCase(starterName)){
			return new Kebab();
		}else if("soup".equalsIgnoreCase(starterName)){
			return new Kebab();
		}
		return null;
	}
    
}
