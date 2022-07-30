package day31_Constructors.MovieTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts =new ArrayList<String>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }


    public void addCast(String castName){
      casts.add(castName);
    }
    public void addCasts(String[] castNames){
        casts.addAll(Arrays.asList(castNames));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", total of cast "+ casts.size()+
                '}';
    }
}



/*

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie
 */