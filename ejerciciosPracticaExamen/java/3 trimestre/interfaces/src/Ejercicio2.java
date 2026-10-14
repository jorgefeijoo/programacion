
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio2 {

    public static void main(String[] args) {
        JFrame login = new JFrame("Login");
        login.setLayout(new GridLayout(3, 2));
        login.add(new JLabel("usuario"));
        JTextField nombre = new JTextField();
        login.add(nombre);
        login.add(new JLabel("Contraseña"));
        JTextField contraseña = new JTextField();
        login.add(contraseña);
        JButton cancelar = new JButton("Cancelar");
        login.add(cancelar);
        JButton entrar = new JButton("Entrar");
        login.add(entrar);
        login.setSize(300, 150);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //metodo para el boton de entrar
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioEscrito = nombre.getText();
                String ContraseñaEscrita = contraseña.getText();
                if (usuarioEscrito.equals("admin")&&ContraseñaEscrita.equals("abc123")) {
                    JOptionPane.showMessageDialog(
                        entrar, "Has entrado correctamente");
                }else{
                    JOptionPane.showMessageDialog(entrar, "El usuario o la contraseña son incorrectos");
                }
                
            }
        });

        // metodo que cierra el programa si le das al boton de cancelar
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         login.setVisible(true);
    }
}
