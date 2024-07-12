public class exercise_8 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int fila = matriz.length;
        int columna = matriz[0].length;

        if (fila!= columna) {
            System.out.println("la matriz no es cuadrada");
        }

        boolean simetrica=false;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j]== matriz[j][i]) {
                    simetrica=true;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("fila "+i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }


        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}