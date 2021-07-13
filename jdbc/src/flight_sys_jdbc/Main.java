package flight_sys_jdbc;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        FlightManagementSystem system = new FlightManagementSystem();
        system.addFlight(new Flight(113, "Zurich","Jamaica", 500, 6000.0 ));
    }
}
