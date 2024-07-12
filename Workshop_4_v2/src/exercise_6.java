// busqueda por coincidencia

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] words = {"jose","pablo","ricardo","pedro"};
        System.out.println("ingrese un nombre: ");
        String name = scanner.nextLine();
        boolean busqueda= false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(name)) {
                System.out.println("el nombre "+name+" se encuentra en la posicion "+i);
                busqueda=true;
            }
        }
        if (!busqueda) {
            System.out.println("el nombre no se encuentra");
        }

        scanner.close();
    }
}
