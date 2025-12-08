package UD3_Arrays.Relacion7Arrays;

/*
Define tres arrays de 20 números enteros cada uno, con nombres numero, cuadrado y cubo. Carga el
array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos
de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas.
NOTA: para generar números aleatorios se debe utilizar el método random() de la clase Math.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero[]=new int[20];
        int cuadrado[]=new int[20];
        int cubo[]=new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=numero[i]*numero[i];
            cubo[i]=numero[i]*numero[i]*numero[i];
        }

        System.out.printf("%-10s %-10s %-10s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("---------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
