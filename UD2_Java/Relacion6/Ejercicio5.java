package UD2_Java.Relacion6;

/*Si tenemos una cadena con un nombre y apellidos, 
realizar un programa que muestre las iniciales en mayúsculas. */

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombreCompleto, siglas="";

        System.out.println("Escriba su nombre y apellidos");
        nombreCompleto=entrada.nextLine();

        nombreCompleto=nombreCompleto.trim();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (i==0) {
                siglas+=Character.toUpperCase(nombreCompleto.charAt(i));
            }
            if (nombreCompleto.charAt(i)==' ') {
                siglas+=Character.toUpperCase(nombreCompleto.charAt(i+1));
            }
        }

        System.out.println("Sus siglas son: "+siglas);
    }
}
