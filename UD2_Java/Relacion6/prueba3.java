package UD2_Java.Relacion6;

public class prueba3 {
    public static void main(String[] args) {
        int precio1 = 10;
        int precio2 = 20;
        int precio3 = 30;
        boolean caro = precio1 >= 30; // false
        boolean barato = precio1 >= 0 && precio1 <= 10; // true
        boolean imposible = precio1 >= 10 && precio1 < 10; // false
        boolean iguales = precio1 == precio2 && precio2 == precio3; // false
        boolean distintos = precio1 != precio2 && precio1 != precio3 && precio3 != precio2; // true
        boolean max1 = precio1 >= precio2 && precio1 >= precio3; // false
        boolean max2 = precio2 >= precio1 && precio2 >= precio3; // false
        boolean max3 = precio3 >= precio1 && precio3 >= precio2; // true
        boolean algunoCaro = precio1 >= 30 || precio2 >= 30 || precio3 >= 30; // true
        boolean algunoDistinto = precio1 != precio3 || precio3 != precio2; // true
        boolean combinada = precio1 <= precio2 || precio1 == precio2 && precio1 == precio3; // true
    }
}
