import java.util.Arrays;
import java.util.Scanner;

public class TAllerdeMotosycarros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int maxEmployees = 0;
        String[][][] array=null;
        String[] detallesVehiculo=new String[4];
        

        System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
        int opcion= scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("ingrese la capacidad maxima del taller");
                    maxEmployees= scanner.nextInt();
                    System.out.println("Ingrese el número de trabajos a registrar:");
                    int numTregistrar= scanner.nextInt();
                    scanner.nextLine();
                    array = new String[maxEmployees][2][4];

                    if (maxEmployees>=numTregistrar) {
                        for (int i = 0; i < numTregistrar; i++) {
                            System.out.println("Ingrese nombre del empleado:");
                            String nomEmpleado=scanner.nextLine();

                            System.out.println("ingrese el tipo del vehiculo (moto/carro):");
                            String tipoVehiculo= scanner.nextLine();

                            System.out.println("Ingrese la marca:");
                            detallesVehiculo[0]= scanner.nextLine();
                                        
                            System.out.println("Ingrese el modelo:");
                            detallesVehiculo[1]= scanner.nextLine();

                            System.out.println("Ingrese el año:");
                            detallesVehiculo[2]= scanner.nextLine();

                            System.out.println("Ingrese el estado:");
                            detallesVehiculo[3]= scanner.nextLine();

                            array[i] = new String[][] {
                                {nomEmpleado},
                                {tipoVehiculo},
                                {Arrays.toString(detallesVehiculo)}
                            };
                        }
                    }else{
                        System.out.println("La capacidad del taller es insuficiente");
                    }

                    System.out.println(Arrays.deepToString(array));

                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 2:
                if (array != null) {
                    System.out.println("| Tipo   | Marca   | Modelo   | Año   | Estado      |");
                    System.out.println("|--------|---------|----------|-------|-------------|");
                    for (int i = 0; i < array.length; i++) {
                        String[] detallesEmpleado = array[i][2][0].replace("[", "").replace("]", "").split(", ");
                        System.out.println(String.format("| %-6s | %-7s | %-8s | %-5s | %-11s |", 
                                array[i][1][0], detallesEmpleado[0].trim(), detallesEmpleado[1].trim(), detallesEmpleado[2].trim(), detallesEmpleado[3].trim()));
                    }
                } else {
                    System.out.println("No hay datos registrados");
                }
                    
                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 3:
                    int contP=0;
                    int contR=0;
                    int contV=0;


                    for (int i = 0; i < detallesVehiculo.length; i++) {
                        String estado= detallesVehiculo[i].toLowerCase();
                        if (estado.equalsIgnoreCase("pendiente")) {
                            contP++;
                        }if(estado.equalsIgnoreCase("reparado")) {
                            contR++;
                        }if(estado.equalsIgnoreCase("vendido")){
                            contV++;
                        }
                    }

                    System.out.println("Hay "+contP+" en estado pendiente");
                    System.out.println("Hay "+contR+" en estado reparado");
                    System.out.println("Hay "+contV+" en estado vendido");

                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 4:

                    


                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 5:

                    
                    
                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion!=6);
        scanner.close();
    }
}
