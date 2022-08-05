package com.CustomerManagement.Data;

public class ClassStGtMet {
	private int Id;
	private String Name;
	private int Amount;
	private int Age;
	public ClassStGtMet() {
		super();
	}
	public ClassStGtMet(int id, String name, int age, int amount) {
		super();
		Id = id;
		Name = name;
		Amount = amount;
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
