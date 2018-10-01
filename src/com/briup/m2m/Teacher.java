package com.briup.m2m;

import java.util.List;

public class Teacher {
	private int id;
	private String name;
	private int age;
	private String phone;
	private List<Student> students;
	public Teacher(int id, String name, int age, String phone, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.students = students;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", students=" + students
				+ "]";
	}
	
	

}
