package manager.abstracts;

import entities.entity.User;

public interface Manager {
	void singUp(User user);
	void delete(User user);
	void update(User user);
}	
