import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
