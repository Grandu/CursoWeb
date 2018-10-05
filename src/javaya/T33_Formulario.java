/*
Confeccionar una ventana que muestre un botón. Cuando se presione 
finalizar la ejecución del programa Java.
 */
package javaya;
import javax.swing.*;
import java.awt.event.*;


public class T33_Formulario extends JFrame implements ActionListener {
    JButton boton1;
    public T33_Formulario() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        T33_Formulario formulario1=new T33_Formulario();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
    }
}