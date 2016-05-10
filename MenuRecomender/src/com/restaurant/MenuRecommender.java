/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.restaurant.meal.Meal;

/**
 *
 * @author Shrikant Jagtap <shrikant.jagtap@heckyl.com>
 */
public class MenuRecommender
{
	
	static{
		List<String> starters = new ArrayList<String>();
		starters.add("kebab");
		starters.add("soup");
		
		List<String> mains = new ArrayList<String>();
		mains.add("pizza");
		mains.add("biryani");
		
		List<String> desserts = new ArrayList<String>();
		desserts.add("pastry");
		desserts.add("cakes");
		
	}
	
    public List<Meal> getBestRecommendedMenuList(Double budget, Map<Integer ,ArrayList<String>> priorityMap)
    {
        //Logic to get best 6 recommended menu List
        return null;
    }
}
