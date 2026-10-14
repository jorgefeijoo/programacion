import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class EjercicioRepaso {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Sistema de Empleados");
        ventana.setSize(400,300);
    
        JMenuBar barra = new JMenuBar();
        ventana.setJMenuBar(barra);
        JMenu menu = new JMenu("Archivo");
        barra.add(menu);
        JMenuItem item1 = new JMenuItem("Acerca de ...");
        JMenuItem item2 = new JMenuItem("Salir");
        menu.add(item1);
        menu.add(item2);

        JLabel nombre = new JLabel("Nombre del empleado");
        JTextField texto = new JTextField();
        JLabel departamento = new JLabel("Departamento");
        JButton cancelar = new JButton("Cancelar");
        JButton guardar = new JButton("Guardar");

        ventana.add(nombre);
        ventana.add(texto);
        ventana.add(departamento);
        ventana.add(cancelar);
        ventana.add(guardar);
        




            


        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
}