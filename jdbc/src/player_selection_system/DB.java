package player_selection_system;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection con = null;
    private static Properties props = new Properties();

    //ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("database.properties");
            props.load(fis);
            // load the Driver Class
            try {
                Class.forName(props.getProperty("DB_DRIVER_CLASS"));
            } catch (ClassNotFoundException e) {
                System.out.println("Could not find JDBC driver");
                e.printStackTrace();
            }
            // create the connection now
            try {
                con = DriverManager.getConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"));
                System.out.println(con.toString() + "Successfully connected");
            } catch (SQLException e) {
                System.out.println("Connection failed");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return con;
    }
}
