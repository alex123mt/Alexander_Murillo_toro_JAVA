import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar,4 para dividir y 5 para salir");
        int opcion= scanner.nextInt();

        do {

            switch (opcion) {
                case 1:
                    System.out.println("ingrese cuantos numeros va sumar");
                    int nsum= scanner.nextInt();
                    scanner.nextLine();
                    int sum=0;
                    for (int i = 0; i < nsum; i++) {
                        System.out.println("ingrese numero"+i);
                        int numero= scanner.nextInt();
                        sum+=numero;
                    }
                

                    System.out.println("la suma es : "+sum);
                    System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar,4 para dividir y 5 para salir");
                    opcion= scanner.nextInt();
                    
                    break;
                case 2:
                    System.out.println("ingrese cuantos numeros va restar");
                    int nrest= scanner.nextInt();
                    scanner.nextLine();
                    int res=0;
                    for (int i = 0; i < nrest; i++) {
                        System.out.println("ingrese numero"+i);
                        int numero= scanner.nextInt();
                        if (i==0) {
                            res=numero;
                        }else{
                            res-=numero;
                        }
                    }
                    System.out.println("la resta es : "+res);
                    System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar,4 para dividir y 5 para salir");
                    opcion= scanner.nextInt();
                    break;

                case 3:
                    System.out.println("ingrese cuantos numeros va multiplicar");
                    int nmult= scanner.nextInt();
                    scanner.nextLine();
                    int mult=0;
                    for (int i = 0; i < nmult; i++) {
                        System.out.println("ingrese numero"+i);
                        int numero= scanner.nextInt();
                        if (i==0) {
                            mult=numero;
                        }else{
                            mult*=numero;
                        }
                    }
                    System.out.println("la multiplicacion es : "+mult);
                    System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar,4 para dividir y 5 para salir");
                    opcion= scanner.nextInt();
                    break;

                case 4:
                    System.out.println("ingrese cuantos numeros va dividir");
                    int ndiv= scanner.nextInt();
                    scanner.nextLine();
                    int div=0;
                    for (int i = 0; i < ndiv; i++) {
                        System.out.println("ingrese numero"+i);
                        int numero= scanner.nextInt();
                        if (i==0) {
                            div=numero;
                        }else{
                            div/=numero;
                        }
                    }
                    System.out.println("la division es : "+div);
                    System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar,4 para dividir y 5 para salir");
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
