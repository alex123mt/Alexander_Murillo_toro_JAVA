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
        int year=2024;
        int month=7;
        int day= 5;

        int age= year-yearOfBirth;

        if (month<monthOfBirth || month==monthOfBirth && day<dayOfBirth){
            --age;
        }

        System.out.println(age);

        if(age>=18){
            System.out.println("you are "+age+" years old and of legal age");
        }else{
            System.out.println("you are "+age+" years old and not of legal age");
        }

    }
}

//INCOMPLETO