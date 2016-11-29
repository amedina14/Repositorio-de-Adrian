import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        //Programa que disminulla
        int edad;
        String nombre;
        Map<String, Integer> persona = new HashMap<>();
        //Map<String, Integer> persona = new TreeMap<>(); -->El Tree map sirve para ubicar en forma alfabetica
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 3; i >0; i--){
            System.out.print("nombre > ");
            nombre = leer.readLine();
            System.out.printf("Edad > ");
            edad = Integer.parseInt(leer.readLine());
            persona.put(nombre, edad);
        }

        for(String llave : persona.keySet()){
            int valor = persona.get(llave);
             if(valor >= 18) {
                System.out.println(llave+ " eres mayor");
             }else{
                System.out.println(llave+" eres menor");
            }
        }

    }
}