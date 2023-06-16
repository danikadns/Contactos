/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agendacontactos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    JFrame frame = null;
    boolean arbolAbierto = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarContacto = new javax.swing.JButton();
        btnMostrarContacto = new javax.swing.JButton();
        btnArbol = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarContacto.setText("Agregar Contacto");
        btnAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContactoActionPerformed(evt);
            }
        });

        btnMostrarContacto.setText("Mostrar Contactos");
        btnMostrarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContactoActionPerformed(evt);
            }
        });

        btnArbol.setText("Mostrar árbol");
        btnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolActionPerformed(evt);
            }
        });

        jButton1.setText("Llamadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnAgregarContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnMostrarContacto)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnArbol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarContacto)
                    .addComponent(btnAgregarContacto))
                .addGap(59, 59, 59)
                .addComponent(btnArbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContactoActionPerformed
        InterfazAgregar instancia = new InterfazAgregar();
        dispose();
        instancia.setVisible(true);
    }//GEN-LAST:event_btnAgregarContactoActionPerformed

    private void btnMostrarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContactoActionPerformed
        InterfazMostrar instancia = new InterfazMostrar();
        dispose();
        instancia.setVisible(true);
    }//GEN-LAST:event_btnMostrarContactoActionPerformed

    private void btnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolActionPerformed
        Arbol arbolBinario = new Arbol();
        ListaEnlazadaSimple listaAmigo = InterfazAgregar.getListaAmigos();
        ListaEnlazadaSimple listaTrabajo = InterfazAgregar.getListaTrabajo();
        ListaEnlazadaSimple listaFamilia = InterfazAgregar.getListaFamilia();        

        NodoLista prueba;
        listaAmigo.mostrarDatosLista();
        listaTrabajo.mostrarDatosLista();
        listaFamilia.mostrarDatosLista();
        int telefono;
        prueba = listaAmigo.primero;
        while (prueba != null) {
            telefono = (int) prueba.datoTelefono;
            arbolBinario.insertarNodo(telefono, arbolBinario.getRaiz(), prueba.datoNombre.toString(), prueba.datoCategoria.toString());
            prueba = prueba.siguiente;
        }
        prueba = listaTrabajo.primero;
        while (prueba != null) {
            telefono = (int) prueba.datoTelefono;
            arbolBinario.insertarNodo(telefono, arbolBinario.getRaiz(), prueba.datoNombre.toString(), prueba.datoCategoria.toString());
            prueba = prueba.siguiente;
        }
        prueba = listaFamilia.primero;
        while (prueba != null) {
            telefono = (int) prueba.datoTelefono;
            arbolBinario.insertarNodo(telefono, arbolBinario.getRaiz(), prueba.datoNombre.toString(), prueba.datoCategoria.toString());
            prueba = prueba.siguiente;
        }
        if (!arbolBinario.arbolVacio()) {
            if (arbolAbierto == false) {
                arbolAbierto = true;
                frame = new JFrame("ARBOL GRAFICO");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.add(arbolBinario);
                frame.setVisible(true);
            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "AGREGUE UN NODO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnArbolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfazLlamadas instancia = new InterfazLlamadas();
        dispose();
        instancia.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarContacto;
    private javax.swing.JButton btnArbol;
    private javax.swing.JButton btnMostrarContacto;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
