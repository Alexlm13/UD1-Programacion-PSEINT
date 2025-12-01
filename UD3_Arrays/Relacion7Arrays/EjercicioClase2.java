package UD3_Arrays.Relacion7Arrays;
/*Escribe un programa que lea 15 numeros por teclado y que los almacene en un array.
Tora los elementos de ese array, es decir, el elemento de la posicion 0 debe pasar a la posicion 1 etc
El numero que se encuentra en la ultima posicion debe pasar a la posicion 0 finalmente muestra el contenido del array */

import java.util.*;

public class EjercicioClase2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tamaño, ultimo;

        System.out.println("Escriba el tamaño del array");
        tamaño=entrada.nextInt();
        entrada.nextLine();//limpiamos la entrada

        int array[]=new int[tamaño];

        System.out.println("");
        System.out.println("Añada los datos del array: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Dato "+(i+1)+": ");
            array[i]=entrada.nextInt();
        }

        //guardamos el ultimo array
        ultimo=array[tamaño-1];

        //desplazamos el array
        for (int i = tamaño-1; i > 0; i--) {
            array[i]=array[i-1];
        }

        array[0]=ultimo;

        System.out.println("El array rotado es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
