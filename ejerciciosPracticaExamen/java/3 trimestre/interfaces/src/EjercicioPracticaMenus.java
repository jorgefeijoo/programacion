import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EjercicioPracticaMenus {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JButton boton = new JButton();
        ventana.setSize(300,400 );
        ventana.add(boton);
        JMenuBar barraSuperior = new JMenuBar();
        ventana.setJMenuBar(barraSuperior);
        JMenu menuOpciones = new JMenu("Opciones");
        barraSuperior.add(menuOpciones);
        JMenuItem itemSaludar = new JMenuItem("Saludar");
        menuOpciones.add(itemSaludar);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
