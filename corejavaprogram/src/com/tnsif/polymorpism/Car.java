package com.tnsif.polymorpism;

public class Car extends Vehicle{
	void move() {
		System.out.println("sigma");
		
	}
	void display() {
		super.move();
		move();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.display();
	}

}
