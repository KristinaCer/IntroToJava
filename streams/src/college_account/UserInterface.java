package college_account;

import java.util.Scanner;

public class UserInterface {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter registration number");
    int regNo = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter student name");
    String name = sc.nextLine();
    System.out.println("Enter no of semesters");
    int semNo = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter basic fee");
    int fee = sc.nextInt();
    sc.nextLine();
    System.out.println("Course type");
    String courseType = sc.nextLine();
    int tuitFeeFinal = tuitionFeeCalculator.calculateTuitionFees(courseType, fee, semNo);
    System.out.println("Fees Receipt");
    System.out.println("Registration number:" + regNo);
    System.out.println("Student name:" + name);
    if (courseType.equalsIgnoreCase("regular")) {
      System.out.println("Tuition fee for regular student: " + tuitFeeFinal);
    } else {
      System.out.println("Tuition fee for selfFinance student: " + tuitFeeFinal);
    }
  }

  static TuitionFee<Integer> tuitionFeeCalculator =
      (courseType, fee, noOfSemesters) -> {
        Integer studFee = 0;
        if (courseType.equalsIgnoreCase("Regular")) {
          studFee = fee * noOfSemesters;
        } else {
          studFee = fee * noOfSemesters + 50000;
        }
        return studFee;
      };
}
