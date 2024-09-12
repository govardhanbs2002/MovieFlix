package com.movieFlix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieFlix.enteties.User;
import com.movieFlix.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	@Autowired
	UserRepository urepo;
	
	@Override
	public String addUsers(User usr) {
		urepo.save(usr);
		return "user is created";
	}

	@Override
	public boolean emailExists(String email) {
		if(urepo.findByEmail(email)==null)
			return false;
		else
			return true;
	}

	@Override
	public boolean checkUser(String email, String password) {
		
		User usr=urepo.findByEmail(email);
		String db_password=usr.getPassword();
		
		if(db_password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<User> viewUser() {
		
		List<User>userList=urepo.findAll();
		return userList;
	}

	@Override
	public User getUser(String email) {
		User user=urepo.findByEmail(email);
		return user;
	}

	@Override
	public void updateUser(User user) {
		urepo.save(user);		
	}
}
