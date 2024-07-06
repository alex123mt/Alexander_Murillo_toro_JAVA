// temperature converter

import java.util.Scanner;

public class exercise_14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1:celsius to Fahrenheit or 2:Fahrenheit to celsius");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Enter temperature in celsius");
                double Celsius = scanner.nextDouble();
                double ConvertCtoF= (Celsius*9/5)+32;
                System.out.println(Celsius+"°C is equal to "+ConvertCtoF+"°F");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit");
                double Fahrenheit = scanner.nextDouble();
                double ConvertFtoC= (Fahrenheit-32)*5/9;
                System.out.println(Fahrenheit+"°F is equal to "+ConvertFtoC+"°C");
                break;
            default:
                scanner.close();
                System.out.println("Invalid option");
                break;
        }
    }
}
