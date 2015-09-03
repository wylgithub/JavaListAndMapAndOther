package com.JavaList;

public class Person {
	//定义人的姓名
	private String userName;
	//定义人的年龄
	private int userAge;
	//定义人的性别
	private String userSex;
	//给人类提供一个有参数的构造方法
	public Person(String userName, int userAge, String userSex){
		this.userName = userName;
		this.userAge = userAge;
		this.userSex = userSex;
	}
	/*
	 * 生成getter和setter
	 */
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userAge
	 */
	public int getUserAge() {
		return userAge;
	}
	/**
	 * @param userAge the userAge to set
	 */
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	/**
	 * @return the userSex
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * @param userSex the userSex to set
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
}
