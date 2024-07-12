// lista de reproduccion musical

package taller_4;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 1 para añadir cancion, 2 para remover,3 para seleccionar cancion, 4 para mostrar cancion actual y las siguientes, 5 para saltar a la siguiente cancion y 6 para salir");
        int opcion=scanner.nextInt();

        String[] canciones={};

        do {
            switch (opcion) {
                case 1:
                    System.out.print("ingresa cuantas canciones va agregar: ");
                    int ncanciones=scanner.nextInt();
                    scanner.nextLine();
                    canciones= new String[ncanciones];
                    for (int i = 0; i < ncanciones; i++) {
                        System.out.println("ingrese cancion");
                        String ciudad= scanner.nextLine();
                        canciones[i]=ciudad;
                    }
                    System.out.println("canciones agregadas exitosamente");

                    System.out.println("Ingrese 1 para añadir cancion, 2 para remover,3 para seleccionar cancion, 4 para mostrar cancion actual y las siguientes, 5 para saltar a la siguiente cancion y 6 para salir");
                    opcion=scanner.nextInt();
                    break;

                case 2:
                    System.out.print("ingresa el numero de cancion que vas a remover: ");
                    int nciudad=scanner.nextInt();

                    int nuevoTamaño=canciones.length-1;
                    String[] cancionremover= new String[nuevoTamaño];
                    
                    int j=0;
                    for (int i = 0; i < canciones.length; i++) {
                        if (i != nciudad-1) {
                            cancionremover[j++]=canciones[i];
                        }
                    }
                    canciones=cancionremover;
                    System.out.println("Cancion eliminada exitosamente");
                    System.out.println("Ingrese 1 para añadir cancion, 2 para remover,3 para seleccionar cancion, 4 para mostrar cancion actual y las siguientes, 5 para saltar a la siguiente cancion y 6 para salir");
                    opcion=scanner.nextInt();
                    break;

                case 3:
                    System.out.println("Seleccionar cancion: ");
                    for (int i = 0; i < canciones.length; i++) {
                        System.out.println((i+1)+". "+canciones[i]);
                    }
                    System.out.println("Ingrese 1 para añadir cancion, 2 para remover,3 para seleccionar cancion, 4 para mostrar cancion actual y las siguientes, 5 para saltar a la siguiente cancion y 6 para salir");
                    opcion=scanner.nextInt();
                    break;
                
                case 4:
                    System.out.println("lista de ciudades: ");
                    for (int i = 0; i < canciones.length; i++) {
                        System.out.println((i+1)+". "+canciones[i]);
                    }
                    System.out.println("Ingrese 1 para añadir cancion, 2 para remover,3 para seleccionar cancion, 4 para mostrar cancion actual y las siguientes, 5 para saltar a la siguiente cancion y 6 para salir");
                    opcion=scanner.nextInt();
                    break;

                case 6:
                    System.out.println("saliste del reproductor");
                    break;
            
                default:
                    break;
            }
            
        } while (opcion!=6);
        scanner.close();
        
    }
}
