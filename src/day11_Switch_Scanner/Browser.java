package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Firefox";
        String result = "";

        switch (browserName) {
            case "Chrome":
                System.out.println("Chrome browser selected");
                break;
            case "Firefox":
                System.out.println("Firefox browser selected");
                break;
            case "Opera":
                System.out.println("Opera browser selected");
                break;
            case "Safari":
                System.out.println("Safari browser selected");

            default:
                System.out.println("Invalid Browser");
        }

        System.out.println(result);


    }


}
