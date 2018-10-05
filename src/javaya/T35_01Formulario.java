package javaya;
import javax.swing.*;

public class T35_01Formulario extends JFrame { 
    private JTextField textfield1;
    private JTextArea textarea1;
    public T35_01Formulario() {
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }

    public static void main(String[] ar) {
        T35_01Formulario formulario1 = new T35_01Formulario();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
    }    
}
