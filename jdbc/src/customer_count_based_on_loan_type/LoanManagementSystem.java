package customer_count_based_on_loan_type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoanManagementSystem {

    public int viewLoanCountBasedOnType(String loanType) {
        int count = -1;
        Connection conn = null;
        try {
            conn = DB.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT COUNT(*) FROM loan WHERE loanType = ?");
            statement.setString(1, loanType);
            ResultSet rs = statement.executeQuery();
            if (!rs.next()) {
                throw new IllegalStateException("Sql returned no rows");
            }
            count = rs.getInt(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return count;
    }
}