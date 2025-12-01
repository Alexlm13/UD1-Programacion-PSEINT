package UD3_Arrays.Relacion7Arrays;

import java.util.*;

/*Escribe un programa que lea 10 numeros por teclado y que luego los muestre en orden inverso
es decir el primero que se introduce es el ultimo en mostrarse */

public class EjercicioClase1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tamaño;
        
        System.out.println("Introduzca el tamaño del array: ");
        tamaño=entrada.nextInt();
        entrada.nextLine();//limpiar la entrada

        int array[]=new int[tamaño];

        System.out.println("Introduce los datos del array: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Dato "+(1+i)+": ");
            array[i]=entrada.nextInt();
        }

        System.out.println("");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
