package com.collection2.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MovieDetailsListTest {

	MovieDetails jumanji=new MovieDetails("Jumanji","Rock","Karen","Adventure");
	MovieDetails avengers=new MovieDetails("Avengers","Chris Evans","Scarlett","Sci-fi");
	MovieDetails ironman=new MovieDetails("IronMan","Robert DJ","Brie","Adventure,Sci-fi");
	MovieDetailsList movies=new MovieDetailsList();
	@BeforeEach
	void setMovie() {
		movies.addMovie(ironman);
		movies.addMovie(jumanji);
		movies.addMovie(avengers);
	}
	@Test
	@DisplayName("Adding movies")
	void test1() {
		
		assertEquals(3,movies.getMovies().size());
	}
//	@Test
//	@DisplayName("Displaying movies")
//	void test6() {
//		movies.diaplayMovie();
//	}
	
	@Test
	@DisplayName("Finding movies by name")
	void test2() {
		assertEquals(true,movies.findMovieByMovName("avengers"));
	}
	
	@Test
	@DisplayName("Finding movies by genre")
	void test3() {
		assertEquals(true,movies.findMovieByGenre("Sci-fi"));
	}
	
	@Test
	@DisplayName("Removing movies")
	void test4() {
		movies.removeMovie(jumanji);
		assertEquals(2,movies.getMovies().size());
	}
	
	@Test
	@DisplayName("Removing all movies")
	void test5() {
		movies.removeAllMovies();
		assertEquals(0,movies.getMovies().size());
	}
	
	@Test
	@DisplayName("Movies sorted based on Genre")
	void test6() {
		MovieDetailsList.sortMoviesBasedOn("Genre");
		assertTrue(movies.diaplayMovie());
	}
	
	@Test
	@DisplayName("Movies sorted based on name")
	void test7() {
		MovieDetailsList.sortMoviesBasedOn("Name");
		assertTrue(movies.diaplayMovie());
	}


}
