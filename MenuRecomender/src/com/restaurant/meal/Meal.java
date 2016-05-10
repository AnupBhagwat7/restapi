/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.meal;

import com.restaurant.menu.MenuItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shrikant Jagtap <shrikant.jagtap@heckyl.com>
 */
public class Meal
{
    double total;
    List<MenuItem> mealItemList;
    //Assign best meal number - 1st, 2nd and so on..
    
    public Meal()
    {
        mealItemList = new ArrayList<MenuItem>();
    }
    
    public void addMenuItem(MenuItem menuItem)
    {
        mealItemList.add(menuItem);
        //update total
    }

	@Override
	public String toString() {
		return "Meal [total=" + total + ", mealItemList=" + mealItemList + "]";
	}
    
    
}
