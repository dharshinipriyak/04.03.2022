package com.wrapperClasses;

public class Example2 {

	public static void main(String[] args)
	{
		//Byte value 
		byte count=21;//Primitive type
		Byte b1=Byte.valueOf(count);
		System.out.println(b1);
		System.out.println("**********");
		
		byte age=12;
		Byte B2=new Byte(age);//Object type
		
		byte a=Byte.valueOf(B2);
		System.out.println(a);

	}

}
