package UD2_Java.Relacion6;
import java.util.*;
//Escribir por pantalla cada carácter de una cadena introducida por teclado

public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduzca una cadena");
        palabra=entrada.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }
}
