package com.ajeesh.utils;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting");
		
		
		A a = null;
		a.check();
		System.out.println("END");

	}

}

class A{
	static void check(){
		System.out.println("Calling check");
	}
}
