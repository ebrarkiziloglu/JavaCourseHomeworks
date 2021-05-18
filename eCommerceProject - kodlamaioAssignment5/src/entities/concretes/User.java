package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private static int count = 0;
	
	// following fields are mandatory:
	private String name;
	private String surname;
	private String email;
	private String password;

	
	public User(String name, String surname, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.id = count;
		count++;
	}
	
	public int getId() {
		return id;
	}
	public static int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}