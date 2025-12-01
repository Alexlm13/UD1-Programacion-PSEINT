package UD3_Arrays.Relacion7Arrays;

/*
Crea un programa que reciba dos Arrays, y devuelva un Array con los valores máximos en cada una de las posiciones.
Se debe tener en cuenta que los Arrays podrán ser de tamaños distintos
*/
import java.util.*;

import UD2_Java.printf;
public class Ejercicio4 {
    public static void main(String[] args) {
        int array1[]={4,8,15,1};
        int array2[]={7,2,11,18};

        int nMayor=Math.max(array1.length, array2.length);
        int aMayor[]=new int[nMayor];

        for (int i = 0; i < aMayor.length; i++) {
            if (i<array1.length && i<array2.length) {
                aMayor[i]=Math.max(array1[i], array2[i]);
            } else if (i<array1.length) {
                aMayor[i]=array1[i];
            } else {
                aMayor[i]=array2[i];
            }
        }

        System.out.println("El número mayor de los arrays es: ");
        for (int i = 0; i < aMayor.length; i++) {
            System.out.printf("%d ", aMayor[i]);
        }
        System.out.println("");
    }
}
