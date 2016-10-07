package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quiz2 {

    public static void main(String[] args) throws IOException {
	// write your code here

       Double centavos, dolar, euro;

       BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la cantidad en centavos");
        centavos = Double.parseDouble(teclado.readLine());

        System.out.println("Has introducido la cantidad de " + centavos + " centavos");

        dolar = centavos/100;
        euro = dolar * 0.89;

        System.out.println("Los dolares son " + dolar + " dolares");
        System.out.println("Los euros son %.2f " + euro + " euros");

    }
}
