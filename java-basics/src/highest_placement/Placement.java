package highest_placement;

import java.util.*;

public class Placement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int placement1 = scanner.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int placement2 = scanner.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int placement3 = scanner.nextInt();

        HashSet<Integer> placements = new HashSet<>();
        placements.add(placement1);
        placements.add(placement2);
        placements.add(placement3);

        boolean placement1Highest = placement1 > placement2 && placement1 > placement3 ? true : false;
        boolean placement2Highest = placement2 > placement3 && placement2 > placement3 ? true : false;
        boolean placement3Highest = placement3 > placement1 &&  placement3 > placement2 ? true : false;

        boolean firstTwoEqual = placement1 == placement2 ? true : false;
        boolean lastTwoEqual = placement2 == placement3 ? true : false;
        boolean restTwoEqual = placement3 == placement1 ? true : false;

        if(placement1 < 0 || placement2 < 0 || placement3 < 0) {
            System.out.println("Input is Invalid");
        }
        else if (placements.size() == 1) {
            System.out.println("None of the department has got the highest placement");
        }
        else if (placements.size() == 2) {
            System.out.println("Highest placement");
            if (firstTwoEqual && placement3Highest)  {
                System.out.println("MECH");
            } else if (lastTwoEqual && placement1Highest) {
                System.out.println("CSE");
            } else if(restTwoEqual && placement2Highest) {
                System.out.println("ECE");
            } else if(firstTwoEqual){
                System.out.println("CSE");
                System.out.println("ECE");
            } else if(lastTwoEqual) {
                System.out.println("ECE");
                System.out.println("MECH");
            } else{
                System.out.println("CSE");
                System.out.println("MECH");
            }
        } else {
            System.out.println("Highest placement");
            if (placement1Highest) {
                System.out.println("CSE");
            } else if (placement2Highest) {
                System.out.println("ECE");
            } else {
                System.out.println("MECH");
            }
        }
    }
}
