package com.movieFlix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieFlix.enteties.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	//Method to find user
	public User findByEmail(String email);
}
