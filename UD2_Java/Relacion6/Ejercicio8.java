package UD2_Java.Relacion6;
import java.util.*;

/*Realizar un programa que lea una cadena por teclado y 
convierta las mayúsculas a minúsculas y viceversa */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena, resultado="";
        char c;

        System.out.println("Introduzca una cadena:");
        cadena=entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            c=cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                resultado+=Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                resultado+=Character.toUpperCase(c);
            } else {
                resultado+=c;
            }
        }
        System.out.println("El resultado del cambio es: "+resultado);
    }
}
