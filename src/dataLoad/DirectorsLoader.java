package dataLoad;
import dataModel.Director;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DirectorsLoader
{
	public static ArrayList<String> load()
	{	
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner inputStream = new Scanner(new FileInputStream("./input/movie_directors.dat"));
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
	
	public HashMap<Integer,Director> DirectorsByMoviesHashMap()
	{
		ArrayList<String> datafile = load();
		HashMap<Integer,Director> DirectorsByMovies = new HashMap<Integer,Director>();
		
		int movieID;
		String directorID;
		String directorname;
		for(int i = 0;i<datafile.size();i++)
		{
			String[] array = datafile.get(i).split("\t");
			movieID = Integer.parseInt(array[0]);
			directorID = array[1];
			directorname = array[2];
			
			
			Director d = new Director(directorID, directorname);
			
			DirectorsByMovies.put(movieID,d);
			
		}
		return DirectorsByMovies;		
	}
}