// average

import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        float num1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter a second number");
        float num2= scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter a third number");
        float num3= scanner.nextFloat();
        scanner.close();
        float average= num1+num2+num3 /3;
        System.out.println("The average of the three numbers is: "+average);
    }
}
