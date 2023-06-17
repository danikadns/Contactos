/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontactos;

import javax.swing.JFrame;

/**
 *
 * @author Dani
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal Home = new Principal();
        // Configura el contenido del JFrame y otras configuraciones...
        
        
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Home.pack();
        
        // Centra el JFrame en la pantalla
        Home.setLocationRelativeTo(null);
       
        Home.setVisible(true);
        
        
        
    }
    
}
