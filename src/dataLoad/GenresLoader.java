package dataLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import dataModel.Genre;


public class GenresLoader  
{
	public static ArrayList<String> load(){
		
		
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner inputStream = new Scanner(new FileInputStream("./input/movie_genres.dat"));
			while (inputStream.hasNextLine( )){
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
	
	public HashMap<Integer,ArrayList<Genre>> GenresByMoviesHashMap()
	{
		ArrayList<String> datafile = load();
		HashMap<Integer,ArrayList<Genre>> GenresByMovies = new HashMap<Integer,ArrayList<Genre>>();
		
		int movieID;
		String genre;
		
		for(int i = 0;i<datafile.size();i++)
		{
			String[] array = datafile.get(i).split("\t");
			movieID=Integer.parseInt(array[0]);
			genre=array[1];
			
			Genre g=new Genre(movieID, genre);
			if(GenresByMovies.containsKey(movieID))
				GenresByMovies.get(movieID).add(g);
			else
			{
				ArrayList<Genre> lista=new ArrayList<Genre>(); 
				lista.add(g);
				GenresByMovies.put(movieID,lista);
			}
		}
		return  GenresByMovies;
	}

}