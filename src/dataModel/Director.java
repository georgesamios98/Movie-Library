package dataModel;
import java.util.ArrayList;

public class Director
{
	private static int movieID;
	private String directorID;
	private String directorname;
	
	private ArrayList<Movie> moviesByDirectors;
	
	public Director(String directorID,String directorname) 
	{
		this.directorID=directorID;
		this.directorname=directorname;
	}

	@Override
	public String toString() {
		return "Director [directorID=" + directorID + ", directorname=" + directorname + "]";
	}
	
}
