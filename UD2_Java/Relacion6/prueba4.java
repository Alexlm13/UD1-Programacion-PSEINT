package UD2_Java.Relacion6;
/*Pedir al usuario el dia de la semana en formato numerico y que devuelva el dia en formato texto */

import java.util.*;

public class prueba4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int dia;

        System.out.println("Escriba en el dia de la semana formato numérico (1-7)");
        dia=entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Entrada inválida, escriba un número del 1 al 7");
                break;
        }
    }
}
