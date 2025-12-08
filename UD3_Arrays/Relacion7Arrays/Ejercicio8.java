package UD3_Arrays.Relacion7Arrays;
import java.util.*;
/*
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int num[]=new int[100];
        int valor1, valor2;

        for (int i = 0; i < num.length; i++) {
            num[i]=(int)(Math.random()*21);

            System.out.print(num[i]+" ");
        }

        System.out.printf("\n\nIntroduzca 2 valores\n"+"Valor1: ");
        valor1=entrada.nextInt();
        System.out.printf("Valor2: ");
        valor2=entrada.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i]==valor1) {
                num[i]=valor2;
            }

            System.out.print(num[i]+" ");
        }       
    }
}
