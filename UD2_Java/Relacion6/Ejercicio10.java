package UD2_Java.Relacion6;
import java.util.*;

/*Introducir una cadena de caracteres e indicar si es un palíndromo. 
Una palabra palíndroma es aquella que se lee igual adelante que atrás*/

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena, reves="";

        System.out.println("Introduzca una cadena: ");
        cadena=entrada.nextLine();

        cadena=cadena.toLowerCase();
        cadena=cadena.replaceAll(" ", "");

        for (int i = cadena.length()-1; i >= 0; i--) {
            reves+=cadena.charAt(i);
        }

        if (reves.equals(cadena)) {
            System.out.println("Es palíndromo");
        }else{
            System.out.println("No es un palíndromo");
        }
    }
}