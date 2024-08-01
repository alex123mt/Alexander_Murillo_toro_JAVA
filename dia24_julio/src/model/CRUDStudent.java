package model;

import java.util.ArrayList;

import Entity.Student;

public interface CRUDStudent {
    public Student create(Student student);
    public Student readById(int id);
    public ArrayList<Student> readAll();
    public Student update(Student student, int id);
    public boolean delete(int id );

}
