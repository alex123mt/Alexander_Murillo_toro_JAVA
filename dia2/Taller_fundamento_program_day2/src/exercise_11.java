// order numbers

import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a third number");
        int num3 = scanner.nextInt();
        scanner.close();

        if (num1>num2 && num1>num3){
            if (num2>num3 && num2<num1) {
                System.out.println("numbers: "+num3 +","+num2+","+num1);
            }else{
                System.out.println("numbers: "+num2+"," +num3+","+num1);
            }
        }else if(num2>num1 && num2>num3){
            if (num1>num3 && num1<num2) {
                System.out.println("numbers: "+num3+"," +num1+","+num2);
            }else{
                System.out.println("numbers: "+num1+"," +num3+","+num2);
            }
        }else if(num3>num2 && num3>num1){
            if (num1>num2 && num1<num3) {
                System.out.println("numbers: "+num2+"," +num1+","+num3);
            }else{
                System.out.println("numbers: "+num1+"," +num2+num3);
            }
        }else{
            System.out.println("Error: All numbers are equal");
        }

        String output = (num1 > num2 && num1 > num3)
        ? (num2 > num3 && num2 < num1) ? "numbers: " + num3 + "," + num2 + "," + num1
                                        : "numbers: " + num2 + "," + num3 + "," + num1
        : (num2 > num1 && num2 > num3)
            ? (num1 > num3 && num1 < num2) ? "numbers: " + num3 + "," + num1 + "," + num2
                                        : "numbers: " + num1 + "," + num3 + "," + num2
            : (num3 > num2 && num3 > num1)
            ? (num1 > num2 && num1 < num3) ? "numbers: " + num2 + "," + num1 + "," + num3
                                        : "numbers: " + num1 + "," + num2 + "," + num3
            : "Error: All numbers are equal";
        System.out.println(output);
    }
}

