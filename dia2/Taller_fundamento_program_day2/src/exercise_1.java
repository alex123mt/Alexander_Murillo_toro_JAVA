// calculator

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int num1= scanner.nextInt();

        System.out.println("Enter another number");
        scanner.nextLine();
        int num2= scanner.nextInt();

        System.out.println("Enter 1:add, 2:subtract, 3:multiply, 4:split");
        scanner.nextLine();
        int select= scanner.nextInt();
        scanner.close();
        switch (select) {
            case 1:
                int add= num1+num2;
                System.out.println("The add is: "+add);
                break;
            case 2:
                int subtract= num1-num2;
                System.out.println("The substract is"+subtract);
                break;
            case 3:
                int multiply= num1*num2;
                System.out.println("The multiply is"+multiply);
            case 4:
                int split= num1/num2;
                System.out.println("The split is"+split);
                break;
            default:
                break;
        }
        
    }
}
