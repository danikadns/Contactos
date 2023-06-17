/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agendacontactos;

import static java.lang.Integer.parseInt;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class InterfazMostrar extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMostrar
     */
    ListaEnlazadaSimple listaAmigo;
    ListaEnlazadaSimple listaTrabajo;
    ListaEnlazadaSimple listaFamilia;

    public InterfazMostrar() {
        initComponents();
        listaAmigo = InterfazAgregar.getListaAmigos();
        listaTrabajo = InterfazAgregar.getListaTrabajo();
        listaFamilia = InterfazAgregar.getListaFamilia();
        GetUsers();
    }
    Object[][] list = new Object[100][4];

    static Pila pilaLlamadas = new Pila(100);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cerrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono", "Correo", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 490, 220));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 91, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Familia", "Trabajo", "Amigos" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        cerrar.setText("cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel4.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 80, 30));

        jButton3.setText("Llamar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 90, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoria ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 67, -1));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTACTOS GUARDADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 100));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 80, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 350, -1));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/llamarContac.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/refresh-arrow_icon-icons.com_73442_1.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/buscarContac.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/agregarContac.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/editarContac.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 512, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Principal instancia = new Principal();
        dispose();
        instancia.setVisible(true);
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GetUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        InterfazAgregar instancia = new InterfazAgregar();
        dispose();
        instancia.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int index = jTable1.getSelectedRow();

        if (index != -1) {
            NodoLista datobuscado = listaAmigo.primero;
            while (datobuscado != null) {
                if (datobuscado.datoTelefono.equals(list[index][1])) {
                    listaAmigo.eliminarNodoEnLista(list[index][1]);
                    InterfazAgregar.setListaAmigos(listaAmigo);
                    JOptionPane.showMessageDialog(null, "Contacto eliminado");
                    break;
                }
                datobuscado = datobuscado.siguiente;
            }
            if (datobuscado == null) {
                datobuscado = listaTrabajo.primero;
                while (datobuscado != null) {
                    if (datobuscado.datoTelefono.equals(list[index][1])) {
                        listaTrabajo.eliminarNodoEnLista(list[index][1]);
                        InterfazAgregar.setListaTrabajo(listaTrabajo);
                        JOptionPane.showMessageDialog(null, "Contacto eliminado");
                        break;
                    }
                    datobuscado = datobuscado.siguiente;
                }

                if (datobuscado == null) {
                    datobuscado = listaFamilia.primero;
                    while (datobuscado != null) {
                        if (datobuscado.datoTelefono.equals(list[index][1])) {
                            listaFamilia.eliminarNodoEnLista(list[index][1]);
                            InterfazAgregar.setListaFamilia(listaFamilia);
                            JOptionPane.showMessageDialog(null, "Contacto eliminado");
                            break;
                        }
                        datobuscado = datobuscado.siguiente;
                    }
                    if (datobuscado == null) {
                        JOptionPane.showMessageDialog(null, "No se encontro el contacto");
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un contacto");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int index = jTable1.getSelectedRow();

        if (index != -1) {
            LocalDateTime fechaActual = LocalDateTime.now();
            pilaLlamadas.push(list[index][1], list[index][0], fechaActual);
            pilaLlamadas.mostrarElementosPila();

            Llamada instancia = new Llamada();

            instancia.setVisible(true);
            instancia.txtNombre.setText(list[index][0].toString());
            instancia.txtNumero.setText(list[index][1].toString());

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un contacto");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        getUsuario();
    }//GEN-LAST:event_jButton5ActionPerformed

    public static Pila getPilaLlamada() {
        return pilaLlamadas;
    }

    private void getUsuario() {
        int numero = 0;
        NodoLista datobuscado = listaAmigo.primero;

        try {
            numero = parseInt(txtBuscar.getText());
            while (datobuscado != null) {
                if (datobuscado.datoTelefono.equals(numero)) {
                    break;
                }
                datobuscado = datobuscado.siguiente;
            }

            if (datobuscado == null) {
                datobuscado = listaTrabajo.primero;
                while (datobuscado != null) {
                    if (datobuscado.datoTelefono.equals(numero)) {
                        break;
                    }
                    datobuscado = datobuscado.siguiente;
                }

                if (datobuscado == null) {
                    datobuscado = listaFamilia.primero;
                    while (datobuscado != null) {
                        if (datobuscado.datoTelefono.equals(numero)) {
                            break;
                        }
                        datobuscado = datobuscado.siguiente;
                    }
                    if (datobuscado == null) {
                        JOptionPane.showMessageDialog(null, "No se encontro el contacto");
                    }
                }
            }

        } catch (NumberFormatException ex) {
            System.out.println("es txto");
            String buscar = txtBuscar.getText();

            while (datobuscado != null) {
                if (datobuscado.datoNombre.equals(buscar)) {
                    break;
                }
                datobuscado = datobuscado.siguiente;
            }

            if (datobuscado == null) {
                datobuscado = listaTrabajo.primero;
                while (datobuscado != null) {
                    if (datobuscado.datoNombre.equals(buscar)) {
                        break;
                    }
                    datobuscado = datobuscado.siguiente;
                }
                if (datobuscado == null) {
                    datobuscado = listaFamilia.primero;
                    while (datobuscado != null) {
                        if (datobuscado.datoNombre.equals(buscar)) {
                            break;
                        }
                        datobuscado = datobuscado.siguiente;
                    }
                    if (datobuscado == null) {
                        JOptionPane.showMessageDialog(null, "No se encontro el contacto");
                    }
                }
            }

        }

        JOptionPane.showMessageDialog(null, "El contacto completo es Nombre: " + datobuscado.datoNombre + ", Telefono: " + datobuscado.datoTelefono + ", Correo: " + datobuscado.datoCorreo);
    }

    public static void setPilaLlamadas(Pila pilaLlamadas) {
        InterfazMostrar.pilaLlamadas = pilaLlamadas;
    }

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
            java.util.logging.Logger.getLogger(InterfazMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMostrar().setVisible(true);
            }
        });
    }

    private void GetUsers() {
        ListaEnlazadaSimple listaAmigo = InterfazAgregar.getListaAmigos();
        ListaEnlazadaSimple listaTrabajo = InterfazAgregar.getListaTrabajo();
        ListaEnlazadaSimple listaFamilia = InterfazAgregar.getListaFamilia();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        limpiarTabla(jTable1);

        int count = 0;
        listaAmigo.mostrarDatosLista();

        NodoLista prueba;

        String seleccion = (String) jComboBox1.getSelectedItem();

        if (seleccion.equals("Amigos")) {
            prueba = listaAmigo.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }
        } else if (seleccion.equals("Familia")) {

            prueba = listaFamilia.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }
        } else if (seleccion.equals("Trabajo")) {
            prueba = listaTrabajo.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }
        } else if (seleccion.equals("Todos")) {
            prueba = listaFamilia.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }

            prueba = listaAmigo.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }

            prueba = listaTrabajo.primero;
            while (prueba != null) {
                list[count][0] = prueba.datoNombre;
                list[count][1] = prueba.datoTelefono;
                list[count][2] = prueba.datoCorreo;
                list[count][3] = prueba.datoCategoria;
                modelo.addRow(list[count]);
                prueba = prueba.siguiente;
                count++;
            }
        }
        jTable1.setModel(modelo);
    }

    public static void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        tabla.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
