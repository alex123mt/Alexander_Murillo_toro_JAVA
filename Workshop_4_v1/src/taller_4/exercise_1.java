// calculadora de promedios
package taller_4;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        double[] notas= new double[10];
        double suma=0;
        scanner.close();
        for (int i = 0; i <notas.length; i++) {
            System.out.println("ingrese numero " + (i+1));
            notas[i]=scanner.nextDouble();
            suma+= notas[i];
            
            
        }
        double promedio=notas.length/suma;
        System.out.println(promedio);
    }
}
