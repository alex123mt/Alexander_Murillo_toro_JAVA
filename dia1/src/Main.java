import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        //primitive data type 
        //type 
        byte isByte = 100;
        short isShort = 1000;
        int isInt = 1000000;
        long isLong = 1000000000;
        float isFloat = 100.5f;
        double isDouble = 100.5;
        boolean isBoolean = true;
        char isChar = ' ';
        boolean isBool = false;

        int sum0= isByte+isShort;
        long sum= isByte + isShort+isInt+isLong;
        double sum2= isFloat*10+ isDouble;
        
        float sum3= isInt+isFloat;
        System.out.println(sum3);
        System.out.println(sum0);
        System.out.println(sum);
        System.out.println(sum2);


        //Scanner
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese su edad");
        int age= scanner.nextInt();

        System.out.println("ingrese su Nombre");
        scanner.nextLine();
        String Textinput= scanner.nextLine();

        System.out.println("dime tu numero favorito ");
        double myNum= scanner.nextDouble();
        isDouble= 50.2;

        scanner.close();

        
        if (age>17){
            System.out.println("Eres mayor de edad "+Textinput);
        }else if(age==12){
            System.out.println("Eres menor de edad "+Textinput);
        }


        switch (age) {
            case 12:
                System.out.println("el numero es 12");
                break;
        
            default:
                break;
        }
    }
}
