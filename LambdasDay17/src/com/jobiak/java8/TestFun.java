package com.jobiak.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class TestFun{

	static List<String> places = new ArrayList<>();
	 public static List getPlaces(){
		 places.add("Nepal, Kathmandu");
	        places.add("Nepal, Pokhara");
	        places.add("India, Delhi");
	        places.add("USA, New York");
	        places.add("Africa, Nigeria");

	        return places;
	    }
	 public static void main( String[] args ) {

	        List<String> myPlaces = getPlaces();
	        System.out.println(myPlaces);
	        
	        
	    }
}
