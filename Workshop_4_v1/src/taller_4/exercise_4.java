// Planificador de viajes

package taller_4;

import java.util.Scanner;

public class exercise_4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 1 para añadir, 2 para remover, 3 para ver la lista de tus ciudades y 4 para salir");
        int opcion=scanner.nextInt();

        String[] ciudades={};

        do {
            switch (opcion) {
                case 1:
                    System.out.print("ingresa cuantas ciudades va agregar: ");
                    int nciudades=scanner.nextInt();
                    scanner.nextLine();
                    ciudades= new String[nciudades];
                    for (int i = 0; i < nciudades; i++) {
                        System.out.println("ingrese ciudad");
                        String ciudad= scanner.nextLine();
                        ciudades[i]=ciudad;
                    }
                    System.out.println("Ciudades agregadas exitosamente");

                    System.out.println("Ingrese 1 para añadir, 2 para remover, 3 para ver la lista de tus ciudades y 4 para salir");
                    opcion=scanner.nextInt();
                    break;

                case 2:
                    System.out.print("ingresa el numero de ciudad que vas a remover: ");
                    int nciudad=scanner.nextInt();

                    int nuevoTamaño=ciudades.length-1;
                    String[] ciudadremover= new String[nuevoTamaño];
                    
                    int j=0;
                    for (int i = 0; i < ciudades.length; i++) {
                        if (i != nciudad-1) {
                            ciudadremover[j++]=ciudades[i];
                        }
                    }
                    ciudades=ciudadremover;
                    System.out.println("ciudad eliminada exitosamente");
                    System.out.println("Ingrese 1 para añadir, 2 para remover, 3 para ver la lista de tus ciudades y 4 para salir");
                    opcion=scanner.nextInt();
                    break;
                
                case 3:
                    System.out.println("lista de ciudades: ");
                    for (int i = 0; i < ciudades.length; i++) {
                        System.out.println((i+1)+". "+ciudades[i]);
                    }
                    System.out.println("Ingrese 1 para añadir, 2 para remover, 3 para ver la lista de tus ciudades y 4 para salir");
                    opcion=scanner.nextInt();
                    break;

                case 4:
                    System.out.println("saliste del programa");
                    break;
            
                default:
                    break;
            }
            
        } while (opcion!=4);
        scanner.close();
        
    }
}
