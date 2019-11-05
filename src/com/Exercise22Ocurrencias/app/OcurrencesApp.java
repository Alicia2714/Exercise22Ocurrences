package com.Exercise22Ocurrencias.app;

import java.util.HashMap;
import java.util.Random;

public class OcurrencesApp {

	public static void main(String[] args) {
		//Constants declaration
		final int ELEMENTS = 1000;
		
		//Variable declaration
		String result= "";
		
		//Object declaration
		Random randomnumbers = new Random(System.nanoTime());
		HashMap<Integer, Integer> mihash = new HashMap<Integer, Integer>();
		
		int[] myArray = new int[ELEMENTS];
		for(int i=0; i<ELEMENTS; i++) {
			myArray[i] = randomnumbers.nextInt(10);
		}
		
		for(int i:myArray) {
			System.out.println(""+i);
		}
		
		//Process
		int ocurrences = 0;
		for(int element:myArray) {
			if(mihash.containsKey(element)) {
				ocurrences = mihash.get(element);
				ocurrences ++;
				mihash.put(element, ocurrences);
			}
			/*
			else {
				mihash.put(element, 1);
			} */
			mihash.putIfAbsent(element, 1);
		}
		
		
		System.out.println(mihash);
		
		//input.Close();

	}

}
