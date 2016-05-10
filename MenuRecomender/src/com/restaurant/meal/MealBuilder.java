/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.restaurant.menu.MenuItem;

/**
 *
 * @author Shrikant Jagtap <shrikant.jagtap@heckyl.com>
 */
public class MealBuilder
{
    
	
	
    public List<Meal> prepareBestMeal(double budget , Map<Integer , ArrayList<String>> priority) //pass Priority and Budget and  n = n'th best meal number
    {
        //Actual logic here to get nth best meal - 
        //use stack to keep track an dto find best combinations
    	
    	Meal meal = new Meal();
    	
    	ArrayList<String> p1 = priority.get(1);
    	ArrayList<String> p2 = priority.get(2);
    	ArrayList<String> p3 = priority.get(3);
    	
    	//meal.addMenuItem();
    	
        return null;
    }
    
    
    //Optional
    public Meal prepareVegMeal()
    {
        return null;
    }
    
    //Optional
    public Meal prepareNonVegMeal()
    {
        return null;
    }
    
}
