import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //arrglos o listas
        int[] name= new int[2];
        name[0]=1;
        // Type[] name =[values];
        
        String[] personas= {"ana","carlos","maria"};
        int[] numeros = new int[3];

        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese 3 numeros ");
        numeros[0]=scanner.nextInt();
        numeros[1]=scanner.nextInt();
        numeros[2]=scanner.nextInt();

        System.out.println(numeros);

        for (int i = 0; i < 3; i++) {
            System.out.println("numero "+ (i+1)+"= "+numeros[i] );
        }

        for(int num: numeros){
            System.out.println("numero "+num);
        }


        // Matrices 

        int[][] matrix= new int[2][3];
        
        // fila 1
        matrix[0][0]= 3; //columna 1
        matrix[0][1]= 4; //columna 2
        matrix[0][2]= 5; //columna 3

        // fila 2
        matrix[1][0]= 3; //columna 1
        matrix[1][1]= 4; //columna 2
        matrix[1][2]= 5; //columna 3
    
        for (int fila= 0; fila<2; fila++){
            System.out.println("fila "+fila);
            for(int columna=0; columna<3; columna++ ){
                System.out.println("columna"+ columna);
            }
        }

        for (int[] filas : matrix) {
            System.out.println("fila "+filas);
            for (int col: filas) {
                System.out.println("col"+ col);
            }
        }




    }
}
