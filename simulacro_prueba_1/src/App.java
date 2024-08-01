import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import controllers.avionControllers;
import controllers.pasajeroControllers;
import controllers.reservacionControllers;
import controllers.vueloControllers;
import entities.avion;
import entities.pasajero;
import entities.reservacion;
import entities.vuelo;

public class App {
    public static void main(String[] args) throws Exception {

        String option = null;

        do {
            option= JOptionPane.showInputDialog(null, "Bienvenido\n"+"Crear :\n"+ "1. Avion\n"+"2. Vuelo\n"+"3. Pasajero\n"+"4. Reservacion\n"+"Consulta registros:\n"+"5. Avion\n"+"6. Vuelo\n"+"7. Pasajero\n"+"8. Reservacion\n"+ "Actualizar datos:\n"+"9. Avion\n"+"10. Vuelo\n"+"11. Pasajero\n"+"12. Reservacion\n"+"Eliminar: \n"+"13. Avion\n"+"14. Vuelo\n"+"15. Pasajero\n"+"16. Reservacion\n"+"salir");

            // option = JOptionPane.showInputDialog(null, "Bienvenido\n"+"Selecciona una entidad :\n"+ "1. Avion\n"+"2. Vuelo\n"+"3. Pasajero\n"+"4.Reservacion\n"+"salir");
            switch (option) {
                case "1":
                        avionControllers avionControllers= new avionControllers();

                        String modelo= JOptionPane.showInputDialog("ingresa el modelo del avion");
                        int capacidad= Integer.parseInt(JOptionPane.showInputDialog("ingresa la capacidad del avion"));
                
                        avion Avion= new avion(capacidad, modelo,capacidad);
                
                        avionControllers.create(Avion);
                    break;

                case "2":

                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                
                        vueloControllers vueloControllers= new vueloControllers();

                        String destino= JOptionPane.showInputDialog("ingresa el destino del vuelo");
                        String fechaString = JOptionPane.showInputDialog("Ingrese la fecha de salida (yyyy-MM-dd)");
                        Date fechaSalida = new Date(dateFormat.parse(fechaString).getTime());
                        String horaString = JOptionPane.showInputDialog("Ingrese la hora de salida (HH:mm:ss)");
                        Time horaSalida = new Time(timeFormat.parse(horaString).getTime());
                        int id_avion= Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del avion"));


                
                        vuelo Vuelo= new vuelo(destino,fechaSalida,horaSalida,id_avion);
                
                        vueloControllers.create(Vuelo);
                    break;

                case "3": 

                        pasajeroControllers pasajeroControllers= new pasajeroControllers();

                        String nombre= JOptionPane.showInputDialog("ingresa el nombre del pasajero");
                        String apellido= JOptionPane.showInputDialog("ingresa el apellido del pasajero");
                        String identificacion= JOptionPane.showInputDialog("ingrese el documento de identificacion");
                    

                        pasajero Pasajero= new pasajero(nombre,apellido,identificacion);
                        pasajeroControllers.create(Pasajero);

                    break;

                case "4":
                        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");

                        reservacionControllers reservacionControllers= new reservacionControllers();

                        int id_pasajero= Integer.parseInt(JOptionPane.showInputDialog("ingresa el id del pasajero"));
                        int id_vuelo= Integer.parseInt(JOptionPane.showInputDialog("ingresa el id del vuelo"));
                        String fecha_reservacion = JOptionPane.showInputDialog("Ingrese la fecha de reservacion (yyyy-MM-dd)");
                        Date fecha_reserv = new Date(dateForm.parse(fecha_reservacion).getTime());
                        String asiento= JOptionPane.showInputDialog("ingrese el asiento ");

                        reservacion Reservacion= new reservacion(id_pasajero,id_vuelo,fecha_reserv,asiento);
                        reservacionControllers.create(Reservacion);
                
                    break;

                case "5":
                        

                    break;
            
                default:
                    break;
            }
            
        } while (!option.equals("salir"));

        
    }
}
