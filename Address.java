package com.groot.ag;

public class Address {
	String plotno;
	String area;
	String dist;
	String pincode;
	
	public Address(String plotno, String area,String dist,String pincode) {
		this.plotno = plotno;
		this.area = area;
		this.dist = dist;
		this.pincode = pincode;
	}
	public void printData() {
		System.out.print(plotno);
		System.out.print(area);
		System.out.print(dist);
		System.out.print(pincode);
	}
	
	

}
