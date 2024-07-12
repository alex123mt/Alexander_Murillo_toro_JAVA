// sistema de reservas

package taller_4;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean[][] asientos= new boolean[5][10];
        
        System.out.println("ingrese 1 para reservar, 2 para cancelar,3 para ver asientos disponibles, 4 para numero de asientos ocupados y disponibles, y 5 para salir ");
        int opcion= scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la fila y asiento que desea reservar");
                    int fila=scanner.nextInt();
                    scanner.nextLine();
                    int asiento=scanner.nextInt();
                    scanner.nextLine();
                    
                    if(asientos[fila][asiento]){
                        System.out.println("El asiento está ocupado");
                    }else{
                        System.out.println("El asiento está libre");
                        System.out.println("deseas reservar este asiento si= 1 |no= 2? ");
                        int reservar= scanner.nextInt();
                        if(reservar==1){
                            asientos[fila][asiento]=true;
                            System.out.println("Reserva realizada con éxito");
                        }else{
                            System.out.println("reserva no realizada");
                        }
                    }
                    System.out.println("ingrese 1 para reservar, 2 para cancelar,3 para ver asientos disponibles, 4 para numero de asientos ocupados y disponibles, y 5 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Ingrese la fila y asiento que desea cancelar");
                    int filaCancelar=scanner.nextInt();
                    scanner.nextLine();
                    int asientoCancelar=scanner.nextInt();
                    scanner.nextLine();
                    
                    if(!asientos[filaCancelar][asientoCancelar]){
                        System.out.println("El asiento no está reservado");
                    }else{
                        System.out.println("estas seguro de cancelar este asiento si= 1 |no= 2? ");
                        int reservar= scanner.nextInt();
                        if(reservar==1){
                            asientos[filaCancelar][asientoCancelar]=false;
                            System.out.println("Asiento cancelado");
                            
                        }else{
                            System.out.println("Asiento no cancelado");
                            
                        }
                    }
                    System.out.println("ingrese 1 para reservar, 2 para cancelar,3 para ver asientos disponibles, 4 para numero de asientos ocupados y disponibles, y 5 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 3:
                    for (int filas=0; filas < 5; filas++) {
                        System.out.println("fila "+(filas));
                        for (int asient = 0; asient < 10; asient++) {
                            if (asientos[filas][asient]==false) {
                                System.out.println("asiento "+(asient)+"= disponible");
                                
                            }else{
                                System.out.println("asiento "+(asient)+"= **No disponible**");
                                continue;
                            }
                        }
                    }
                    System.out.println("ingrese 1 para reservar, 2 para cancelar,3 para ver asientos disponibles, 4 para numero de asientos ocupados y disponibles, y 5 para salir ");
                    opcion= scanner.nextInt();
                    break;

                case 4:
                        int disponibles=0;
                        int ocupados=0;
                        for (int filas=0; filas < 5; filas++) {
                            for (int asient = 0; asient < 10; asient++) {
                                if (asientos[filas][asient]==false) {                                    
                                    disponibles++;
                                }else{
                                    ocupados++;
                                }
                            }
                        }
                        System.out.println("asientos disponibles: "+disponibles);
                        System.out.println("asientos ocupados: "+ocupados);

                        System.out.println("ingrese 1 para reservar, 2 para cancelar,3 para ver asientos disponibles, 4 para numero de asientos ocupados y disponibles, y 5 para salir ");
                        opcion= scanner.nextInt();
                    break;
                    
                case 5:
                    System.out.println("saliste del programa");
                    break;
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion!=5);
        scanner.close();
    }
}
