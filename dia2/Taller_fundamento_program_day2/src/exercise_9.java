// leap-year

import java.util.Scanner;

public class exercise_9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a year:");
        int year= scanner.nextInt();
        scanner.close();

        if(year%4==0){
            System.out.println("the year "+year+" is a leap year");
        }else if(year%400==0){
            System.out.println("the year "+year+" is a leap year");
        }else if(year%100==0){
            System.out.println("the year "+year+" is not a leap year");
        }else{
            System.out.println("the year "+year+" is not a leap year");
        }
    }
}
