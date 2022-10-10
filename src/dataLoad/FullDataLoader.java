package dataLoad;

import dataModel.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FullDataLoader 
{
	private HashMap<Integer,Movie> movies;
		
	private MoviesLoader movieLoader;
	private ActorsLoader actorsLoader;
	private DirectorsLoader directorsLoader;
	private GenresLoader genreLoader;
	
	private LocationsLoader locationsLoader;
	private CountriesLoader countriesLoader;
	
	public FullDataLoader()
	{
		actorsLoader = new ActorsLoader();
		directorsLoader = new DirectorsLoader();
		locationsLoader = new LocationsLoader();
		countriesLoader = new CountriesLoader();		
		movieLoader = new MoviesLoader();		
		genreLoader = new GenresLoader();
	}
	
	
	public void loadData()
	{
		movies = movieLoader.movieHashMap();
		
		HashMap<Integer, ArrayList<Actor>> Actors = actorsLoader.ActorsByMoviesHashMap();
		HashMap<Integer, Director> Directors = directorsLoader.DirectorsByMoviesHashMap();
		HashMap<Integer, ArrayList<Genre>> Genres = genreLoader.GenresByMoviesHashMap();
		HashMap<Integer, Country> Countries = countriesLoader.CountriesByMovies();
		HashMap<Integer,ArrayList<String>> Locations = locationsLoader.LocationsByMoviesHashMap();

		for(int id: movies.keySet()){
			movies.get(id).setActors(Actors.get(id));
			movies.get(id).setDirector(Directors.get(id));
			movies.get(id).setCountry(Countries.get(id));
			movies.get(id).setLocations(Locations.get(id));
			movies.get(id).setGenres(Genres.get(id));
		}
		
	}

	public Movie getMovie(int id){
		return movies.get(id);
	}


}
