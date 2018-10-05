/*
Confeccionar una ventana que muestre el nombre de un programa en la parte 
superior y su número de versión en la parte inferior. No permitir modificar 
el tamaño de la ventana en tiempo de ejecución.
 */
package javaya;
import javax.swing.*;
/**
 *
 * @author dcoronag
 */
public class T32_Formulario extends JFrame {
    private JLabel label1,label2;
    public T32_Formulario() {
        setLayout(null);
        label1=new JLabel("Eres una maricona!.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Maricona vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    
    public static void main(String[] ar) {
        T32_Formulario formulario1 = new T32_Formulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
}
