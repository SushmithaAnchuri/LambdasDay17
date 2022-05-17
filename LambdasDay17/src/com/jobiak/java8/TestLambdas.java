package com.jobiak.java8;
//Java8 vs Interface 
//1.Functional Interface 
@FunctionalInterface
interface Test{
	public default void paint() {
		System.out.println("from default method");
	}
	public abstract void print();
	//not allowed only one abstract method per FunctionalInterface public abstract void print1();
}

interface Test2{
	public void add(int a,int b);
}

interface Test3{
	public int factorial(int n);
}
interface Test4{
	public String getString();
}
public class TestLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test=() ->{System.out.println("from print............printing");};

		test.print();
		
		Test2 test2=(int a,int b)->{
			int c=a+b;
			System.out.println(c);
		};
		test2.add(10,20);
		
		Test3 test3=(int n)->{
			int fact=1;
			int i=1;
			while(i<=n) {
				fact*=i;
				i++;
			}
			return fact;
		};
		int factorialResult=test3.factorial(4);
		System.out.println(factorialResult);
		
		Test4 test4=()->"Sushmitha";
		System.out.println(test4.getString());
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("from run method.....");
			}
		};
		Thread thread=new Thread(r);
		thread.start();
		
		Runnable r1=()->{System.out.println("from ()-> run method.......");};
		thread=new Thread(r1);
		thread.start();
		}
}
