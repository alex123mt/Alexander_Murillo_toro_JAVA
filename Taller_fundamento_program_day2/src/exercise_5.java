// Number sorter

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();

        if (num>0){
            System.out.println("The number is positive");
            
        }else if(num<0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }

        if(num%2 ==0){
            System.out.println("The number "+num+" is even");
        }else{
            System.out.println("The number "+num+" is odd");
        }
    }
    
}
