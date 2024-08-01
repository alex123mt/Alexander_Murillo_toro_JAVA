package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entity.Student;
import model.StudentModel;

public class StudentController {

    StudentModel objStudentModel;

    public StudentController(){
        this.objStudentModel= new StudentModel();
    }

    public void create(){
        // Student objStudent= new Student();
        Student objStudent= new Student(null, 0);

        //input of name 
        String name = JOptionPane.showInputDialog("please insert your name ");

        //input of age
        int age = Integer.parseInt(JOptionPane.showInputDialog("please insert your age "));

        objStudent= new Student(name,age);

        objStudent.setName(name);
        objStudent.setAge(age);

        Student result = (Student) this.objStudentModel.create(objStudent);

        JOptionPane.showMessageDialog(null, result.toString());
    }

    public Object readById(int id){
        return this.objStudentModel.readById(id);
    }

    public void readAll(){

        ArrayList<Object> result = this.objStudentModel.readAll();

        JOptionPane.showMessageDialog(null, result.toString());
    }


    public boolean delete(int id){
        this.objStudentModel.delete(id);
    }

}
