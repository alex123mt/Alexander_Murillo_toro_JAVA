package taller_4;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        int[] num= new int[5];
        int mayor=0;
        int menor=0;
        for (int i = 0; i <num.length; i++) {
            System.out.println("ingrese numero " + (i+1));
            num[i]=scanner.nextInt();
            if (num[i]>mayor) {
                mayor= num[i];
                
            }
            if (num[i]<menor || i==0) {
                menor= num[i];
            }

        }System.out.println("el numero mayor es"+mayor);
        System.out.println("el numero menor es"+menor);
        scanner.close();
    }
}
