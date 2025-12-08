package UD3_Arrays.Relacion7Arrays;

/*
Escribe un programa que pida 20 números enteros (o que los genere de forma aleatoria). Estos
números se deben introducir en un array bidimensional de 4 filas por 5 columnas. El programa
mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
total debe aparecer en la esquina inferior derecha
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        int random = 0, sumaFila=0, sumaCol=0, sumaTotal=0;
        int num[][] = new int[4][5];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Fila%d", i);
            for (int j = 0; j < num[i].length; j++) {
                for (int i2 = 0; i2 < 20; i2++) {
                    random = (int) (Math.random() * 1000);
                    num[i][j] = random;
                }
                System.out.printf(" %d ", num[i][j]);
                sumaFila+=num[i][j];
            }
            
            System.out.printf(" %d\n", sumaFila);
            sumaTotal+=sumaFila;
            System.out.printf("%d\n", sumaCol);
            sumaFila+=0;
            
        }
    }
}
