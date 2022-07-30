package day31_Constructors.RestaurantTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    //method name//class name[] variable name
    public void hireServer(Server[] servers1) {
        servers.addAll(Arrays.asList(servers1));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    //method name//class name[] variable name
    public void hireChef(Chef[] chefs1) {
        chefs.addAll(Arrays.asList(chefs1));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                "' number of chefs = " + chefs.size() +
                "' number of server = " + servers.size() +
                '}';
    }
}
