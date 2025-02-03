package com.tnsif.polymorpism;

public class Methodoverloading {
	int add(int a,int b) {
	return a+b;
	}

	int add(int a,int b,int c) {
	return a+b+c;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Methodoverloading m=new  Methodoverloading();
		System.out.println(m.add(2,4));
		System.out.println(m.add(4,5,6));
	}
}
