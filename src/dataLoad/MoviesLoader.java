package dataLoad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import dataModel.Movie;

public class MoviesLoader 
{
	public static ArrayList<String> load(){
	
		
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner inputStream = new Scanner(new FileInputStream("./input/movies.dat"));
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
		

	
	
	public HashMap<Integer,Movie> movieHashMap()
	{
		ArrayList<String> datafile = load();
		HashMap<Integer,Movie> movies = new HashMap<Integer,Movie>();
		
		
		for(int i = 0;i<datafile.size();i++){
			String[] array = datafile.get(i).split("\t");
			
			int movieid =Integer.parseInt(array[0]);
			String title = array[1];
			int imdbID = Integer.parseInt(array[2]);
			String spanishTitle =  array[3];
			String imdbPictureURL =  array[4];
			int year = Integer.parseInt(array[5]);
			String rtID = array[6];
			double rtAllCriticsRating = Double.parseDouble(array[7]);
			double rtAllCriticsNumReviews = Double.parseDouble(array[8]);
			double rtAllCriticsNumFresh = Double.parseDouble(array[9]);
			double rtAllCriticsNumRotten = Double.parseDouble(array[10]);
			double rtAllCriticsScore = Double.parseDouble(array[11]);
			double rtTopCriticsRating = Double.parseDouble(array[12]);
			double rtTopCriticsNumReviews = Double.parseDouble(array[13]);
			double rtTopCriticsNumFresh = Double.parseDouble(array[14]);
			double rtTopCriticsNumRotten = Double.parseDouble(array[15]);
			double rtTopCriticsScore = Double.parseDouble(array[16]);
			double rtAudienceRating = Double.parseDouble(array[17]);
			double rtAudienceNumRatings = Double.parseDouble(array[18]);
			double rtAudienceScore = Double.parseDouble(array[19]);
			String rtPictureURL = array[20];
			
			
			Movie m = new Movie(movieid,title,imdbID,spanishTitle, imdbPictureURL, year, rtID, rtAllCriticsRating,rtAllCriticsNumReviews,rtAllCriticsNumFresh,
					rtAllCriticsNumRotten,rtAllCriticsScore,rtTopCriticsRating,rtTopCriticsNumReviews,rtTopCriticsNumFresh,rtTopCriticsNumRotten,
					rtTopCriticsScore,rtAudienceRating,rtAudienceNumRatings,rtAudienceScore,rtPictureURL);
			movies.put(movieid,m);
			}
		
		return movies;
	}
	


}