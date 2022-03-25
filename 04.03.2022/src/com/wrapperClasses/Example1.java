package com.wrapperClasses;

public class Example1 {

	public static void main(String[] args) {
		//float
		float score= 87.56f;
		Float F1=Float.valueOf(score);
		System.out.println(F1);
		System.out.println("**********");
		
		Float F2= new Float(54.22f);
		float mark=F2.floatValue();
		System.out.println(mark);
	}

}