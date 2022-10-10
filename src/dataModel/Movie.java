package dataModel;
import java.util.ArrayList;

public class Movie
{
	private int movieID;
	private String title;
	private int imdbID;
	private String spanishTitle;
	private String imdbPictureURL;
	private int year;
	private String rtID;
	private double rtAllCriticsRating;
	private double rtAllCriticsNumReviews;
	private double rtAllCriticsNumFresh;
	private double rtAllCriticsNumRotten;
	private double rtAllCriticsScore;
	private double rtTopCriticsRating;
	private double rtTopCriticsNumReviews;
	private double rtTopCriticsNumFresh;
	private double rtTopCriticsNumRotten;
	private double rtTopCriticsScore;
	private double rtAudienceRating;
	private double rtAudienceNumRatings;
	private double rtAudienceScore;
	private String rtPictureURL;
	
	private ArrayList<Actor> actors;
	private Director director;
	private Country country;
	private ArrayList<Genre> genres;
	private ArrayList<String> locations;
	
	public Movie(int movieID, String title, int imdbID, String spanishTitle, String imdbPictureURL, int year,
			String rtID, double rtAllCriticsRating, double rtAllCriticsNumReviews, double rtAllCriticsNumFresh,
			double rtAllCriticsNumRotten, double rtAllCriticsScore, double rtTopCriticsRating,
			double rtTopCriticsNumReviews, double rtTopCriticsNumFresh, double rtTopCriticsNumRotten,
			double rtTopCriticsScore, double rtAudienceRating, double rtAudienceNumRatings, double rtAudienceScore,
			String rtPictureURL) {
		
		this.movieID = movieID;
		this.title = title;
		this.imdbID = imdbID;
		this.spanishTitle = spanishTitle;
		this.imdbPictureURL = imdbPictureURL;
		this.year = year;
		this.rtID = rtID;
		this.rtAllCriticsRating = rtAllCriticsRating;
		this.rtAllCriticsNumReviews = rtAllCriticsNumReviews;
		this.rtAllCriticsNumFresh = rtAllCriticsNumFresh;
		this.rtAllCriticsNumRotten = rtAllCriticsNumRotten;
		this.rtAllCriticsScore = rtAllCriticsScore;
		this.rtTopCriticsRating = rtTopCriticsRating;
		this.rtTopCriticsNumReviews = rtTopCriticsNumReviews;
		this.rtTopCriticsNumFresh = rtTopCriticsNumFresh;
		this.rtTopCriticsNumRotten = rtTopCriticsNumRotten;
		this.rtTopCriticsScore = rtTopCriticsScore;
		this.rtAudienceRating = rtAudienceRating;
		this.rtAudienceNumRatings = rtAudienceNumRatings;
		this.rtAudienceScore = rtAudienceScore;
		this.rtPictureURL = rtPictureURL;
	}

	public String getTitle() {
		return title;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}
	
	public void setLocations(ArrayList<String> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", title=" + title + ", imdbID=" + imdbID + ", spanishTitle="
				+ spanishTitle + ", imdbPictureURL=" + imdbPictureURL + ", year=" + year + ", rtID=" + rtID
				+ ", rtAllCriticsRating=" + rtAllCriticsRating + ", rtAllCriticsNumReviews=" + rtAllCriticsNumReviews
				+ ", rtAllCriticsNumFresh=" + rtAllCriticsNumFresh + ", rtAllCriticsNumRotten=" + rtAllCriticsNumRotten
				+ ", rtAllCriticsScore=" + rtAllCriticsScore + ", rtTopCriticsRating=" + rtTopCriticsRating
				+ ", rtTopCriticsNumReviews=" + rtTopCriticsNumReviews + ", rtTopCriticsNumFresh="
				+ rtTopCriticsNumFresh + ", rtTopCriticsNumRotten=" + rtTopCriticsNumRotten + ", rtTopCriticsScore="
				+ rtTopCriticsScore + ", rtAudienceRating=" + rtAudienceRating + ", rtAudienceNumRatings="
				+ rtAudienceNumRatings + ", rtAudienceScore=" + rtAudienceScore + ", rtPictureURL=" + rtPictureURL
				+ ", actors=" + actors + ", director=" + director + ", country=" + country + ", genres=" + genres
				+ ", locations=" + locations + "]";
	}
	
	
}
