// Unit converter

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of kilometers: ");
        double mile= 1.60934;
        double kilometers= scanner.nextDouble();
        scanner.close();
        double convertedValue= kilometers/mile;
        System.out.println(kilometers+" kilometers is equal to "+convertedValue+" miles");
    }
}
