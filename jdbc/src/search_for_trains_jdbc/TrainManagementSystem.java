package search_for_trains_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainManagementSystem {

    public ArrayList<Train> viewTrain(String coachType, String source, String destination) {

        ArrayList<Train> trains = new ArrayList<>();
        try {
            Connection conn = DB.getConnection();

            PreparedStatement statement = conn.prepareStatement("SELECT * FROM TRAIN WHERE source=? AND destination=? AND ? > 0" + coachType.toLowerCase()
                    + " > 0;");
            statement.setString(1, source);
            statement.setString(2, destination);
            statement.setString(3, coachType);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("train_number");
                String name = rs.getString("train_name");
                String sourceFromTb = rs.getString("source");
                String destFromTb = rs.getString("destination");
                int ac1 = rs.getInt("ac1");
                int ac2 = rs.getInt("ac2");
                int ac3 = rs.getInt("ac3");
                int sleeper = rs.getInt("sleeper");
                int seater = rs.getInt("seater");

                Train train = new Train(id, name, sourceFromTb, destFromTb, ac1, ac2, ac3, sleeper, seater);
                trains.add(train);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return trains;
    }
}