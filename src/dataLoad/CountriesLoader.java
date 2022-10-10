package dataLoad;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dataModel.Country;


public class CountriesLoader  
{
	public static ArrayList<String> load()
	{	
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner inputStream = new Scanner(new FileInputStream("./input/movie_countries.dat"));
			while (inputStream.hasNextLine( ))
			{
				String line = inputStream.nextLine();
	         	list.add(line);
	        }      
	        list.remove(0);
	        inputStream.close();
			return list;
			
		
		}
		catch (FileNotFoundException e)
		{
			System.err.println(e);
			return null;
		}

	}
	public HashMap<Integer,Country> CountriesByMovies(){
		ArrayList<String> datafile = load();
		HashMap<Integer,Country> CountriesByMovies = new HashMap<Integer,Country>();
		
		int movieID;	
		String country;
		
		for(int i = 0;i<datafile.size();i++)
		{
			
			String[] array = datafile.get(i).split("\t");
			movieID = Integer.parseInt(array[0]);
			country = array[1];
			
			
			Country c = new Country(movieID, country);
			
			CountriesByMovies.put(movieID,c);
			
		}
		return CountriesByMovies;
	}
}
