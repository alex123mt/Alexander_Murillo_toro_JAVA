import java.util.HashMap;
import java.util.Map;

public class consultaMap {
    public static void Map(String[] args) {
        /* La Interface Map (java.io.Map) en Java, nos permite representar una estructura de datos para almacenar pares "clave/valor"; de tal manera que para una clave solamente tenemos un valor. Esta estructura de datos también es conocida en otros lenguajes de programación como "Diccionarios", aunque en cada lenguajes esta estructura de datos tiene sus matices.
         */


        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        
        // Devuelve el numero de elementos del Map
        nombreMap.size(); 

        // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.isEmpty(); 

        // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(1, "uno"); 

        // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.get(1); 

        // Borra todos los componentes del Map
        nombreMap.clear(); 

        // Borra todos los componentes del Map
        nombreMap.remove(1); 

        // Borra todos los componentes del Map
        nombreMap.containsKey(1); 

        // Borra todos los componentes del Map
        nombreMap.containsValue("uno");
        
        // Borra todos los componentes del Map
        nombreMap.values(); 
    }
}
