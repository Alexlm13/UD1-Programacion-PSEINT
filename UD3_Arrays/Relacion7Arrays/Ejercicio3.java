package UD3_Arrays.Relacion7Arrays;

/*Crea un programa que reciba un Array de Strings y un char. 
Deberá mostrar todos los Strings cuya primera letra coincida con el char */

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String palabras=""; 
        char car;
        int tamaño;

        System.out.println("Escriba de que tamaño quiere el array: ");
        tamaño=entrada.nextInt();
        String array[]=new String[tamaño];
        entrada.nextLine(); //para reiniciar la entrada.

        System.out.println("Introduzca los datos del array: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Dato "+(i+1)+": ");
            array[i]=entrada.nextLine();
        }

        System.out.println("");
        System.out.println("Escriba que carácter quieres buscar para mostrar las coincidencias: ");
        car=entrada.nextLine().toLowerCase().charAt(0);

        System.out.println("");
        System.out.println("Las palabras que coinciden son: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().charAt(0)==car) {
                System.out.println(array[i]);
            }
        }
    }
}
