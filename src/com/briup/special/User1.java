package com.briup.special;

public class User1 {
	private Integer id; 
	private String name; 
	private Gender gender;
	
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(Integer id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	

}
