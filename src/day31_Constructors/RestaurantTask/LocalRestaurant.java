package day31_Constructors.RestaurantTask;

import day31_Constructors.MovieTask.Movie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("Isa", 1234, 10, true);
        Server server2 = new Server("Musa", 12345, 11, false);
        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Havva", 123435, 22, true);
        Chef chef2 = new Chef("Adem", 1234356, 20, true);
        Chef[] chefs = {chef1, chef2};

        Restaurant rest1 = new Restaurant("Nur", "Middlesex", 5);
        rest1.hireServer(servers);
        rest1.hireChef(chefs);

        System.out.println(rest1);
    }
}

/*
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs
	            to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information


 */