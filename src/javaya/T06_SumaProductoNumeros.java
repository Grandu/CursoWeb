package javaya;
import java.util.Scanner;


public class T06_SumaProductoNumeros {
    
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2, suma, producto;
        System.out.print("Indique el primer número");
        num1 = teclado.nextInt();
        System.out.print("Indique el segundo número");
        num2 = teclado.nextInt();        
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.print("La suma de los números es: ");
        System.out.println(suma);
        System.out.print("El producto de los números es: ");
        System.out.println(producto);    
    }
}


