import javax.swing.JOptionPane;

import Entity.Student;
import controller.StudentController;
import persistence.ConfigDB;

public class Main {

    public static void main(String[] args) {
        
        ConfigDB.openConnection();

        StudentController objStudentController= new StudentController();
        // objStudentController.create();

        // objStudentController.readAll();

        String option= null;

        do {
            option= JOptionPane.showInputDialog(null, "bienvenido \n" + "options: \n"+ "1.create Student \n"+ "2. show all student\n"+ "3.search student by id \n"+ "4. delete\n"+ "5. close\n");

            switch (option) {
                case "1" -> {
                    objStudentController.create();
                }
                    
                case "2"-> {
                    objStudentController.readAll();
                }
            
                case "3"-> {
                    int id= Integer.parseInt(JOptionPane.showInputDialog("insert id "));
                    Object student=objStudentController.readById(id);
                    JOptionPane.showMessageDialog(null,student.toString());
                }

                case "4"->{
                    // int id = Integer
                }
            }
            
        } while (!option.equals("4"));

        

        
    }
}