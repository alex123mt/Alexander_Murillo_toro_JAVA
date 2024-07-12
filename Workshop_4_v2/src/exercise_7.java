// transposicion de matriz

public class exercise_7 {
    public static void main(String[] args) {
        int fila= 3;
        int columna= 3;
        int[][] matriz = new int[fila][columna];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;


        for (int i = 0; i < matriz.length; i++) {
            System.out.println("fila "+i+" ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j] + "]");
                
            }System.out.println();
            
        }
        
        
        int[][] nuevam= new int[columna][fila];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                nuevam[j][i]= matriz[i][j];
            }
        }

        System.out.println("matriz transpuesta");

        for (int i = 0; i < nuevam.length; i++) {
            System.out.println("fila "+i);
            for (int j = 0; j < nuevam.length; j++) {
                System.out.print("["+nuevam[i][j]+"]");
            }
            System.out.println();
        }


    }
}
