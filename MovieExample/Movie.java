
public class Movie {

	private String title;
	private String genre;
	private int rating;

	public Movie(String movieTitle, String movieGenre, int movieRating){
		title = movieTitle;
		genre = movieGenre;
		rating = movieRating;
	}

	public String getTitle (){
		return title;
	}

	public void setTitle(String movieTitle){
		title = movieTitle;
	}

	public String getGenre (){
		return genre;
	}

	public void setGenre(String movieGenre){
		title = movieGenre;
	}

	public int getRating(){
		return rating;
	}

	public void setRating(int movieRating){
		rating = movieRating;
	}
	
	public void playIt(){
		System.out.println(title + "- Now Playing");
	}
}
