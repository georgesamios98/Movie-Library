package dataLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dataModel.Actor;

public class ActorsLoader
{
	public static ArrayList<String> load(){
		
			
			try
			{
				ArrayList<String> list = new ArrayList<String>();
				Scanner inputStream = new Scanner(new FileInputStream("./input/movie_actors.dat"));
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
	public HashMap<Integer,ArrayList<Actor>> ActorsByMoviesHashMap()
	{
		ArrayList<String> datafile = load();
		HashMap<Integer,ArrayList<Actor>> ActorsByMovies = new HashMap<Integer,ArrayList<Actor>>();
		
		int movieID;
		String actorID;
		String actorname;
		int ranking;
		
		for(int i = 0;i<datafile.size();i++)
		{
			String[] array = datafile.get(i).split("\t");
			movieID = Integer.parseInt(array[0]);
			actorID = array[1];
			actorname = array[2];
			ranking = Integer.parseInt(array[3]);
			
			Actor a = new Actor(actorID, actorname, ranking);
			if(ActorsByMovies.containsKey(movieID))
				ActorsByMovies.get(movieID).add(a);
			else
			{
				ArrayList<Actor> lista=new ArrayList<Actor>(); 
				lista.add(a);
				ActorsByMovies.put(movieID,lista);
			}
		}
		return  ActorsByMovies;
	}
	

}
