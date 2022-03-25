package com.wrapperClasses;

public class Example6 {

	public static void main(String[] args) {
		//Long
		long obj=10;
		Long L1=Long.valueOf(obj);
		System.out.println(L1);
		System.out.println("*********");
		
		Long L2=new Long(38);
		long L=L2.longValue();
		System.out.println(L);

	}

}
