import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    String nombre;
        int edad;
        double nota;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bienvenido. Favor introdusca su nombre: ");
        nombre = teclado.readLine();

        System.out.print("Favor introduca su edad: ");
        edad = Integer.parseInt(teclado.readLine());

        System.out.print("Favor intrudusca su nota: ");
        nota = Double.parseDouble(teclado.readLine());


        System.out.println("Tu nombre es " + nombre + " y tienes " +edad+ " años.");

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        if(nota>=91){
            System.out.println("Obtuvo una A");
        }else if(nota>=81){
            System.out.println("obtuvo una B");
        }else if(nota>=71){
            System.out.println("Obtuvo una C");
        }else {
            System.out.println("Fracasaste");
        }

    }
}
