package persistence.ConfigDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class MysqlConfig {

    private static Connection connection= null;

    public static Connection openConnection(){

        String URL = "jdbc:mysql://127.0.0.1:3306/riwiboardDB";
        String user = "root";
        String password = "alexander@313";//poner la contraseña que es

        try{

            connection = DriverManager.getConnection(URL, user, password);

            System.out.println("connection succesful");

        }catch(SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if(connection!= null){
            try{
                connection.close();
                System.out.println("connection closed");
            }catch(SQLException error){
                throw new RuntimeException(error.getMessage());
            }
            
        }
    }

    
}
