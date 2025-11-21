package UD2_Java.Relacion5;

public class Ejercicio4 {
    public static void main(String[] args) {
        int x, y;
        double n, m;

        //a
        x=4;
        y=6;
        n=3.40;
        m=5.60;

        //b
        System.out.println("La suma X+Y: "+(x+y));

        //c
        System.out.println("La diferencia X-Y: "+(x-y));

        //d
        System.out.println("El producto X*Y: "+(x*y));

        //e
        System.out.println("El cociente X/Y: "+(x/y));
        
        //f
        System.out.println("El resto X%Y: "+(x%y));
        
        //g
        System.out.println("La suma N+N"+(n+m));
        
        //h
        System.out.println("La diferencia N-M: "+(n-m));

        //i
        System.out.println("El producto N*M: "+(n*m));

        //j
        System.out.println("El cociente N/M: "+(n/m));

        //k
        System.out.println("El resto N%M: "+(n%m));

        //l
        System.out.println("La suma X+N: "+(x+n));

        //m
        System.out.println("El cociente Y/M: "+(y/m));

        //n
        System.out.println("El resto Y%M: "+(y%m));

        //o
        System.out.println("El doble de cada variable:");
        System.out.println("X: "+(x*2));
        System.out.println("Y: "+y*2);
        System.out.println("N: "+n*2);
        System.out.println("M: "+m*2);

        //p
        System.out.println("La suma de todas la variables: "+(x+y+n+m));

        //q
        System.out.println("El producto de todas las variables: "+(x*y*n*m));
    }
}
