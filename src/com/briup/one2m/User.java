package com.briup.one2m;

public class User {
	private int id;
	private String name;
	private int age;
	private String email;
	private String phone;
	private Group group;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String email, String phone, Group group) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.group = group;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone
				+ ", group=" + group + "]";
	}
	

}
