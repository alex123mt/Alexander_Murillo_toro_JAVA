import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        var sum= 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("ingrese nota"+(i+1));
            double nota=scanner.nextDouble();
            if (nota>100) {
                System.out.println("nota no valida");
                break;
            }else{
                System.out.println("nota valida");
                sum+=nota;

                continue;
            }
            
        }
        var prom= sum/10;
        
        if (prom>=76) {
            System.out.println("Aprobaste con un promedio de: "+prom);
        }else{
            System.out.println("Reprobaste con un promedio de: "+prom);
        }

        scanner.close();
    }
}
