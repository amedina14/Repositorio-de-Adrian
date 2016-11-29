import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	//programacion orientado a objetos.
    double saldo = 0.0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Saldo inicial: ");
        try {
            saldo = Double.parseDouble(leer.readLine());

        }catch (IOException e){
            System.out.print("Dato invalido");
        }
        cuenta c1 = new cuenta();// con la palabra (new) defino que es un objeto de una clase
        c1.setBalance(saldo);
        System.out.println("El saldo inicial es de: " + c1.getBalance());
        c1.depositar(50);
        System.out.println("Usted deposito. Tiene: " + c1.getBalance());
        c1.retirar(75);
        System.out.println("Usted retiro. Tiene: " + c1.getBalance());
        c1.depositar(150);
        System.out.println("El saldo final es de : " + c1.getBalance());

    }
}
