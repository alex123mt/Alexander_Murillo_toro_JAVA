package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.management.RuntimeErrorException;

public class ConfigDB {
    
    static Connection connection = null;

    //Method to open

    public static Connection openConnection(){

        try{

            //Install Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Credentials 
            String URL = "jdbc:mysql://127.0.0.1:3306/prueba";
            String user = "root";
            String password = "alexander@313";

            //establishing the connection
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection established");


        }catch (ClassNotFoundException e){
            System.out.println("ERROR: Driver not found");
        }catch(SQLException e){
            System.out.println("ERROR: Connection failed");
        }

        return connection;
    }

    //Method to close

    public static void closeConnection()throws SQLException {
        if (connection != null) {
            connection.close();
            connection= null;

            System.out.println("Connection finished");
        }
    }
}