package com.jobiak.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class TestFunctions {

	

	public static void main(String[] args) {
		Function<String,Integer>lengthFunction=(String str)->{return str.length()/2;};
		int result=lengthFunction.apply("Jobiak.com");
		System.out.println(result);
		
		
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("Apple"); fruits.add("Bananana"); fruits.add("Grapes"); fruits.add("pineapple");
		
		List<Integer>lengthList=method(fruits,lengthFunction);
		System.out.println(lengthList);

		/*Predicate<Boolean>predicate=(Boolean)->{
			return 100<45;
		};
		System.out.println(predicate.test(true));
		
		Consumer<String>consumer=(String str)->{
			System.out.println(str);
		};
		consumer.accept("jobiak.ai");
		
		Supplier<Double>supplier=()->Math.random();
		System.out.println(supplier.get());
		*/
		
		
}

	private static List<Integer> method(java.util.ArrayList<String> list, Function<String, Integer>functionParam) {
		
		ArrayList<Integer>intList=new ArrayList<>();
		for(String str:list) {
			int lenght=functionParam.apply(str);
			intList.add(lenght);
		}
		return intList;
		
	}
	


}
