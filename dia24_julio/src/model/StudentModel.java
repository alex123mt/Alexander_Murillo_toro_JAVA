package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Student;
import persistence.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class StudentModel implements CRUDGeneric{

    @Override
    public Object create(Object object) {
        // Open connection

        Connection connection = ConfigDB.openConnection();
        
        
        //transform object 
        Student student = (Student)object; 


        try {
            //create SQL query 

            String sqlQuery = "INSERT INTO students (name,age) values (?,?)";

            //create prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            // assing to 
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());

            //execute

            preparedStatement.execute();

            //get result
            ResultSet result = preparedStatement.getGeneratedKeys();

            while (result.next()) {
                student.setId(result.getInt(1));
                
            }


            preparedStatement.close();
        

            JOptionPane.showMessageDialog(null, "the creation student ");

        }catch(SQLException  e ){
            throw new RuntimeException(e);
        }

        try {
            ConfigDB.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public Object readById(int id) {
        //open conection
        Connection connection = ConfigDB.openConnection();

        Student student=null;
        
        try {
            //create SQL query
            String sqlQuery = "SELECT * FROM students WHERE id=?;";

            //prepared statement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //asign to ?
            preparedStatement.setInt(1, id);

            //execute
            preparedStatement.execute();

            ResultSet result = preparedStatement.getResultSet();


            while (result.next()) {
                student= new Student(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("age")
                );
            }

        }catch(SQLException e){
            throw new RuntimeException();
        }

        return student;
    }

    @Override
    public ArrayList<Object> readAll() {
        // Open connection

        Connection connection = ConfigDB.openConnection();
        
        //instance arralist<Student>
        ArrayList<Object> students= new ArrayList<>();

        try {
            //create SQL query 

            String sqlQuery = "SELECT * FROM students";

            //create prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);


            //execute

            preparedStatement.execute();

            //get result
            ResultSet result = preparedStatement.getResultSet();


            while (result.next()) {
                Student student = new Student();
                student.setId(result.getInt("id"));
                student.setAge(result.getInt("age"));
                student.setName(result.getString("name"));

                students.add(student);
            }


            preparedStatement.close();
        

            JOptionPane.showMessageDialog(null, "the creation student ");

        }catch(SQLException  e ){
            throw new RuntimeException(e);
        }

        try {
            ConfigDB.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Object update(Object object, int id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        //open conection
        Connection connection = ConfigDB.openConnection();

        Student student=null;

        boolean flag= false;
        
        try {
            //create SQL query
            String sqlQuery = "DELETE * FROM students WHERE id=?;";

            //prepared statement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //asign to ?
            preparedStatement.setInt(1, id);

            flag = preparedStatement.execute();

            // if 

            //execute
            preparedStatement.execute();

            ResultSet result = preparedStatement.getResultSet();


            while (result.next()) {
                student= new Student(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("age")
                );
            }

        }catch(SQLException e){
            throw new RuntimeException();
        }

        return null;
    }

    

}
