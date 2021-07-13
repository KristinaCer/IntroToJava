package flight_sys_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem {

    public boolean addFlight(Flight flightObj) {
        Connection con = null;
        try {
            con = DB.getConnection();
            String query = " insert into flight (flightid, source, destination, noofseats, flidghtfare)"
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, flightObj.getFlightId());
            preparedStmt.setString(2, flightObj.getSource());
            preparedStmt.setString(3, flightObj.getDestination());
            preparedStmt.setInt(4, flightObj.getNoOfSeats());
            preparedStmt.setDouble(5, flightObj.getFlightFare());
            preparedStmt.execute();
            con.close();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
