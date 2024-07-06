// horoscope generator

import java.util.Scanner;

public class exercise_12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter month of birth number");
        int month= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter day of birth number");
        int day= scanner.nextInt();
        scanner.close();


        switch (month) {
            case 1:
                if (day>=20 && day<=31){
                    System.out.println("Your Horoscope: Aquarius");
                }else if(day>=1 && day<20){
                    System.out.println("Your Horoscope: Capricorn");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 2:
                if (day>=1 && day<=18){
                    System.out.println("Your Horoscope: Aquarius");
                }else if(day>18 && day<=28){
                    System.out.println("Your Horoscope: Pisces");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 3:
                if (day>=1 && day<=20){
                    System.out.println("Your Horoscope: Pisces");
                }else if(day>20 && day<=31){
                    System.out.println("Your Horoscope: Aries");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 4:
                if (day>=1 && day<=19){
                    System.out.println("Your Horoscope: Aries");
                }else if(day>=20 && day<=30){
                    System.out.println("Your Horoscope: Taurus");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 5:
                if (day>=1 && day<=20){
                    System.out.println("Your Horoscope: Taurus");
                }else if(day>20 && day<=31){
                    System.out.println("Your Horoscope: Gemini");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 6: 
                if (day>=1 && day<=20){
                    System.out.println("Your Horoscope: Gemini");
                }else if(day>20 && day<=30){
                    System.out.println("Your Horoscope: Cancer");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 7:
                if (day>=1 && day<=22){
                    System.out.println("Your Horoscope: Cancer");
                }else if(day>22 && day<=31){
                    System.out.println("Your Horoscope: Leo");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 8:
                if (day>=1 && day<=22){
                    System.out.println("Your Horoscope: Leo");
                }else if(day>22 && day<=31){
                    System.out.println("Your Horoscope: Virgo");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 9:
                if (day>=1 && day<=20){
                    System.out.println("Your Horoscope: Virgo");
                }else if(day>20 && day<=30){
                    System.out.println("Your Horoscope: Libra");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 10:
                if (day>=1 && day<=22){
                    System.out.println("Your Horoscope: Libra");
                }else if(day>22 && day<=31){
                    System.out.println("Your Horoscope: Scorpio");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 11:
                if (day>=1 && day<=21){
                    System.out.println("Your Horoscope: Scorpio");
                }else if(day>21 && day<=30){
                    System.out.println("Your Horoscope: Sagittarius");
                }else{
                    System.out.println("The day does not exist");
                }
                break;
            case 12:
                if (day>=1 && day<=21){
                    System.out.println("Your Horoscope: Sagittarius");
                }else if(day>21 && day<=31){
                    System.out.println("Your Horoscope: Capricorn");
                }else{
                    System.out.println("The day does not exist");
                }    
                break;
            default:
                break;
        }
    }
}
