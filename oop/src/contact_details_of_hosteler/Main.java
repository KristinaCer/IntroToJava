package contact_details_of_hosteler;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Student student = getHostellerDetails();
       Hosteller hosteller = new Hosteller();
        String hostelName;
        int roomNo;
        String modifyRoomNo;
        String modifyPhoneNo;
        System.out.println("Hostel Name");
        hostelName = scanner.nextLine();
        System.out.println("Room Number");
        roomNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Modify Room Number(Y/N)");
        modifyRoomNo =scanner.next().trim().toLowerCase(Locale.ROOT);
        if (modifyRoomNo.equals("y")){
            System.out.println("New Room Number");
            roomNo = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Modify Phone Number(Y/N)");
        modifyPhoneNo = scanner.next().trim().toLowerCase(Locale.ROOT);
        if(modifyPhoneNo.equals("y")){
            System.out.println("New Phone Number");
            hosteller.setPhone(scanner.next());
        }
        hosteller.setHostelName(hostelName);
        hosteller.setRoomNumber(roomNo);
        System.out.println("The Student Details");
        System.out.println(student.toString()+hosteller.toString());
    }

    public static Hosteller getHostellerDetails(){
        int studentId;
        String name;
        int departmentId;
        String gender;
        String phone;
        Hosteller hosteller = new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Student Name");
        name = scanner.nextLine();
        System.out.println("Department Id");
        departmentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gender");
        gender = scanner.next();
        System.out.println("Phone Number");
        phone = scanner.next();
        scanner.nextLine();
        hosteller.setStudentId(studentId);
        hosteller.setName(name);
        hosteller.setDepartmentId(departmentId);
        hosteller.setGender(gender);
        hosteller.setPhone(phone);
        return  hosteller;
    }
}
