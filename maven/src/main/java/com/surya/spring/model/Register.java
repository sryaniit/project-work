package com.surya.spring.model;

import java.util.List;

public class Register {
	private String name;
	private String password;
	private String gender;
	private String country;
	private List<Register> countryList;
	private String aboutYou;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List getCountryList() {
		return countryList;
	}
	public void setCountryList(List countryList) {
		this.countryList = countryList;
	}
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	

}
