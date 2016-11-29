import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	//Programa de mapa
        Map mapA = new HashMap<>();
        //Map mapA = new TreeMap();

        mapA.put("key1", "vaule1");
        mapA.put("key2", "vaule2");
        mapA.put("key3", "vaule3");

        String elemento = (String) mapA.get("key1");

        for(Object llave : mapA.keySet()){
            Object valor = mapA.get(llave);
            System.out.println(llave + " : " + valor);
        }

    }
}
