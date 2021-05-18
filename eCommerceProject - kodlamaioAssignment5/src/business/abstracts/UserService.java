package business.abstracts;

import entities.concretes.User;

public interface UserService {
	
	// here the user will be added to the database.
	void register(User user);
	// but before that, we need to make sure the validity of the user information:
	// general validity check method:
	boolean checkValidty(User user);
	
	// checks whether the password is at least 6 characters:
	boolean checkPasswordValidty(String password);
	
	// checks whether the mail is in the right format and whether it is used before or not:
	boolean checkMailValidty(String mail); 
	
	// checks whether the name and the surname consist of at least 2 characters:
	boolean checkInfoValidty(User user);
	
	// As e result of the registration, the confirmation mail is sent to the user:
	void sendConfirmationMail (User user);
	
	// If user clicks to the confirmation link, the registration is completed:
	void finishTheRegistiration(User user);
}
