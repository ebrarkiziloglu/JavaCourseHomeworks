package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class StoreUserDao implements UserDao {

	private List<User> allUsers = new ArrayList<User>();
	private static int count = 0;

	

	public List<User> getAllUsers() {
		return allUsers;
	}
	public static int getCount() {
		return count;
	}
	
	@Override
	public void add(User user) {
		allUsers.add(user);
		System.out.println("User with the name " +user.getName() + " is added.");
		count++;
		
	}

	@Override
	public void update(User user, int index) {
		allUsers.set(index, user);
		System.out.println("Information of the user with the name " +user.getName() + " is updated.");
	}

	@Override
	public void delete(User user, int index) {
		allUsers.remove(index);
		System.out.println("User with the name " +user.getName() + " is removed.");
		
	}

	@Override
	public User getInfo(int id) {
		String name = allUsers.get(id).getName();
		String surname = allUsers.get(id).getSurname();
		System.out.println("Here is the name and the surname of the user: " + name + " " + surname );
		return allUsers.get(id);
	}

	@Override
	public List<User> getAll() {
		int index = 0;
		System.out.println("All users in the database is given:");
		for(User user : allUsers) {
			System.out.println("Name of the user with index " + index + " is: " + user.getName() + " " + user.getSurname());
			index ++;
		}
		return allUsers;
	}

}
