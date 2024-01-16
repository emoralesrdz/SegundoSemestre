import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame{
    public Formulario(){
        Pantalla();
        Nombre();
        Campo();
        BotonAgregar();
        Limpiar();
        Tabla();
    }
    public void Pantalla(){
        setLayout(null);
        setTitle("Formulario");
        setSize(600, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void Nombre(){
        JLabel namelabl = new JLabel("Nombre: ");
        namelabl.setBounds(10, 10, 70, 25);
        add(namelabl);
    }
    public void Campo(){
        JTextField userText = new JTextField(20);
        userText.setBounds(120, 10, 210, 25);
        userText.setBorder(new LineBorder(Color.BLACK));
        add(userText);
    }
    public void BotonAgregar(){
        JButton loginButton = new JButton("Ingresar");
        loginButton.setBounds(350, 10, 80, 25);
        loginButton.setOpaque(true);
        loginButton.setFocusPainted(false);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.white);
        loginButton.setBorder(new LineBorder(Color.blue));
        add(loginButton);
    }
    public void Limpiar(){}
    public void Tabla(){}
    public static void main(String[] args) {
        new Formulario();
    }
}
