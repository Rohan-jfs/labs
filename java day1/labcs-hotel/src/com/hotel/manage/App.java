package com.hotel.manage;

import java.util.ArrayList;

public class App {
	public static void main(String[] a) {

		//creatingInstances();
		
		//workingWithArrays();
		
		usingArrayList();
		
		
	}

	private static void usingArrayList() {
		Hotel hot1=new Hotel("swosti","bbi",5000.0f,4);
		Hotel hot2=new Hotel("ginger","delhi",1500.0f,2);
		ArrayList hotellist=new ArrayList();
		hotellist.add(hot1);
		hotellist.add(hot2);
		System.out.println(hotellist);
		//hotellist.forEach(System.out::println);
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("abc");
		ab.add("def");
		System.out.println(ab); 
		
	}

	private static void workingWithArrays() {
		Hotel[] hotel1=new Hotel[2];
		
		hotel1[0]=new Hotel("taj","mumbai",10000.0f,6);
		hotel1[1]=new Hotel("itc","delhi",15000.0f,5);
		for(Hotel h1:hotel1)
		{
			System.out.println(h1);
		}
	}

	private static void creatingInstances() {
		Hotel hotel = new Hotel();
		//hotel.acceptDetails();
		hotel.displayDetails();
		
		System.out.println("*********");
		Hotel h1=new Hotel("Mariott", "Bengaluru", 5000.0f, 4);
		System.out.println(h1);
	}
	
	
}
