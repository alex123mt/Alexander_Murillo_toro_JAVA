package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entities.vuelo;
import persistence.ConfigDB.MysqlConfig;
import persistence.imodel.IVueloModel;

public class vueloModel implements IVueloModel {

    @Override
    public vuelo create(vuelo request) {
        Connection connection= MysqlConfig.openConnection();
        String sqlQuery= "INSERT INTO vuelo (destino,fecha_salida,hora_salida,id_avion_fk) values(?,?,?,?);";

        vuelo Vuelo= new vuelo();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getDestino());
            preparedStatement.setDate(2, request.getFecha_salida());
            preparedStatement.setTime(3, request.getHora_salida());
            preparedStatement.setInt(4, request.getId_avion_fk());

            int resulset= preparedStatement.executeUpdate();


            if (resulset== 1) {
                return request;
            }

            preparedStatement.close();
        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }

        return Vuelo;
    }



}
