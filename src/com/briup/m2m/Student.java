package com.briup.m2m;

import java.util.List;

import org.apache.ibatis.type.Alias;
@Alias("stu")
public class Student {
	private int id;
	private String name;
	private int age;
	private String phone;
	private List<Teacher> teachers;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, String phone, List<Teacher> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.teachers = teachers;
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
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", teachers=" + teachers
				+ "]";
	}
}
