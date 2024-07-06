// secure password or not

import java.util.Scanner;

public class exercise_16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter password: ");
        String password= scanner.nextLine();
        int passwordCharacters= password.length();
        scanner.close();

        if (passwordCharacters>=8){
            if(!password.equals(password.toLowerCase())){
                if (password.matches(".*[a,z].*")){
                    if( password.matches(".*[.!#$%&/?@].*")){
                        System.out.println("Security: true");
        
                    }else{
                        System.out.println("must have at least one special character");
                    }
                }else{
                    System.out.println("must have at least one lowercase character");
                }
            }else{
                System.out.println("the password must have a capital letter");
            }
        }else{
            System.out.println("The password must be at least 8 characters");
        }
    }

}
