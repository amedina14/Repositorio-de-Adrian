package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        String nombre;
        int edad;
        Double nota;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bienvenid@. Favor introduzca su nombre: ");
        nombre = teclado.readLine();

        System.out.print("Favor introduzca su edad: ");
        edad = Integer.parseInt(teclado.readLine());

        System.out.print("Favor introduzca la nota: ");
        nota = Double.parseDouble(teclado.readLine());

        System.out.println("Tu nombre es: " + nombre + "y tienes " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        if (nota >= 91) {
            System.out.println("Tu nota final es A");
        } else if (nota >= 81) {
            System.out.println("Tu nota final es B");
        } else if (nota >= 71) {
            System.out.println("Tu nota final es C");
        }
    }
}