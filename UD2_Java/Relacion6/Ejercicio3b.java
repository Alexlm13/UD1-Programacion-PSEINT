package UD2_Java.Relacion6;
import java.util.*;

public class Ejercicio3b {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena1, porcion, caracter;
        int contador=0;

        System.out.println("Introduce una cadena: ");
        cadena1=entrada.nextLine();

        System.out.println("Introduce un carácter: ");
        caracter=entrada.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {
            porcion=cadena1.substring(i, i+1);
            if (porcion.equals(caracter)){
                contador++;
            }
        }

        System.out.println("El carácter "+caracter+" se repite "+contador+" veces");
    }
}
