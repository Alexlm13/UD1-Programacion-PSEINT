package UD2_Java.Relacion6;
/*Suponiendo que hemos introducido una cadena por teclado que representa una frase 
(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene */

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String frase;
        int contador=0;

        System.out.println("Escriba una frase.");
        frase=entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') {
                contador++;
            }
        }

        System.out.println("Su frase contiene: "+contador+" espacios.");
    }
}
