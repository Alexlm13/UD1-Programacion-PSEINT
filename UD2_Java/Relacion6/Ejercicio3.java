package UD2_Java.Relacion6;
import java.util.*;

/*Pide una cadena y un carácter por teclado (valida que sea un carácter) 
y muestra cuántas veces aparece el carácter en la cadena */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena, caracter;
        char letra;
        int contador=0;

        System.out.println("Introduzca una cadena");
        cadena=entrada.nextLine();

        System.out.println("Introduzca un carácter");
        caracter=entrada.nextLine();

        if (caracter.length()!=1) {
            System.out.println("Introduciste más de un carácter, solo puede ser un carácter");
        }else{
            letra=caracter.charAt(0);

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i)==letra) {
                    contador++;
                }
            }
        }

        System.out.println("Su cadena contiene la letra, "+caracter+", "+contador+" veces.");
    }
}
