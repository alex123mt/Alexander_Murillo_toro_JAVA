package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.reservacion;
import persistence.ConfigDB.MysqlConfig;
import persistence.imodel.IReservacionModel;

public class reservacionModel  implements IReservacionModel{
    @Override
    public reservacion create(reservacion request) {
        Connection connection = MysqlConfig.openConnection();
        String sqlQuery = "INSERT INTO reservarcion (id_pasajero_fk,id_vuelo_fk,fecha_reservacion,asiento) values (?,?,?,?);";

        reservacion Reservacion= new reservacion();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, request.getId_pasajero_fk());
            preparedStatement.setInt(2, request.getId_vuelo_fk());
            preparedStatement.setDate(3, request.getFecha_reservacion());
            preparedStatement.setString(4, request.getAsiento());

            int resulset= preparedStatement.executeUpdate();

            if (resulset==1) {
                return request;
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }   


        return Reservacion;
    }
}
