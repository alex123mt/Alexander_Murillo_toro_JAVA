// facturacion de una tienda

import java.util.ArrayList;
import java.util.Scanner;

public class exercise_2and_4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese 1 para comprar, 2 para ver productos y precio,3 para ver el total de la compra y 4 para salir");
        int opcion= scanner.nextInt();
        String[] productos= {"carne","papa","leche","huevos","cerverza"};
        int[] precios={15000,5000,3200,18000,3800};

        ArrayList<String> productoscl=new ArrayList<>();
        ArrayList<Integer> precioscl=new ArrayList<>(); 


        do {
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el producto que desea comprar");
                    scanner.nextLine();
                    String producto= scanner.nextLine();
                    System.out.println("ingrese la cantidad que desea comprar");
                    int cantidad= scanner.nextInt();

                    boolean encontrado = false;
                    for (int j = 0; j < productos.length; j++) {
                        if (productos[j].equalsIgnoreCase(producto)) {
                            productoscl.add(productos[j]);
                            precioscl.add(precios[j]*cantidad);
                            System.out.println("se agregó " + productos[j]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("no se encontró el producto");
                    }

                    

                    System.out.println("ingrese 1 para comprar, 2 para ver productos y precio,3 para ver el total de la compra y 4 para salir");
                    opcion= scanner.nextInt();
                    break;
                    
                case 2:
                    System.out.println("Productos disponibles:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.print(productos[i]+":");
                        System.out.println(precios[i]);
                    }
                    System.out.println("ingrese 1 para comprar, 2 para ver productos y precio,3 para ver el total de la compra y 4 para salir");
                    opcion= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("----------Total de la compra----------");
                    int total=0;
                    for (int i = 0; i < productoscl.size(); i++) {
                        System.out.println(productoscl.get(i)+" : "+precioscl.get(i));
                        total+=precioscl.get(i);
                    }
                    System.out.println("Total: "+total);

                    if(total>=1000){
                        System.out.println("Descuento de 25% aplicado");
                        total=total-total*25/100;
                        System.out.println("Total con descuento: "+total);
                    }else if(total>=500){
                        System.out.println("Descuento de 20% aplicado");
                        total=total-total*20/100;
                        System.out.println("Total con descuento: "+total);
                    }else if(total>=300){
                        System.out.println("Descuento de 15% aplicado");
                        total=total-total*15/100;
                        System.out.println("Total con descuento: "+total);
                    }else if(total>=200){
                        System.out.println("Descuento de 10% aplicado");
                        total=total-total*10/100;
                        System.out.println("Total con descuento: "+total);
                    }else if(total<200){
                        System.out.println("No se aplica descuento");
                    }


                    System.out.println("ingrese 1 para comprar, 2 para ver productos y precio,3 para ver el total de la compra y 4 para salir");
                    opcion= scanner.nextInt();
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
