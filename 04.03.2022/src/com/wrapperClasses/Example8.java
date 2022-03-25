package com.wrapperClasses;

public class Example8 {

	public static void main(String[] args) {
		// Integer
		int number=201;
		Integer value=Integer.valueOf(number);
		System.out.println(value);
		System.out.println("*********");
		
		Integer val=new Integer(999);
		int i1=val.intValue();
		System.out.println(i1);
	}

}
