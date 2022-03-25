package com.wrapperClasses;

public class Example4 {

	public static void main(String[] args) {
		//Boolean
		boolean right=true;
		Boolean B1=Boolean.valueOf(right);
		System.out.println(B1);
		System.out.println("*******");
		
		Boolean B2=new Boolean(false);
		boolean wrong=B2.booleanValue();
		System.out.println(wrong);
	}

}
