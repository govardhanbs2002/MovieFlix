package com.movieFlix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieFlix.enteties.Movie;

public interface MovieRepository extends JpaRepository<Movie ,Integer> {

	

}
