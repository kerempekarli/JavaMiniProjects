package dataAccess.concrete;

import dataAccess.abstracts.UserDao;
import entities.entity.User;

public class HybernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName() + "add to system successfully");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + "deleted from system successfully");		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + "updated successfully");		
	}

}
