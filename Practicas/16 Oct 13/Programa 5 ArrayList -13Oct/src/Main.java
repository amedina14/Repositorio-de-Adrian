import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
	    //prograa qie imprime una lista
        List<Integer> lista = Arrays.asList(3,2,1,4,5,6,6);
        for (Integer entero : lista) {
            System.out.println(entero);
        }
        List<String> lista2 = new ArrayList<>();
        lista2.add("Juan");
        lista2.add("Pedro");
        lista2.add("andres");
        for (String nombre : lista2){
            System.out.println(nombre);
        }
        //List<String> lista3 = Arrays.asList("Zoraida", "Cristina" ,"Manuela");
        List<String> lista3 = new ArrayList<>();
        lista3.add("Zoraida");
        lista3.add("Cristina");
        lista3.add("Manuela");
        lista3.sort(null);
        lista3.forEach(System.out::println);
        lista3.forEach((n1)->System.out.println("Nombre: "+n1));
        lista3.remove(2);
        lista3.forEach((n1)->System.out.println("Nombre: "+n1));
        lista3.removeIf(n1-> n1.toUpperCase().contains("C"));
        lista3.forEach((n1)->System.out.println("Nombre: "+n1));
    }
}
