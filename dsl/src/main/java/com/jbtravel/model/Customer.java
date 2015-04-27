package com.jbtravel.model;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userid;

	private String address1;

	private String address2;

	private Integer age;

	private String alanResortsId;

	private String city;

	private String country;

	private String dHotelsId;

	private String emailaddress;

	private String firstname;

	private Integer frequentflyernumber;

	private String lastname;

	private String loyaltyLevel = "None";

	private String middlename;

	private String password;

	private Integer phonenumber;

	private String stateProv;

	private String username;

	private String zipPost;
	
	private Integer miles = 0;

	public Customer() {
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAlanResortsId() {
		return this.alanResortsId;
	}

	public void setAlanResortsId(String alanResortsId) {
		this.alanResortsId = alanResortsId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDHotelsId() {
		return this.dHotelsId;
	}

	public void setDHotelsId(String dHotelsId) {
		this.dHotelsId = dHotelsId;
	}

	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getFrequentflyernumber() {
		return this.frequentflyernumber;
	}

	public void setFrequentflyernumber(Integer frequentflyernumber) {
		this.frequentflyernumber = frequentflyernumber;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLoyaltyLevel() {
		return this.loyaltyLevel;
	}

	public void setLoyaltyLevel(String loyaltyLevel) {
		this.loyaltyLevel = loyaltyLevel;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getStateProv() {
		return this.stateProv;
	}

	public void setStateProv(String stateProv) {
		this.stateProv = stateProv;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getZipPost() {
		return this.zipPost;
	}

	public void setZipPost(String zipPost) {
		this.zipPost = zipPost;
	}

	@Override
	public String toString() {

		return this.firstname + " " + this.lastname;
	}

	public Integer getMiles() {
		return miles;
	}

	public void setMiles(Integer miles) {
		this.miles = miles;
	}

}