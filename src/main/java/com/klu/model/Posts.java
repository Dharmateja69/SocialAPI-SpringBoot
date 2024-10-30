package com.klu.model;

public class Posts {

	private String id;
	   private String postdate;
	   private Users users;
	   private String details;
	public String getId() {
		return id;
	}
	
	public String getPostdate() {
		return postdate;
	}
	
	public Users getUsers() {
		return users;
	}
	
	public String getDetails() {
		return details;
	}
	
	
	public Posts(String id,String postdate,Users users,String details)
	{
		this.id=id;
		this.postdate=postdate;
		this.users=users;
		this.details=details;
	}
	
}
