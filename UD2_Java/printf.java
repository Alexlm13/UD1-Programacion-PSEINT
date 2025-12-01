package UD2_Java;

public class printf {
    public static void main(String[] args) {
        //Dar forma a un printf
        System.out.printf("%-12s%10s\n", "Producto", "Precio");
        System.out.printf("%-12s%10.2f\n","Manzana", 1.25);
        System.out.println();
        
        //printf con triple comilla doble
        System.out.printf("""
                %-12s%10s
                ----------------------
                %-12s%10.2f
                %-12s%10.2f
                %-12s%10.2f
                ""","Producto","Precio","Manzana",1.23,"Banana",0.75,"Albaricoque",12.99);
    }
}
