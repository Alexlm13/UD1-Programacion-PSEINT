package UD2_Java.Relacion6;

public class prueba2 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        b = ++c;
        System.out.println(b);
        a += b++;
        System.out.println(a);
        a = a++ + a;
        System.out.println(a);
        a -= b--;
        System.out.println(a);
        c = a++ - ++b;
        System.out.println(c);
        c -= ++a;
        System.out.println(c);
        a -= ++c;
        System.out.println(a);
        a -= c++;
        System.out.println(a);
        a -= --c;
        System.out.println(a);
    }
}
