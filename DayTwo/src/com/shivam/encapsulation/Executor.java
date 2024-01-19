package com.shivam.encapsulation;

public class Executor {

	public static void main(String[] args) {

		Encapsulation obj=new Encapsulation(); //syntax for creating object
		obj.setSerialNumber(1001);
		obj.setLaptopName("ASUS");
		obj.setPrice(45000.000f);

		System.out.println("Your laptop details are: "+ obj);
	}

}
