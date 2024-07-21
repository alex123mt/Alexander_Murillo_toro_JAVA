// sistema de registro de empleados

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        gestionEmpleados gestion = new gestionEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("Ingrese 1 para agregar un empleado temporal, 2 para agregar un empleado permanente, 3 para eliminar un empleado, 4 para mostrar empleados y 5 para salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado temporal: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado temporal: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado temporal: ");
                    float salario = scanner.nextFloat();
                    scanner.nextLine(); 

                    empleadoTemporal empleadoTemporal = new empleadoTemporal(nombre, edad,0, salario); 
                    gestion.agregarEmpleado(empleadoTemporal);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del empleado permanente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado permanente: ");
                    edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado permanente: ");
                    salario = scanner.nextFloat();
                    scanner.nextLine();

                    empleadoPermanente empleadoPermanente= new empleadoPermanente(nombre, edad, 0, salario);
                    gestion.agregarEmpleado(empleadoPermanente);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestion.eliminarEmpleado(idEliminar);
                    break;
                case 4:
                    gestion.mostrarEmpleados();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}
