package com.liang.helloThymeleaf.domain;
import javax.validation.constraints.NotNull;

public class Student {
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	public Student() {
		super();
	}
	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
