package UD3_Arrays.Relacion7Arrays;

/*
Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y
preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes
*/
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num[] = new int[20];
        int opc = 0, mult5 = 0, mult7 = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 401);
            System.out.print(num[i] + " ");

        }

        do {
            System.out.print("¿Qué números quiere resaltar?\n1- Múltiplos de 5\n2- Múltiplos de 7\n>> ");
            opc = entrada.nextInt();
        } while (opc < 1 || opc > 2);

        System.out.println("Array resaltado:");
        for (int i = 0; i < num.length; i++) {
            if (opc==1 && num[i]%5==0) {
                System.out.print("["+num[i]+"] ");
            }else if(opc==2 && num[i]%7==0){
                System.out.print("["+num[i]+"] ");
            }else{
                System.out.print(num[i]+" ");
            }
        }
        System.out.println("");
    }
}
