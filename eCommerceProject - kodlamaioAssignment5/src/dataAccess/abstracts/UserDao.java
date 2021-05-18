package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user, int index);
	void delete(User user, int index);
	User getInfo(int id);
	List<User> getAll();
}
