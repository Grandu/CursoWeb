
package javaya;
import java.util.Scanner;


public class T09_CondicionesCompuestas {
    
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2, num3;
        System.out.print("Indica primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Indica segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Indica tercer número: ");
        num3 = teclado.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else {
            if (num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        }
    }
}

/*
package javaya;
import java.util.Scanner;


public class T09_2CondicionesCompuestas {
    
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        int dia, mes, ano;
        System.out.print("Indica el día: ");
        dia = teclado.nextInt();
        System.out.print("Indica el mes: ");
        mes = teclado.nextInt();
        System.out.print("Indica el año: ");
        ano = teclado.nextInt();
        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("Es del primer trimestre!");
        }
    }
}

*/
