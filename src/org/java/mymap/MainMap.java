package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		
		Map<String , Integer> myMap = new HashMap<>();
		for (String word : str.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split(" ")) {
			
			if (myMap.containsKey(word)) {
				
				myMap.put(word, myMap.get(word) + 1);
			} else {
				myMap.put(word, 1);
			}
		}
		
		myMap.remove("");
		
		System.out.println(myMap);
	}
}
