package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.userEntity;
import persistence.ConfigDB.MysqlConfig;
import persistence.imodel.IUserModel;

public class userModel implements IUserModel {

    @Override
    public userEntity create(userEntity request) {
        Connection connection = MysqlConfig.openConnection();
        String sqlQuery = "INSERT INTO user(id,name,email,password) values (?,?,?,?);";

        userEntity user = new userEntity();

        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getId());
            preparedStatement.setString(2, request.getName());
            preparedStatement.setString(3, request.getEmail());
            preparedStatement.setString(4, request.getPassword());

            int resulset = preparedStatement.executeUpdate();

            if (resulset == 1) {
                return request;
            }

            preparedStatement.close();

        }catch(SQLException error){
            throw new RuntimeException(error.getMessage());
        }


        return user;
    }

    @Override
    public void delete(String id) {
        
    }

    
    
}
