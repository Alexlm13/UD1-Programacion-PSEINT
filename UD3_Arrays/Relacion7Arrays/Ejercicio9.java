package UD3_Arrays.Relacion7Arrays;

/*
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        int num[]=new int[20];
        int par[]=new int[20];
        int impar[]=new int[20];
        int iPar=0, iImpar=0, pos=0;

        for (int i = 0; i < num.length; i++) {
            num[i]=(int)(Math.random()*101);

            if (num[i]%2==0) {
                par[iPar]=num[i];
                iPar++;
            } else {
                impar[iImpar]=num[i];
                iImpar++;
            }
        }

        System.out.println("Pares:");
        for (int i = 0; i < iPar; i++) {
            num[pos]=par[i];
            pos++;

            System.out.print(par[i]+" ");
        }
        System.out.println("\n\nImpares:");
        for (int i = 0; i < iImpar; i++) {
            num[pos]=impar[i];
            pos++;

            System.out.print(impar[i]+" ");
        }
        System.out.println("");
        
    }
}
