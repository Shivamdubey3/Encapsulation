package com.shivam.encapsulation;

public class Encapsulation
{
	private int serialNumber;  //data members 
	private String laptopName;
	private float price;
	//getter and setters
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//to string
	@Override
	public String toString() {
		return "Encapsulation [serialNumber=" + serialNumber + ", laptopName=" + laptopName + ", price=" + price + "]";
	}
	
	
}
