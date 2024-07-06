// grading system

import java.util.Scanner;

public class exercise_15 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a grade from 0-100");
        int grade= scanner.nextInt();
        scanner.close();
        if (grade>=90 && grade<=100){
            System.out.println("Your grade is A");
        }else if(grade>=80 && grade<=99){
            System.out.println("Your grade is B");
        }else if(grade>=70 && grade<=89){
            System.out.println("Your grade is C");
        }else if(grade>=60 && grade<=79){
            System.out.println("Your grade is D");
        }else if(grade>=50 && grade<=69){
            System.out.println("Your grade is F");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
