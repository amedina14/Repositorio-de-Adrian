import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


        public class Main {

            public static void main(String[] args) {
                //Programa que lea tu nombre y segun tu calificacion dega una letra
                int nota = 0;
                String nom = "";
                BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

                do {
                    System.out.print("Escribe tu nombre: ");
                    try {
                        nom = leer.readLine();
                    } catch (Exception x) {
                        System.out.println("Valor invalido...");
                    }
                    if (nom.matches(".*\\d+.*")) ;
                    {
                        System.out.println("Tiene algun numero en algun lugar");
                    }
                 }while (nom.matches(".*\\d+.*")) ;

                    System.out.print("Introduce tu nota: ");
                    try {
                        nota = Integer.parseInt(leer.readLine());
                    } catch (Exception x) {
                        System.out.print("No ingresaste un numero...");
                        nota = 0;
                    }
                    if (nota >= 91) {
                        System.out.println("Haz sacado una A");
                    } else if (nota >= 81 && nota <= 90) {
                        System.out.println("Haz sacado una B");
                    } else if (nota >= 71 && nota <= 80) {
                        System.out.println("Haz sacado una C");
                    } else {
                        System.out.println("REPROBASTE");
                    }
                }
            }



