package com.wrapperClasses;

public class Example3 {

	public static void main(String[] args) 
	{
		//character
		char student='T';
		Character c1=Character.valueOf(student);
		System.out.println(c1);
		System.out.println("********");
		
		Character c2=new Character('S');
		char name=c2.charValue();
		System.out.println(name);

	}

}
