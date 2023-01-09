package com.sample;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u=new User("kamilo");
	   System.out.println(u.getName());
	}

}

class User{
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name ;
}