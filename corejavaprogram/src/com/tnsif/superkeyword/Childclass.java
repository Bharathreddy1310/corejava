package com.tnsif.superkeyword;

public class Childclass extends Parentdemo {
	int a=3;
	
	void drink() {
		System.out.println("coffee");
	}
	void display(){
		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childclass d=new Childclass();
		d.drink();
		d.display();
		
		
	}

}
