package UD3_Arrays.Relacion7Arrays;
/*
Calcular la media de una serie de números que se leen por teclado. Leer por teclado 10 números
enteros y guardarlos en un array. A continuación calcula y muestra por separado la media de los
valores positivos y la de los valores negativos
*/
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num[]=new int[10];
        double suma=0, sumaPos=0, sumaNeg=0, media=0, mediaPos=0, mediaNeg=0;
        int conPos=0, conNeg=0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Escriba 10 números desde cero ("+i+"/9)");
            System.out.print(">> ");
            num[i]=entrada.nextInt();
            suma+=num[i];

            if (num[i]>=0) {
                sumaPos+=num[i];
                conPos++;
            }else if(num[i]<0){
                sumaNeg+=num[i];
                conNeg++;
            }
        }

        media=suma/10;
        mediaPos=sumaPos/conPos;
        mediaNeg=sumaNeg/conNeg;

        System.out.printf(
            "Resultado de la media es: %.2f\n"+
            "Resultado de la media positiva: %.2f\n"+
            "Resultado de la media negativa: %.2f\n",
            media, mediaPos, mediaNeg
        );
    }
}