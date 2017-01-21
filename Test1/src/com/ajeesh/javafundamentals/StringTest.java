package com.ajeesh.javafundamentals;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("ABC");
		
		
		System.out.println("s1 hashcode="+s1.hashCode() + (s1 == s3));
		System.out.println("s2 hashcode="+s2.hashCode());
		System.out.println("s3 hashcode="+s3.hashCode());
	}

}
