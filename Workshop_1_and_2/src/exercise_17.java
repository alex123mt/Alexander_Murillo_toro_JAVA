// character identifier

import java.util.Scanner;

public class exercise_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        String character= scanner.nextLine();
        scanner.close();
        switch (character) {
            case "a":
                System.out.println("the character is a vowel");
                break;
            case "e":
                System.out.println("the character is a vowel");
                break;
            case "i":
                System.out.println("the character is a vowel");
                break;
            case "o":
                System.out.println("the character is a vowel");
                break;
            case "u":
                System.out.println("the character is a vowel");
                break;
        
            default:
                if(character.matches(".*[a,z].*")){
                    System.out.println("the character is a consonant");
                }else{
                    System.out.println("the character is special");
                }
                break;
        }
    }
}
