// tip calculator

import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the account total");
        float total = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the tip percentage you want to leave.");
        float tipPercentage = scanner.nextFloat();
        scanner.close();
        float tipAmount = (total * tipPercentage) / 100;
        System.out.println("You should leave a tip: "+tipAmount);
    }
}
