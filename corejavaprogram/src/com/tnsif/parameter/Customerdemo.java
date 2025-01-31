package com.tnsif.parameter;

import java.util.Scanner;

public class Customerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the rollno");
		int rollno=sc.nextInt();
		System.out.println("enter the address");
		String address=sc.next();
		
		Customer c=new Customer();
		
		c.setName(name);
		c.setRollno(rollno);
		c.setAddress(address);
		
		System.out.println(c);
	}

}
