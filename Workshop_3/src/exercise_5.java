import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();
        int n1=0;

        for (int i = num-1; i >0; i--) {
            int factorial= num*i;
            n1=num;
            num=factorial;
            System.out.println(n1 + " * " + i + " = " + num);
            
        }
    }
}
