package com.student.dto;

public class Student {
	private int name;
	private String id;
	private String phone;
	private String address;

	public Student() {
		super();
	}

	public Student(int name, String id, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
