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

public class T28_01Cliente {
    private String nombre;
    private int monto;
    
    public T28_01Cliente(String nom) {
        nombre = nom;
        monto = 0;
    }
    
    public void depositar(int m) {
        monto = monto+m;
    }
    
    public void extraer(int m) {
        monto = monto-m;
    }
    
    public int retornarMonto() {
        return monto;
    }
    
    public void imprimir() {
        System.out.println(nombre+" tiene depositado la suma de "+monto);
    }
}