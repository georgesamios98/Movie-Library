package dataModel;

import java.util.ArrayList;


public class Country
{
	private int movieID;	
	private String country;
	
	private ArrayList<Movie> movies;

	public Country(int movieID, String country) {
		this.movieID = movieID;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}
	
	
	


	
}
