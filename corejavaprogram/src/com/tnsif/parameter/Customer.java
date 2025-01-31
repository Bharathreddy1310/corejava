package com.tnsif.parameter;

public class Customer {
	
	private String name;
	private int rollno;
	private String address;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String name, int rollno, String address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
	}

	
	}

