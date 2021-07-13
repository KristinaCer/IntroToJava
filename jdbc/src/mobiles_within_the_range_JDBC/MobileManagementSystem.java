package mobiles_within_the_range_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MobileManagementSystem {

    public Map<Integer, Integer> viewMobileWithInTheRange(int minRange, int maxRange){
        Connection con = null;
        Map <Integer, Integer> mobilePrices = new HashMap<>();
        try {
            con = DB.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM mobile WHERE price >= ? AND price <= ?");
            statement.setDouble(1, minRange);
            statement.setDouble(2, maxRange);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                mobilePrices.put(rs.getInt("productId"), rs.getInt("price"));
            }
          mobilePrices =
                   mobilePrices.entrySet().stream()
                           .sorted(Comparator.comparing(Map.Entry::getValue))
                           .collect(Collectors.toMap(Map.Entry::getKey,
                                   Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return mobilePrices;
    }
}
