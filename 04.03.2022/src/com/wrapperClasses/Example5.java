package com.wrapperClasses;

public class Example5 {

	public static void main(String[] args) {
		//Short
		short id=292;
		Short S1=Short.valueOf(id);
		System.out.println(S1);
		System.out.println("*******");
		
		short count=5;
		Short S2=new Short(count);
		short S=S2.shortValue();
		System.out.println(S);
		

	}

}
