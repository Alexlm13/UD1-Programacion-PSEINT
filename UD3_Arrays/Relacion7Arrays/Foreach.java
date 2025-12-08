package UD3_Arrays.Relacion7Arrays;

public class Foreach {
    public static void main(String[] args) {
        int array[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };

        for (int[] fila : array) {
            for (int columna : fila) {
                System.out.printf("%d ", columna);
            }
            System.out.println("");
        }
    }
}
