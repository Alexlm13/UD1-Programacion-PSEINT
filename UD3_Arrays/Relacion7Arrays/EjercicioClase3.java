package UD3_Arrays.Relacion7Arrays;
/*
Crea un método que dadas dos matrices A y B, las compare elemento a elemento y
muestre otra matriz M. Dicha matriz debe tener el valor máximo en cada una de las
posiciones.
Las matrices se deben pasar como parámetros al método y deben ser exactamente
iguales. Tanto en filas, como en elementos de cada fila.
*/

public class EjercicioClase3 {
    public static void main(String[] args) {
        int array1[][]={
            {1,2,3},
            {6,7,8},
            {10,8,15}
        };

        int array2[][]={
            {5,1,4},
            {7,3,11},
            {11,12,13}
        };

        int valorMayor=Math.max(array1.length, array2.length);
        int valorMenor=Math.min(array1.length, array2.length);
    }
}
