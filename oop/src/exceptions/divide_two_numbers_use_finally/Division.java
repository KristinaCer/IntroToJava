package exceptions.divide_two_numbers_use_finally;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Division div = new Division();
        System.out.println(div.divideTwoNumbers(number1, number2));
    }

    public String divideTwoNumbers(int number1,int number2){
        String answer = "";
        try{
            int result = number1 / number2;
            answer = "The answer is " + result + ".";
        } catch (ArithmeticException e){
            answer = "Division by zero is not possible.";
        }finally {
           /* answer += " Thanks for using the application.";
                would give only 10 points!
            */

            answer += " " + "Thanks for using the application.";
        }
        return answer;
    }
}
