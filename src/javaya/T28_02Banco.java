/*
Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. 
También el banco requiere que al final del día calcule la cantidad de dinero 
que hay depositada.

Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Cliente y la clase Banco.
Luego debemos definir los atributos y los métodos de cada clase:

Cliente		
    atributos
        nombre
        monto
    métodos
        constructor
        depositar
        extraer
        retornarMonto

Banco
    atributos
        3 Cliente (3 objetos de la clase Cliente)
        1 Scanner (Para poder hacer la entrada de datos por teclado)
    métodos
        constructor
        operar
        depositosTotales
Creamos un proyecto en Eclipse llamado: Proyecto1 y dentro del proyecto 
creamos dos clases llamadas: Cliente y Banco.
 */
package javaya;

public class T28_02Banco {
    private T28_01Cliente cliente1,cliente2,cliente3;
	
    public T28_02Banco() {
        cliente1 = new T28_01Cliente("Juan");
        cliente2 = new T28_01Cliente("Ana");
        cliente3 = new T28_01Cliente("Pedro"); 
    }

    public void operar() {
        cliente1.depositar (100);
        cliente2.depositar (150);
        cliente3.depositar (200);
        cliente3.extraer (150);
    }
	
    public void depositosTotales ()
    {
        int t = cliente1.retornarMonto () + cliente2.retornarMonto () + cliente3.retornarMonto ();
        System.out.println ("El total de dinero en el banco es:" + t);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }

    public static void main(String[] ar) {
        T28_02Banco banco1=new T28_02Banco();
        banco1.operar();
        banco1.depositosTotales();
    }
}
