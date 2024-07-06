// Body Mass Index Calculator

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        float weight = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter your height in meters: ");
        float height = scanner.nextFloat();
        scanner.close();
        double BMI = weight / Math.pow(height,2);
        System.out.println("Your Body Mass Index is: "+BMI);
    }
}
