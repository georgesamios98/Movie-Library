package dataModel;

import java.util.ArrayList;


public class Genre
{
	private int movieID;
	private String genre;


	private ArrayList<Movie> moviesByGenres;
	
	
	public Genre(int movieID,String genre)
	{
		this.movieID=movieID;
		this.genre=genre;
	}


	@Override
	public String toString() {
		return "Genre [genre=" + genre + "]";
	}
	
	
}
