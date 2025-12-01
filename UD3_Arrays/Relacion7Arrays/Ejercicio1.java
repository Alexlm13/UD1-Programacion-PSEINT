package UD3_Arrays.Relacion7Arrays;
/*Crea un programa que dado un Array de enteros y un valor entero, 
muestre la cantidad de veces que aparece el entero en el Array */
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int valor, contador=0, tamaño;

        System.out.println("Introduzca el tamaño del array");
        tamaño=entrada.nextInt();

        int numeros[]=new int[tamaño];

        System.out.println("Introduce los datos del array");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Dato "+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }

        System.out.println("Introduce que valor quieres buscar dentro del array");
        valor=entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==valor) {
                contador++;
            }
        }

        System.out.printf("""
                El valor ingresado %d se encuentra %d veces.
                """,valor, contador);
        
    }
}
