package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String nombre;
        int edad;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bienvenid@. Favor introduzca su nombre: ");
        nombre = teclado.readLine();

        System.out.print("Favor introduzca su edad: ");
        edad = Integer.parseInt(teclado.readLine());

        System.out.println("Tu nombre es: " + nombre + "y tienes " + edad + " años.");

    }
}
