package auditing;

import java.util.ArrayList;
@FunctionalInterface
public interface EmployeeAudit<T> {

    // Fill the code
     ArrayList<String> fetchEmployeeDetails (double salary);
}
