package placement_enrolment_count;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Fill your code here
        System.out.println("Enter all roll numbers separated by comma");
        String roll_nos = sc.nextLine();
        System.out.println("Enter the department name acronym");
        String acr = sc.nextLine();
        int count = getCount(getRollNumbers(roll_nos), acr);
        if (count > 0) {
            System.out.println("Number of students in " + acr +" is " + count);
        } else{
            System.out.println("No students from" + acr);
        }
    }

    public static Stream<String> getRollNumbers(String rollNumbers) {
        //Fill your code here
        String [] rollNos = rollNumbers.split(",");
        return Arrays.stream(rollNos);
    }

    public static int getCount(Stream<String> rollNumberStream, String dept) {
        //Fill your code here
        int count = (int) rollNumberStream.filter(no -> no.toLowerCase().startsWith(dept.toLowerCase())).count();
         return count;
    }
}
