package UD3_Arrays.Relacion7Arrays;
//Crea un programa que reciba un Array de Strings y muestre el String más largo

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño, longitud, mayorQue = 0;
        String cadena = "", larga = "";

        System.out.println("Introduzca de cuanto quiere el array");
        tamaño = entrada.nextInt();
        String array[] = new String[tamaño];
        entrada.nextLine();

        System.out.println("Introduce los datos del array");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Dato " + (i + 1) + ": ");
            array[i] = entrada.nextLine();

            if (array[i].length() > larga.length()) {
                larga = array[i];
            }
        }

        System.out.println("La cadena más larga es: " + larga);
    }
}
