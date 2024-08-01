package models;


import java.sql.*;

import entities.avion;
import persistence.ConfigDB.MysqlConfig;
import persistence.imodel.IAvionModel;

public class avionModel implements IAvionModel {

    @Override
    public avion create(avion request) {
        Connection connection = MysqlConfig.openConnection();
        String sqlQuery = "INSERT INTO avion (modelo,capacidad) values (?,?);";

        avion avionEntity= new avion();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getModelo());
            preparedStatement.setInt(2, request.getCapacidad());

            int resulset= preparedStatement.executeUpdate();

            if (resulset==1) {
                return request;
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }   


        return avionEntity;
    }

    @Override
    public void delete(Integer id) {
        Connection connection = MysqlConfig.openConnection();

        boolean flag;

        try {
            String sqlQuery = "DELETE * FROM avion WHERE id_avion = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,id);

            flag = preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return;
    }


}
