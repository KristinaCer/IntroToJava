package student_details_constructor;

import java.util.Locale;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's Id: \n");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student's Name: \n");
        String name = scanner.nextLine();
        System.out.println("Enter Student's address: \n");
        String address = scanner.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No): \n");
        String fromNIT = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        String collage = null;
        if(! fromNIT.equals("yes")){
            System.out.println("Enter the college name: \n");
             collage = scanner.nextLine();
        }
        Student student;
        if (fromNIT == "Yes") {
             student = new Student(id, name, address);
        } else{
            student = new Student(id, name, address, collage);
        }
        System.out.println("Student id:"+ student.getStudentId() +"\n" +
                "\n" +
                "Student name:"+ student.getStudentName() +"\n" +
                "\n" +
                "Address:"+ student.getStudentAddress() +"\n" +
                "\n" +
                "College name:"+ student.getCollegeName());
    }
}
