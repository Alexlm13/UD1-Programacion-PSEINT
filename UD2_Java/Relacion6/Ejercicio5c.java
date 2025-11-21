package UD2_Java.Relacion6;
import java.util.*;

public class Ejercicio5c {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String palabra="", nombreCompleto, iniciales="";

        System.out.println("Introduzca su nombre completo");
        nombreCompleto=entrada.nextLine();
        nombreCompleto=nombreCompleto.trim();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i)!=' ') {
                palabra+=nombreCompleto.charAt(i);
            }else{
                iniciales+=palabra.substring(0,1);
                palabra= "";
            }
        }
        System.out.println("Iniciales: "+palabra.toUpperCase());

    }
}
