import javax.swing.JOptionPane;

import controllers.userControllers;
import entities.userEntity;

public class App {
    public static void main(String[] args) throws Exception {

        userControllers userControllers= new userControllers();


        String id= JOptionPane.showInputDialog("insert to id");
        String name= JOptionPane.showInputDialog("insert to name");
        String email= JOptionPane.showInputDialog("insert to email");
        String password= JOptionPane.showInputDialog("insert to password");

        userEntity user = new userEntity(id, name, email, password);

        userControllers.create(user);

    }
}
 