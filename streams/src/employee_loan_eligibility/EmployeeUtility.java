package employee_loan_eligibility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeUtility {

  public Employee[] getEmployeeDetails(String[] details) {
    Employee[] employees = new Employee[details.length];
    // Fill your code here
    IntStream.range(0, details.length)
        .forEach(
            i -> {
              String[] userDetails = details[i].split(";");
              employees[i] =
                  new Employee(userDetails[0], userDetails[1], Double.parseDouble(userDetails[2]));
            });
    return employees;
  }

  public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
    // Fill your code here
    return Arrays.stream(empDetails);
  }

  public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {
    // Fill your code here
      List<String> empList = empStream.filter(emp -> emp.getSalary() >= minSalary)
              .sorted((emp1, emp2) -> emp1.getEmpId().compareTo(emp2.getEmpId()))
              .map(emp -> emp.toString()).collect(Collectors.toList());
      return empList.toArray(new String[(int)empStream.count()]);
  }
}
