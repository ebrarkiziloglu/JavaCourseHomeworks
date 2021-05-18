package main;

import business.abstracts.UserService;
import business.concerets.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.StoreUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user0 = new User("Ebrar", "Kizil", "ebrarkizil@gmail.com", "ebrarebrar");
		
		User user1 = new User("Ali", "Yilmaz", "ylmz.ylmz@gmail.com", "aliylmzz");
		
		User user2 = new User("Veli", "Simsek", "vs@gmail.com", "abcdefgh");
		
		UserDao storeUserDao = new StoreUserDao();
		UserService userAdder = new UserManager(storeUserDao);
		
		userAdder.register(user0);
		userAdder.register(user1);
		userAdder.register(user2);

	}

}
