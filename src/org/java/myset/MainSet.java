package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Random rnd = new Random();
		int origin = 2;
		int bound = 13;
		Set<Integer> numsList = new HashSet<>();
		int numOfNums = 5;
		
		for(int i=0 ; i<numOfNums ; i++) {
			int rndNum = rnd.nextInt(origin , bound);
			
			numsList.add(rndNum);
		}
		
		System.out.println(numsList);
	}
}
