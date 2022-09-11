package com.liang.helloThymeleaf.model;

public class helloThymeleaf {
	private String name;
	private Integer age;

	
	public helloThymeleaf() {
		super();
	}

	

	public helloThymeleaf(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String toString() {
		return "helloThymeleaf [name=" + name + ", age=" + age + "]";
	}
}
