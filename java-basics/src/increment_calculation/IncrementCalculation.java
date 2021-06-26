package increment_calculation;

import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double rating = sc.nextDouble();
        if (sal <= 0 || (rating<1 || rating > 5)){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println(calcIncrement(rating, sal));
    }

    public static int calcIncrement(double appraisalRating, int salary) {
        int newSalary = 0;
        if (appraisalRating >= 1 && appraisalRating <= 3) {
            newSalary = (int) (salary + salary * 0.1);
        } else if (appraisalRating >= 3.1 && appraisalRating <= 4) {
            newSalary = (int) (salary + salary * 0.25);

        } else if (appraisalRating >= 4.1 && appraisalRating <= 5) {
            newSalary = (int) (salary + salary * 0.3);
        }
        return newSalary;
    }
}

