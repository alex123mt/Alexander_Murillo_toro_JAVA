// age calculator

import java.util.Scanner;

public class exercise_19 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter your month of birth");
        int monthOfBirth = scanner.nextInt();
        System.out.println("Enter your day of birth");
        int dayOfBirth = scanner.nextInt();
        scanner.close();
        int age= 2024-yearOfBirth;
        if(age>=18){
            System.out.println("you are "+age+" years old and of legal age");
        }else{
            System.out.println("you are "+age+" years old and not of legal age");
        }

    }
}

//INCOMPLETO