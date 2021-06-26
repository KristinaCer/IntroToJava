package display_characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayChars {
     public static void main(String[] args) {
         System.out.println("Enter the digits:");
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 3; i++) {
             int number = sc.nextInt();
             System.out.println(number + "-" + (char)number
             );
         }
     }
}
