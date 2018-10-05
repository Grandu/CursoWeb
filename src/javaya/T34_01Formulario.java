/*
Confeccionar un programa que permita ingresar el nombre de usuario y cuando 
se presione un botón mostrar el valor ingresado en la barra de títulos del 
JFrame.
 */
package javaya;
import javax.swing.*;
import java.awt.event.*;


public class T34_01Formulario extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    public T34_01Formulario() {
        setLayout(null);
        label1=new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        boton1=new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad=textfield1.getText();
            setTitle(cad);
        }
    }
    
    public static void main(String[] ar) {
        T34_01Formulario formulario1 = new T34_01Formulario();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
    }
}