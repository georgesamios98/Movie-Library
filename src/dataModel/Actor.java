package dataModel;
import java.util.ArrayList;


public class Actor
{
	private static int movieID;
	private String actorID;
	private String actorname;
	private int ranking;
	
	private ArrayList<Movie> moviesByActors;

	public Actor(String actorID, String actorname, int ranking)
	{
		this.actorID = actorID;
		this.actorname = actorname;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Actor [actorID=" + actorID + ", actorname=" + actorname + ", ranking=" + ranking + "]";
	}
	
	
	


}