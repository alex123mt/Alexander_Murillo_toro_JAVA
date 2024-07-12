// Rock, paper, scissors game:

import java.util.Scanner;

public class exercise_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (1:rock, 2:paper, 3:scissors)");
        int select= scanner.nextInt();
        scanner.close();
        int random = (int)(Math.random()*3)+1;

        switch (select) {
            case 1:
                if(random==1){
                    System.out.println("equals");
                }else if(random==2){
                    System.out.println("perdio");
                }else{
                    System.out.println("ganó");
                }
                break;

            case 2:
                if(random==1){
                    System.out.println("ganó");

                }else if(random==2){
                    System.out.println("equals");
                }else{
                    System.out.println("perdio");
                }
                break;
            
            case 3:
                if(random==1){
                    System.out.println("perdio");
                }else if(random==2){
                    System.out.println("ganó");
                }else{
                    System.out.println("equals");
                }
        
            default:
                break;
        }
        System.out.println("random: "+random);
        System.out.println("select :"+select);

    }
}
