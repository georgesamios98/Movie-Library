package dataLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LocationsLoader 
{

	public static ArrayList<String> load()
	{	
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner inputStream = new Scanner(new FileInputStream("./input/movie_locations.dat"));
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
	
	public HashMap<Integer,ArrayList<String>> LocationsByMoviesHashMap()
	{
		ArrayList<String> datafile = load();
		HashMap<Integer,ArrayList<String>> LocationsByMovies= new HashMap<Integer,ArrayList<String>>();
		
		for(int i=0;i<datafile.size();i++)
		{
            
        	String[] array = datafile.get(i).split("\t");
            if(array.length>1){
            	
            
            	int id = Integer.parseInt(array[0]);
            	String location ="";
            	for (int j =1;j<array.length;j++)
            	{
            		location = location +" "+ array[j];
            	}      
            
	            if(LocationsByMovies.containsKey(id))
	            {
	            	LocationsByMovies.get(id).add(location);
	           	}
	           	else
	           	{
	           		ArrayList<String> newList = new ArrayList<>();
	           		newList.add(location);
	           		LocationsByMovies.put(id, newList);
	           	}
           	}
            
    	}
        
            return LocationsByMovies;
        
	}
	
	
}
