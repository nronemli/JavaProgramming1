package day15_ForLoop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int treeSize = 0;

        for (int i = 1; i <= 10; i++) {
            if (i >= 1 && i <= 3) {
                treeSize++;
                int growth = 1;
                System.out.println("year " + i + "- growth 1 cm \n tree size: " + treeSize + "cm");
            }
            if (i >= 4 && i <= 10) {
                treeSize++;
                int growth = 2;
                System.out.println("year " + i + "- growth 1 cm \n tree size: " + treeSize + "cm");
            }

        }


    }


}
