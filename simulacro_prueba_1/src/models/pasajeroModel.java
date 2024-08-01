package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entities.pasajero;
import persistence.ConfigDB.MysqlConfig;
import persistence.imodel.IPasajeroModel;

public class pasajeroModel implements IPasajeroModel{

    @Override
    public pasajero create(pasajero request) {
        Connection connection = MysqlConfig.openConnection();
        String sqlQuery = "INSERT INTO pasajero (nombre,apellido,documento_identidad) values (?,?,?);";

        pasajero Pasajero= new pasajero();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getNombre());
            preparedStatement.setString(2, request.getApellido());
            preparedStatement.setString(3, request.getDocumento_identidad());

            int resulset= preparedStatement.executeUpdate();

            if (resulset==1) {
                return request;
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }   


        return Pasajero;
    }

}
