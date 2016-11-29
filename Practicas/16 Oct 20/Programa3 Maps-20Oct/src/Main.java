import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Programa de mapa
        Map<String, Integer> mapA = new HashMap<>();
        //Map mapA = new TreeMap();

        mapA.put("Abuelo", Integer.valueOf("100"));
        mapA.put("Padre", Integer.valueOf("50"));
        mapA.put("Hijo", Integer.valueOf("25"));

        int elemento =  mapA.get("Abuelo");
        System.out.println("El elemento es "+elemento);

        //mapA.remove("Padre"); --> quito el elemento del diccionario

        for(Object llave : mapA.keySet()){
            Object valor = mapA.get(llave);
            System.out.println(llave + " : " + valor);
        }

    }
}
