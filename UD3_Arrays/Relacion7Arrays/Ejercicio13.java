package UD3_Arrays.Relacion7Arrays;
/*
Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
“Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
(no se pueden escribir directamente).
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        String paises[]={"España", "Rusia", "Japon", "Australia"};
        int tabla[][]=new int[4][10];
        

        System.out.printf("%65s %s %s", "MED", "MIN", "MAX");
        System.out.println("");
        for (int i = 0; i < tabla.length; i++) {
            int med=0, suma=0, max=210, min=140;
            System.out.printf("%9s: ",paises[i]);

            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j]=(int)(Math.random()*71)+140;
                System.out.printf("%3d |",tabla[i][j]);

                suma+=tabla[i][j];
                
                if (tabla[i][j]>min) min=tabla[i][j];
                if (tabla[i][j]<max) max=tabla[i][j];
            }
            med=suma/tabla[i].length;
            System.out.printf(" %3d %3d %3d",med, max, min);
            System.out.println("");
        }
    }
}