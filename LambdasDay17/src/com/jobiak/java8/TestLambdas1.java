package com.jobiak.java8;

public class TestLambdas1 {

	interface Square{
	public int calculateSquare(int x);
	}
		public static void main(String[] args) {
		
			int num=10;
	Square square=(int x)->x*x;
	int answer=square.calculateSquare(num);
    System.out.println(answer);
	};
	
}
