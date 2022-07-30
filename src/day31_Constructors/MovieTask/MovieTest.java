package day31_Constructors.MovieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTest {

    public static void main(String[] args) {


        String title = "Journey to SDET: Cydeo Batch 25";
        Movie movie1 = new Movie("England", title, "Comedy", "26/06", "Nur");
        Movie[] movies = {movie1};

        movie1.addCast("ASDA");
        System.out.println(Arrays.asList(movies));
        String[] names = {"asda", "asdasd", "asdasd"};
        movie1.addCasts(names);
        System.out.println(Arrays.asList(movie1));


    }
}
/*
 3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

 */