import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){
        JFrame ventana = new JFrame();

        JButton boton = new JButton("Agregar");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(boton);

        ventana.add(panel, BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Switch");
        ventana.pack();
        ventana.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }
}
