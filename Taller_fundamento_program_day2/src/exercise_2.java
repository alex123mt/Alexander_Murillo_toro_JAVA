// age verifier

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.close();

        if (age>17){
            System.out.println("You are of legal age");
        }else{
            System.out.println("You are not of legal age");
        }
    }
}
