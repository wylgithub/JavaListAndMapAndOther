package com.JavaList;

public class Person {
	//�����˵�����
	private String userName;
	//�����˵�����
	private int userAge;
	//�����˵��Ա�
	private String userSex;
	//�������ṩһ���в����Ĺ��췽��
	public Person(String userName, int userAge, String userSex){
		this.userName = userName;
		this.userAge = userAge;
		this.userSex = userSex;
	}
	/*
	 * ����getter��setter
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
