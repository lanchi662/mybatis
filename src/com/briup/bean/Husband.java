package com.briup.bean;

import org.apache.ibatis.type.Alias;

@Alias("hus")
public class Husband {
	private Integer id;
	private String name;
	private Wife wife;
	
	public Husband() {
	}
	
	public Husband( String name,Wife wife) {
		super();
		this.name = name;
		this.wife=wife;
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
	
	
	
	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
	
	
}
