package com.briup.m2m;


public class TeaandStu {
	private int id;
	private int stuId;
	private int teaId;
	public TeaandStu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeaandStu(int id, int stuId, int teaId) {
		super();
		this.id = id;
		this.stuId = stuId;
		this.teaId = teaId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	@Override
	public String toString() {
		return "TeaandStu [id=" + id + ", stuId=" + stuId + ", teaId=" + teaId + "]";
	}
	


}
