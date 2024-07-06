// day of the month calculator

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month= scanner.nextInt();
        scanner.close();
        switch (month) {
            case 1:
                System.out.println("Month: January, has 31 days");
                break;
            case 2:
                System.out.println("Month: February, has 28 days");
                break;
            case 3:
                System.out.println("Month: March, has 31 days");
                break;
            case 4:
                System.out.println("Month: April, has 30 days");
                break;
            case 5:
                System.out.println("Month: May, has 31 days");
                break;
            case 6: 
                System.out.println("Month: June, has 30 days");
                break;
            case 7:
                System.out.println("Month: July, has 31 days");
                break;
            case 8:
                System.out.println("Month: August, has 31 days");
                break;
            case 9:
                System.out.println("Month: September, has 30 days");
                break;
            case 10:
                System.out.println("Month: October, has 31 days");
                break;
            case 11:
                System.out.println("Month: November, has 30 days");
                break;
            case 12:
                System.out.println("Month: December, has 31 days");
                break;
            default:
                break;
        }
    }
}
