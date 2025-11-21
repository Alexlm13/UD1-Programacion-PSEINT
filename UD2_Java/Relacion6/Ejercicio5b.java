package UD2_Java.Relacion6;
import java.util.*;

public class Ejercicio5b {
    public static void main(String[] args) {
        //datos de entrada
        Scanner entrada=new Scanner(System.in);
        String nombre;

        // datos auxiliares
        int posicion, numApellido=0;

        System.out.println("Escriba un nombre y apellidos: ");
        nombre=entrada.nextLine();

        nombre=nombre.trim();

        //conocemos la posicion del primer espacio en blanco
        posicion=nombre.indexOf(" ");

        //sacamos la primera inicial
        System.out.print("Iniciales: "+nombre.substring(0, 1));

        nombre=nombre.toUpperCase();
        while (posicion!=-1) {
            numApellido++;
            nombre=nombre.substring(posicion+1, nombre.length()-1);
            nombre=nombre.trim();
            System.out.print(nombre.substring(0, 1));
            posicion=nombre.indexOf(" ");
        }
        System.out.println("");
        
    }
}
