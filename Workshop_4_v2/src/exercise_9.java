// contar coincidencia en un array

public class exercise_9 {
    public static void main(String[] args) {
        String[] lista = {"papa", "yuca", "cuchillo","papa", "carro", "moto", "yuca","papa"};

        int[] cont = new int[lista.length];
        boolean[] rep = new boolean[lista.length];

        for (int i = 0; i < lista.length; i++) {
            cont[i] = 1;
            rep[i] = false;
        }

        for (int i = 0; i < lista.length; i++) {
            if (!rep[i]) {
                for (int j = i + 1; j < lista.length; j++) {
                    if (lista[i].equals(lista[j])) {
                        cont[i]++;
                        rep[j] = true;
                    }
                }
            }
        }

        int max = 0;
        int iMax = 0;
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > max) {
                max = cont[i];
                iMax = i;
            }
        }

        System.out.println("La palabra " + lista[iMax] + " se repite " + max + " veces");

        int Max2 = 0;
        int iMax2 = 0;
        for (int i = 0; i < cont.length; i++) {
            if (i != iMax && cont[i] > Max2) {
                Max2 = cont[i];
                iMax2 = i;
            }
        }

        System.out.println("La palabra " + lista[iMax2] + " se repite " + Max2 + " veces");

    }
}
