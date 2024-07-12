import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase[]= scanner.nextLine().toLowerCase().split(" ");
        scanner.close();


        for (int i = 0; i < frase.length; i++) {
            for (int j = i; j < frase.length; j++) {
                if (frase[i].equals(frase[j])) {
                    continue;
                }else{
                    System.out.print(frase[i]+" ");
                    break;
                }
            }

        }
        
    }
}
