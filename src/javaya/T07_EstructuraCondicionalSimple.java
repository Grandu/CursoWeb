package javaya;
import java.util.Scanner;

public class T07_EstructuraCondicionalSimple {
    
    public static void main(String[] ar) {
        Scanner teclado = new Scanner (System.in);
        float sueldo;
        System.out.print("Indica el sueldo: ");
        sueldo = teclado.nextFloat();
        if (sueldo > 3000) {
            System.out.print("Debe pagar impuestos");
        }
    }
    
}

/*
package javaya;
import java.util.Scanner;

public class T07_2EstructuraCondicionalCompuesta {
    
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2;
        System.out.print("Indica el primero número: ");
        num1 = teclado.nextInt();
        System.out.print("Indica el segundo número: ");
        num2 = teclado.nextInt();
        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
    
}

*/