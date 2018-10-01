package com.briup.bean;

public class Address {
	private String privoce;
	private String city;
	private String stress;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String privoce, String city, String stress) {
		super();
		this.privoce = privoce;
		this.city = city;
		this.stress = stress;
	}
	public String getPrivoce() {
		return privoce;
	}
	public void setPrivoce(String privoce) {
		this.privoce = privoce;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStress() {
		return stress;
	}
	public void setStress(String stress) {
		this.stress = stress;
	}
	@Override
	public String toString() {
		return "Address [privoce=" + privoce + ", city=" + city + ", stress=" + stress + "]";
	}
	

}
