package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>( scores ); // 90 ~ 100
        gradeOfA.removeIf(p-> !(p>= 90 && p<=100));
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>( scores );
        gradeOfB.removeIf(p-> !(p>=80 && p<=89 ));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC= new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p>=70 && p<=79));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf( p -> !(p >= 60 && p <= 69));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfE= new ArrayList<>(scores);
        gradeOfE.removeAll(gradeOfA);
        gradeOfE.removeAll(gradeOfB);
        gradeOfE.removeAll(gradeOfC);
        gradeOfE.removeAll(gradeOfD);
        System.out.println(gradeOfE);

        System.out.println(gradeOfA.size());
        System.out.println(gradeOfB.size());
        System.out.println(gradeOfC.size());
        System.out.println(gradeOfD.size());
        System.out.println(gradeOfE.size());




    }
}
