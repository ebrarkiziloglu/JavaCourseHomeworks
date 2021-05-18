package registerWithOtherServices.concretes;

import business.abstracts.UserService;
import entities.concretes.User;
import registerWithOtherServices.abstracts.OtherRegister;

public class GoogleRegister implements OtherRegister{
	
	public UserService userService;
	
	public GoogleRegister(UserService userManager) {
		this.userService = userManager;
	}

	@Override
	public void register(User user) {
		if(userService.checkValidty(user))
			userService.register(user);
			System.out.println("User with id " + user.getId() + " is successfully registered to the system via Google.");
		
	}
	
}
