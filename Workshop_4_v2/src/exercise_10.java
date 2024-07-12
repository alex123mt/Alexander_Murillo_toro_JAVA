// invertir un array

import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.println("ingrese elemento"+i);
            int elemento= scanner.nextInt();
            array[i]=elemento;
        }

        System.out.println("Array original: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
            
        }
        
        int ini = 0;
        int fin = array.length - 1;
        
        while (ini < fin) {
            int temp = array[ini];
            array[ini] = array[fin];
            array[fin] = temp;
            ini++;
            fin--;
        }
        System.out.println();
        
        System.out.println("Array invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        scanner.close();
    }
}
