package business.concerets;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Override
	public void register(User user) {
		if(checkValidty(user)) {
			System.out.println("Validty of the user is confirmed: id: " + user.getId() + "\tname: " + user.getName());
			userDao.add(user);
			System.out.println("User with the id " + user.getId() + " is registered to the system.");
			return;
		}else {
			System.err.println("User with the id " + user.getId() + " could not be registered to the system.");
			System.err.println("Your input is not valid!\nPlease check your input and try again!");
		}
	}
	
	// general validity check method:
	@Override
	public boolean checkValidty(User user) {
		
		if(checkPasswordValidty(user.getPassword()) & checkMailValidty(user.getEmail()) & checkInfoValidty(user))		
			return true;
		return false;
	}

	// checks whether the password is at least 6 characters:
	@Override
	public boolean checkPasswordValidty(String password) {
		int length = password.length();
		if(length < 6) {
			System.err.println(password + " password is not valid!");
			return false;
		}
		return true;
	}


	// checks whether the mail is in the right format and whether it is used before or not:
	@Override
	public boolean checkMailValidty(String mail) {
	
		boolean matchFound = mail.matches("[a-z|0-9]+@gmail.com");
		if(matchFound)
			return true;
		else
			System.err.println(mail + " mail is not valid!");
			return false;
	}

	// checks whether the name and the surname consist of at least 2 characters:
	@Override
	public boolean checkInfoValidty(User user) {
		String name = user.getName();
		String surname = user.getSurname();
		int length1 = name.length();
		int length2 = surname.length();
		if(length1 > 1 & length2 > 1)
			return true;
		else {
			System.err.println("Either name " + user.getName() + " or the surname " + user.getSurname() + " of the user is not valid!");
			return false;
		}
		
	}


	@Override
	public void sendConfirmationMail(User user) {
		System.out.println("Confirmation mail is sent to the user with id " + user.getId());		
	}


	@Override
	public void finishTheRegistiration(User user) {
		System.out.println("Registration is complete! Welcome to the heart of E-Commerce! Enjoy your time!");
	}


}
