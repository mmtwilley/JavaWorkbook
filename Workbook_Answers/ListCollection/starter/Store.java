import java.util.ArrayList;

public class Store {

    private ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        movies.add(index, movie);
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
