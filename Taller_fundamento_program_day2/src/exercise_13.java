// taxi fare

import java.util.Scanner;

public class exercise_13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the distance traveled in kilometers:");
        double distance= scanner.nextDouble();
        scanner.close();
        double BaseRate= 4300;
        double RateKilometer= 1300;
        double taxiFare= BaseRate+(distance*RateKilometer);
        System.out.println("The taxi fare costs: "+taxiFare);
    }
}
