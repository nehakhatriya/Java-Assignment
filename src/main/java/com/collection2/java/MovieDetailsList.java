package com.collection2.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class MovieDetailsList {
  private static Set<MovieDetails> movies;
  
  public MovieDetailsList() {
	  this.movies=new TreeSet<MovieDetails>();
  }
  
  public Set<MovieDetails> getMovies(){
	  return movies;
  }
  
  public static void sortMoviesBasedOn(String val) {  
	  Set<MovieDetails> movie=new TreeSet<MovieDetails>();
	  movie.addAll(movies);
	  if(val.equalsIgnoreCase("Genre")) {
		  movies=new TreeSet<MovieDetails>(new MyComparator().new Genre());  
	  }	  
	  else if(val.equalsIgnoreCase("Name")) {
		  movies=new TreeSet<MovieDetails>(new MyComparator().new Name());
	  }
	  movies.addAll(movie);	
  }

  public void addMovie(MovieDetails mov) {
	  movies.add(mov);
  }
  public void removeMovie(MovieDetails mov) {
	  movies.remove(mov);
  }
  public void removeAllMovies() {
	  movies.clear();
  }
  
  public boolean findMovieByMovName(String name) {
	  for(MovieDetails m:movies) {
		  if(m.getMovName().equalsIgnoreCase(name))
		  {
			  System.out.println("Movie Name: "+m.getMovName()+" Actor: "+m.getLeadActor()+" Actress: "+m.getLeadActress()+" Genre: "+m.getGenre());
			  return true;
		  }
	  }
	  return false;
	  
  }
  public boolean findMovieByGenre(String genre) {
	  int flag=0;
	  for(MovieDetails m:movies) {
		  flag=0;
		  if(m.getGenre().contains(genre))
		  {
			  System.out.println("Movie Name: "+m.getMovName()+" Actor: "+m.getLeadActor()+" Actress: "+m.getLeadActress()+" Genre: "+m.getGenre());
			  flag=1;
		  }	  
	  }
	  if(flag==1)return false;
	  else return true;
  }
  
  public void diaplayMovie() {
	  for(MovieDetails m : movies) {
		  System.out.println(m.getMovName()+" "+m.getLeadActor()+" "+m.getLeadActress()+" "+m.getGenre());
	  }
  }
  
}
