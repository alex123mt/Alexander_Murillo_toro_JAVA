// buscar palabra   

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase= scanner.nextLine();

        System.out.println("Ingrese una palabra a buscar");
        String palabra= scanner.nextLine();

        int posicion= frase.indexOf(palabra);
        if(posicion==-1){
            System.out.println("La palabra no se encuentra en la frase");
        }else{
            System.out.println("La palabra se encuentra en la frase en la posición: "+posicion);
        }

        scanner.close();
    }
    
}
