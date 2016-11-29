package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
    int contador =1;

        while (contador <= 10) {
            System.out.println("Contador va por: " + contador);
            contador ++;
        }

        contador = 1;

        do {
            System.out.println("Nuevo contador va por: " + contador);
            contador++;
        } while (contador < 11);

    }
}
