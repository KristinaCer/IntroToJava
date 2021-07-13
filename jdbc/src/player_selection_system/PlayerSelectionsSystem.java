package player_selection_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionsSystem {
    public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) {
        // Fill your code here
        List<String> selectedPlayers = new ArrayList<>();
        try {
            Connection conn = DB.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM player WHERE height >= ? AND weight <= ? order by playerName");
            statement.setDouble(1, minHeight);
            statement.setDouble(2, maxWeight);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                selectedPlayers.add(rs.getString("playerName"));
            }
            return selectedPlayers;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
