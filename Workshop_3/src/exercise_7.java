import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase= scanner.nextLine().toLowerCase();
        char[] letras= frase.toCharArray();
        

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (letras[i]==letras[j]) {
                    System.out.println("la letra mas repetida es"+letras[i]);
                    break;
                }
            }
        }
        scanner.close();
    }
}
