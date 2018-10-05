package javaya;
import javax.swing.*;
import java.awt.event.*;

public class T31_Formulario extends JFrame implements ActionListener {
    JButton boton1;
    private JLabel label1,label2;
    public T31_Formulario() {
        setLayout(null);
        label1=new JLabel("Eres una maricona!.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Maricona vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
        boton1=new JButton("Finalizar");
        boton1.setBounds(10,200,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }

    public static void main(String[] ar) {
        T31_Formulario formulario1 = new T31_Formulario();
        formulario1.setBounds(0,0,450,350);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
}