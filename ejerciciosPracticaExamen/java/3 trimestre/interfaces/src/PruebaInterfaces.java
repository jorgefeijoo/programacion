import javax.swing.*;

public class PruebaInterfaces {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Prueba ventana java");
        JButton boton = new JButton("pulsa aqui ");
        ventana.add(boton);
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
    }
}
