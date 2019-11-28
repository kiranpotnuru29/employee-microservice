package com.employee.domain;

public class Employee {

	private int Id;
	private String firstName;
	private String lastName;
	private String middleName;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, String middleName) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
