import java.util.ArrayList;

public class consultaArraylist {
    public static void main(String[] args) {
        /*La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica, es decir, que no es necesario declarar su tamaño como pasa con los Arrays. Para todos aquellos que hayáis estudiado en alguna asignatura las estructuras de datos de las Pilas, Colas, Listas, Arboles (AVL, B, B+, B*) etc.  */


        ArrayList<String> ejemplo1 = new ArrayList<>();

        //metodo add sirve para agregar los elementos de un objeto al arraylist
        ejemplo1.add("Cancion 1");
        ejemplo1.add("Cancion 2");

        //metodo add sirve para agregar los elementos de un objeto al arraylist en la posicion 2
        ejemplo1.add(2,"Cancion 3");

        //metodo size sirve para imprimir el tamaño del arraylist
        ejemplo1.size();

        //metodo get sirve para imprimir el elemento que esta en la posicion 0
        ejemplo1.get(0);

        //metodo contains sirve para comprobar si existe el elemento que se ponga en los ()
        ejemplo1.contains("cancion 1");

        //metodo indexOf sirve para imprimir la primera posicion en la que encuentre lo que se pone en el string
        ejemplo1.indexOf("cancion 1");

        //metodo lastIndexOf sirve para imprimir la ultima posicion en la que encuentre lo que se pone en el string
        ejemplo1.lastIndexOf("cancion 1");

        //metodo remove sirve para eliminar el elemento que se pone en los ()
        ejemplo1.remove(2);
        
        //borra la primera coincidencia del elemento que se pase en los ()
        ejemplo1.remove("cancion 1");

        //metodo borra todo lo que este en el arraylist
        ejemplo1.clear();

        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
        ejemplo1.isEmpty();  

        // Copiar un ArrayList 
        ArrayList arrayListCopia = (ArrayList) ejemplo1.clone(); 

        System.out.println(arrayListCopia);

        // Pasa el ArrayList a un Array 
        Object[] array = ejemplo1.toArray(); 
        
        System.out.println(ejemplo1.toString());
    }

    

    // public static void oop(String[] args) {
        
    // }

}
