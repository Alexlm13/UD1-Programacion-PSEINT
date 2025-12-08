package UD3_Arrays.Relacion7Arrays;

/*
Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
de tabla como se muestra en la figura
*/

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] num={
            {0,30,2,100,100,5},
            {75,100,100,100,0,100},
            {100,100,-2,9,100,11}
        };

        System.out.printf("%-10s %s %s %s %s %s %s\n",
            "Array num","Columna0", "Columna1", "Columna2", "Columna3", "Columna4", "Columna5"
        );

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Fila %3d | ",i);
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]==100) {
                    System.out.print("        |");
                }else{
                    System.out.printf(" %6d |",num[i][j]);
                }
            }
            System.out.println("");
        }
        
    }
}
