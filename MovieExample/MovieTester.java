import java.util.Scanner;


public class MovieTester {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Movie[] movies;
		movies = new Movie[3];
		
		//counter-controlled loop
		for (int i = 0; i < 3; i++){
			
			System.out.println("Please enter the title for movie " + (i + 1) + ":");
			String title = input.nextLine();
			
			System.out.println("Please enter the genre for movie " + (i + 1) + ":");
			String genre = input.nextLine();
			
			System.out.println("Please enter the rating (1-5) for movie " + (i + 1) + ":");
			int rating = input.nextInt();
			
			Movie movie = new Movie(title, genre, rating);
			movies[i] = movie;
		}
		
		//Using counter-contolled loop
		for (int i = 0; i < movies.length; i++){
			System.out.println("Movie " + (i + 1) + "\tTitle: " + movies[i].getTitle() );
			System.out.println("Movie " + (i + 1) + "\tGenre: " + movies[i].getGenre() );
			System.out.println("Movie " + (i + 1) + "\tRating: " + movies[i].getRating() );
			movies[i].playIt();
		}
		
		
		//Using enhanced for loop 
		//Enhanced for loop
		for (Movie movie : movies){
			
			System.out.println("Movie \tTitle: " + movie.getTitle());
			System.out.println("Movie \tGenre: " + movie.getGenre());
			System.out.println("Movie \tRating: " + movie.getRating());
			movie.playIt();
		}
		
		
		
		
	}

}
