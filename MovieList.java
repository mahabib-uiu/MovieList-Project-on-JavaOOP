public class MovieList {
    private Movie[] movies;
    private int count;
    
    public MovieList() {
        movies = new Movie[100]; // Array size of 100
        count = 0;
    }
    
    public void addMovie(Movie movie) {
        if (count < 100) {
            movies[count] = movie;
            count++;
            System.out.println("Movie added successfully!");
        } else {
            System.out.println("Movie list is full!");
        }
    }
    
    public void viewMovieList() {
        System.out.println("Movie List:");
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i].getTitle() + " (" + movies[i].getYearOfRelease() + ")");
            System.out.println("Director: " + movies[i].getDirectorName());
            System.out.println("Production House: " + movies[i].getProductionHouse());
            System.out.println();
        }
    }
}
