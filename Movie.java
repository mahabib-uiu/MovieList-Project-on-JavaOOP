public class Movie {
    private String title;
    private int yearOfRelease;
    private String directorName;
    private String productionHouse;
    
    // Constructor
    public Movie(String title, int yearOfRelease, String directorName, String productionHouse) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.directorName = directorName;
        this.productionHouse = productionHouse;
    }
    
    // Getters for attributes
    public String getTitle() {
        return title;
    }
    
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    
    public String getDirectorName() {
        return directorName;
    }
    
    public String getProductionHouse() {
        return productionHouse;
    }
}
