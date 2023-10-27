package com.cg.bookstore.repository;

import com.cg.bookstore.entities.User;

public interface ILoginRepository {

	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
}
