package com.movieFlix.services;

import java.util.List;

import com.movieFlix.enteties.User;

public interface UserService {
	public String addUsers(User usr);
	public boolean emailExists(String email);
	public boolean checkUser(String email,String password);
	public List<User> viewUser();
	public User getUser(String email);
	public void updateUser(User user);
}
