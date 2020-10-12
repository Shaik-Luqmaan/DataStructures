package DataStructures.Search_Sorts;
import java.util.*;


public class Movie implements Comparable<Movie>{
    private int year;
    private double rating;
    private String name;

    Movie(String name,double rating,int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int getYear(){
        return year;
    }
    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }

    public int compareTo(Movie m) {
        return (this.getName()).compareTo(m.getName());
    }

}

 class ComparableTest {
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie m: list)
        {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
