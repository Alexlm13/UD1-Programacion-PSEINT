package UD2_Java.Relacion6;
/*Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
sustituye la aparición del primer carácter en la cadena por el segundo carácter */

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String cadena, car1, car2, nuevaCadena="";
        char letra1;
        char letra2;

        System.out.println("Introduzca una cadena");
        cadena=entrada.nextLine();

        System.out.println("Indique que carácter quiere cambiar");
        car1=entrada.nextLine();

        System.out.println("Escriba cual es el carácter que quiere introducir");
        car2=entrada.nextLine();

        if (car1.length()!=1 && car2.length()!=1) {
            System.out.println("Error: Solo se debe introducir un carácter");
        }else{
            letra1=car1.charAt(0);
            letra2=car2.charAt(0);
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i)!=letra1) {
                    nuevaCadena=cadena.replace(letra1, letra2);
                }
            }
        }
        System.out.println("La cadena se quedaria de esta manera: "+nuevaCadena);
    }    
}
