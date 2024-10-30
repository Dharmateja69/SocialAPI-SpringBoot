package com.klu.model;

public class Users {

	private String id;
    private String firstname;
    private String lastname;
    private Location location;
    private String email;
	public String getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public Location getLocation() {
		return location;
	}
	public String getEmail() {
		return email;
	}
	
	public Users(String id,String firstname,String lastname,Location location, String email)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.location=location;
		this.email=email;
	}

	
	
}
