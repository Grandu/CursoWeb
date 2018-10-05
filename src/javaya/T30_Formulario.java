/*
Confeccionar el programa "Hola Mundo" utilizando una interfaz gráfica 
de usuario.
 */
package javaya;
import javax.swing.*;

public class T30_Formulario extends JFrame{
    private JLabel label1;
    public T30_Formulario() {
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);
    }
    
    public static void main(String[] ar) {
        T30_Formulario formulario1 = new T30_Formulario();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
    }
}