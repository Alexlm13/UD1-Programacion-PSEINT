package UD2_Java.Relacion5;

public class EjemploFuncionesStrings {
    public static void main(String[] args) {
        String nombre="Alejandro";
        String apellidos= "López Martínez";
        String nombreCompleto= nombre+apellidos;
        System.out.println(nombreCompleto);

        int longitud=nombre.length();
        System.out.println(longitud);

        int longitud2 ="245".length();
        System.out.println(longitud2);

        char letra=apellidos.charAt(3);
        System.out.println(letra);

        String cadena1=nombreCompleto.substring(0,9);
        System.out.println(cadena1);

        String cadena2= " Hola ".trim();
        System.out.println(cadena2);

        String cadena3_1=cadena1.substring(3,4);
        System.out.println(cadena3_1);
        String cadena3_2=cadena1.substring(3,3);
        System.out.println(cadena3_2);
        //String cadena3_3=cadena1.substring(4,3);
        //System.out.println(cadena3_3);
    
        String cadena4 = (cadena2+"Hola").toLowerCase();
        System.out.println(cadena4);

        int posicion1=cadena4.indexOf("o");
        System.out.println(posicion1);
        int posicion2=cadena4.indexOf("hola");
        System.out.println(posicion2);
        int posicion3=cadena4.indexOf("Hola");
        System.out.println(posicion3);
    }
}
