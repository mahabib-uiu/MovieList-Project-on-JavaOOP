import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieList movieList = new MovieList();
        
        while (true) {
            System.out.println("1. Add Movie");
            System.out.println("2. View Movie List");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Movie Title: ");
                    scanner.nextLine(); // Consume newline
                    String title = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter Director's Name: ");
                    scanner.nextLine(); // Consume newline
                    String director = scanner.nextLine();
                    System.out.print("Enter Production House: ");
                    String productionHouse = scanner.nextLine();
                    
                    Movie newMovie = new Movie(title, year, director, productionHouse);
                    movieList.addMovie(newMovie);
                    break;
                    
                case 2:
                    movieList.viewMovieList();
                    break;
                    
                case 3:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
