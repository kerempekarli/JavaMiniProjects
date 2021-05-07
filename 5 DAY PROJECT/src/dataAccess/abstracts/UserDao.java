package dataAccess.abstracts;

import entities.entity.User;

public interface UserDao {
	void add(User user);
	void delete(User user); 
	void update(User user);
}
