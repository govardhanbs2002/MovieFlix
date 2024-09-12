package com.movieFlix.services;

import java.util.List;
import com.movieFlix.enteties.Movie;


public interface MovieService {
	
	public String addMovie(Movie mov);
	
	public List<Movie> viewMovie();
}
