import java.util.Scanner;

public class TAllerdeMotosycarros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int maxEmployees = 0;
        String[][][] array=null;
        

        System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
        int opcion= scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la capacidad maxima del taller");
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
                            String marca= scanner.nextLine();
                                        
                            System.out.println("Ingrese el modelo:");
                            String modelo= scanner.nextLine();

                            System.out.println("Ingrese el año:");
                            String año= scanner.nextLine();

                            System.out.println("Ingrese el estado:");
                            String estado= scanner.nextLine();

                            System.out.println("Ingrese la placa del vehiculo:");
                            String placa= scanner.nextLine();
                            

                            array[i] = new String[][] {
                                {nomEmpleado},
                                {tipoVehiculo},
                                {marca,modelo,año,estado,placa}
                            };

                        }
                    }else{
                        System.out.println("La capacidad del taller es insuficiente");
                    }

                    // System.out.println(Arrays.deepToString(array));

                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 2:
                if (array != null) {
                    System.out.println("| Nombre | Tipo   | Marca   | Modelo   | Año   | Estado    | Placa  |");
                    System.out.println("|--------|--------|---------|----------|-------|-----------|--------|");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            for (int l = 0; l < array[i][j].length; l++) {
                                System.out.print(array[i][j][l] + "| ");
                            }
                        }
                        System.out.println(); 
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


                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            for (int k = 0; k < array[i][j].length; k++) {
                                if (array[i][j][k] != null) {
                                    String estado = array[i][j][k].toLowerCase();
                                    if (estado.equalsIgnoreCase("pendiente")) {
                                        contP += 1;
                                    } else if (estado.equalsIgnoreCase("reparado")) {
                                        contR += 1;
                                    } else if (estado.equalsIgnoreCase("vendido")) {
                                        contV += 1;
                                    }
                                }
                            }
                        }
                    }
                    

                    System.out.println("Hay "+contP+" vehiculo(s) en estado Pendiente");
                    System.out.println("Hay "+contR+" vehiculo(s) en estado Reparado");
                    System.out.println("Hay "+contV+" vehiculo(s) en estado Vendido");

                    System.out.println("ingrese 1 para hacer registro, 2 para mostrar los vehiculo,3 para ver cuantos vehiculos hay en cada estado, 4 buscar vehiculo, 5 actualizar estado de vehiculo y 6 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 4:
                    scanner.nextLine();
                
                    System.out.println("Ingrese la marca: ");
                    String marcaBuscar = scanner.nextLine().toLowerCase();
                
                    System.out.println("Ingrese el modelo: ");
                    String modeloBuscar = scanner.nextLine().toLowerCase();

                    System.out.println("Ingrese la placa: ");
                    String placaBuscar = scanner.nextLine().toLowerCase();
                
                    boolean encontrado = false;
                
                    for (int i = 0; i < array.length; i++) {
                        if (array[i][2][0].toLowerCase().equalsIgnoreCase(marcaBuscar) && array[i][2][1].toLowerCase().equalsIgnoreCase(modeloBuscar) && array[i][2][4].equalsIgnoreCase(placaBuscar)) {
                            encontrado = true;
                            System.out.println("Vehículo encontrado =>");
                            System.out.println("Empleado: " + array[i][0][0]);
                            System.out.println("Tipo de vehículo: " + array[i][1][0]);
                            System.out.println("Marca: " + array[i][2][0]);
                            System.out.println("Modelo: " + array[i][2][1]);
                            System.out.println("Año: " + array[i][2][2]);
                            System.out.println("Estado: " + array[i][2][3]);
                            System.out.println("Placa: " + array[i][2][4]);
                            break;
                        }
                    }
                
                    if (!encontrado) {
                        System.out.println("Vehículo no encontrado.");
                    }
                
                    System.out.println("Ingrese 1 para hacer registro, 2 para mostrar los vehículos, 3 para ver cuántos vehículos hay en cada estado, 4 buscar vehículo, 5 actualizar estado de vehículo y 6 para salir");
                    opcion = scanner.nextInt();
                    break;
                

                case 5:
                    scanner.nextLine(); 
                
                    System.out.println("Ingrese nombre del empleado:");
                    String nombreEmpleado = scanner.nextLine().toLowerCase();
                
                    System.out.println("Ingrese la marca:");
                    String marcaActualizar = scanner.nextLine().toLowerCase();

                    System.out.println("Ingrese la placa");
                    String placaActualizar=scanner.nextLine().toLowerCase();
                
                    System.out.println("Ingrese el estado a cambiar (pendiente, reparado, vendido):");
                    String estadoActualizar = scanner.nextLine().toLowerCase();
                
                    boolean encontrado2 = false;
                
                    for (int i = 0; i < array.length; i++) {
                        if (array[i][0][0].equalsIgnoreCase(nombreEmpleado) && array[i][2][0].equalsIgnoreCase(marcaActualizar) && array[i][2][4].equalsIgnoreCase(placaActualizar)) {
                            encontrado2 = true;
                            array[i][2][3] = estadoActualizar;
                            System.out.println("**** Estado actualizado correctamente ****");
                            break;
                        }
                    }
                
                    if (!encontrado2) {
                        System.out.println("Vehículo no encontrado para actualizar estado.");
                    }
                
                    System.out.println("Ingrese 1 para hacer registro, 2 para mostrar los vehículos, 3 para ver cuántos vehículos hay en cada estado, 4 buscar vehículo, 5 actualizar estado de vehículo y 6 para salir");
                    opcion = scanner.nextInt();
                    break;
                
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion!=6);
        scanner.close();
    }
}
