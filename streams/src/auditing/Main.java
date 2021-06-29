package auditing;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Map<String, Double> employeeMap = new HashMap<String,Double>();

    public Main() {
        super();
    }

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        // Fill the code
        this.getEmployeeMap().put(employeeName, salary);
    }


    public static EmployeeAudit findEmployee() {
        // Fill the code
         EmployeeAudit audit = salary -> {
             ArrayList<String> name;
              name = employeeMap.entrySet().stream()
                      .filter(employeeMap -> employeeMap.getValue() <= salary)
                      .map(employeeMap -> employeeMap.getKey())
                      .collect(Collectors.toCollection(ArrayList<String>::new));
              return name;
         };
         return audit;
    }

    public static void main(String[] args) {

        Main.employeeMap.put("John", 1000.0);
        Main.employeeMap.put("Ona", 1000.0);
        Main.employeeMap.put("Ada", 1000.0);
        Main.employeeMap.put("Lisa", 500.0);
        Main.employeeMap.put("Paul", 500.0);
        Main.employeeMap.put("Adam", 500.0);
        Main.employeeMap.put("Taya", 1500.0);
        Main.employeeMap.put("Otilija", 1500.0);
        Main.employeeMap.put("Anna", 1500.0);

        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int f =0;
        while (f == 0 ) {
        System.out.println(" 1.Add Employee Details \n2.Find Employee Details \n3.Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println(" Enter the Employee name");
                String name = sc.nextLine();
                System.out.println("Enter the Employee Salary");
                double salary = Double.parseDouble(sc.nextLine());
                main.addEmployeeDetails(name, salary);
            } else if (choice == 2) {
                System.out.println("Enter the salary to be searched");
                int salaryToFind = Integer.parseInt(sc.nextLine());
                System.out.println("Employee List");
                EmployeeAudit emp = findEmployee();
                ArrayList<String> s = emp.fetchEmployeeDetails(salaryToFind);
                if (s.isEmpty()) {
                    System.out.println("No Employee found");
                } else {
                    s.forEach(System.out::println);
                }
            } else {
                System.out.println("Let's complete the session");
                f = 1;
            }
        }
    }
}
