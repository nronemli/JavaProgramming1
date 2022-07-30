package day22_MultiDimentionalArray;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        //declare with length of three groups
        String[][]batch25Groups =  new String[batch25Group1.length+batch25Group2.length+batch25Group3.length][];
       //assign to each index
        //customer id :     customer name
        batch25Groups[0]=batch25Group1;
        batch25Groups[1]=batch25Group2;
        batch25Groups[2]=batch25Group3;

      System.out.println(Arrays.deepToString(batch25Groups));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][]batch24Groups= new String[3][];
        batch24Groups[0] = batch24Group1;
        batch24Groups[1] = batch24Group2;
        batch24Groups[2] = batch24Group3;

        System.out.println("____________________________________________________________________________");
                                            //2         //2
        String [][][] CydeoStudents= {batch24Groups,batch25Groups};

                        //GROUPBATCH         //CYDEO
        for (String[][] Batch : CydeoStudents) {
            System.out.println();
                        //group4    //EU9
            for (String[] group : Batch) {
                            //OGRENCI ISMI > GROUP4
                for (String student : group) {
                    System.out.print(student+ "\t");
                }
            }
        }


    }
}
