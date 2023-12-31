/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agendacontactos;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class InterfazAgregar extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    int f = 0;
    public static ListaEnlazadaSimple listaFamilia = new ListaEnlazadaSimple();
    public static ListaEnlazadaSimple listaTrabajo = new ListaEnlazadaSimple();
    public static ListaEnlazadaSimple listaAmigos = new ListaEnlazadaSimple();
    public static Object[] contacto = new Object[4];
    public static Object[][] contactosGeneral = new Object[100][100];

    public InterfazAgregar() {
        initComponents();
        TextPrompt nombre = new TextPrompt("Ingrese su nombre", txt_nombre);
        TextPrompt numero = new TextPrompt("Ingrese el numero telefonico", txt_numero);
        TextPrompt correo = new TextPrompt("Ingrese el Correo electronico", txt_correo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(null);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        txt_numero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txt_numero.setForeground(new java.awt.Color(0, 0, 0));
        txt_numero.setBorder(null);
        txt_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_numeroKeyPressed(evt);
            }
        });
        jPanel1.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Categoria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        txt_correo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txt_correo.setBorder(null);
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 240, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familia", "Amigos", "Trabajo" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cerrar.setText("CERRAR");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/imgAgg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 180));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVO CONTACTO ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 240, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 240, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/guardar.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(470, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txt_nombre.getText().trim().isEmpty() || txt_numero.getText().trim().isEmpty() || txt_correo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, Verificar que los campos esten correctamente");
        } else if (txt_nombre.getText().trim().isEmpty() || txt_numero.getText().trim().isEmpty() || txt_correo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");

        } else if (!txt_numero.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números en el campo número");
        } else if (!txt_correo.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico válido");
        } else if (validarIgualdad(parseInt(txt_numero.getText()))) {
            JOptionPane.showMessageDialog(null, "No puede agregarse porque ya existe un registro con este número");
        } else {

            // El código de validación adicional si es necesario
            JOptionPane.showMessageDialog(null, "Guardado con éxito");

            String seleccion = (String) jComboBox1.getSelectedItem();

            if (seleccion.equals("Familia")) {

                contacto[0] = txt_nombre.getText().toString();
                contacto[1] = parseInt(txt_numero.getText());
                contacto[2] = txt_correo.getText();
                contacto[3] = jComboBox1.getSelectedItem();
                contactosGeneral[f][0] = contacto[0];
                contactosGeneral[f][1] = contacto[1];
                contactosGeneral[f][2] = contacto[2];
                contactosGeneral[f][3] = contacto[3];
                listaFamilia.insertarEnCabezaLista(contacto);
                listaFamilia.mostrarDatosLista();
                f++;
            } else if (seleccion.equals("Amigos")) {
                contacto[0] = txt_nombre.getText().toString();
                contacto[1] = parseInt(txt_numero.getText());
                contacto[2] = txt_correo.getText();
                contacto[3] = jComboBox1.getSelectedItem();
                contactosGeneral[f][0] = contacto[0];
                contactosGeneral[f][1] = contacto[1];
                contactosGeneral[f][2] = contacto[2];
                contactosGeneral[f][3] = contacto[3];
                listaAmigos.insertarEnCabezaLista(contacto);
                listaAmigos.mostrarDatosLista();
                f++;
            } else if (seleccion.equals("Trabajo")) {
                contacto[0] = txt_nombre.getText().toString();
                contacto[1] = parseInt(txt_numero.getText());
                contacto[2] = txt_correo.getText();
                contacto[3] = jComboBox1.getSelectedItem();
                contactosGeneral[f][0] = contacto[0];
                contactosGeneral[f][1] = contacto[1];
                contactosGeneral[f][2] = contacto[2];
                contactosGeneral[f][3] = contacto[3];
                listaTrabajo.insertarEnCabezaLista(contacto);
                listaTrabajo.mostrarDatosLista();
                f++;
            }

        }

        txt_nombre.setText("");
        txt_numero.setText("");
        txt_correo.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        InterfazMostrar instancia = new InterfazMostrar();
        dispose();
        instancia.setVisible(true);


    }//GEN-LAST:event_cerrarActionPerformed

    private void txt_numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroKeyPressed
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar solo numeros");
        }

    }//GEN-LAST:event_txt_numeroKeyPressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MousePressed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private boolean validarIgualdad(int telefono) {
        if (!listaAmigos.listaVacia()) {
            if (listaAmigos.busquedaDeNodoEnLista(telefono) != null) {
                return true;
            } else {
                return false;
            }
        } else if (!listaTrabajo.listaVacia()) {
            if (listaTrabajo.busquedaDeNodoEnLista(telefono) != null) {
                return true;
            } else {
                return false;
            }
        } else if (!listaFamilia.listaVacia()) {
            if (listaFamilia.busquedaDeNodoEnLista(telefono) != null) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }

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
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAgregar().setVisible(true);
            }
        });
    }

    public static ListaEnlazadaSimple getListaAmigos() {
        return listaAmigos;
    }

    public static ListaEnlazadaSimple getListaTrabajo() {
        return listaTrabajo;
    }

    public static ListaEnlazadaSimple getListaFamilia() {
        return listaFamilia;
    }

    public static Object[][] getContactoI() {
        return contactosGeneral;
    }

    public static void setListaFamilia(ListaEnlazadaSimple listaFamilia) {
        InterfazAgregar.listaFamilia = listaFamilia;
    }

    public static void setListaTrabajo(ListaEnlazadaSimple listaTrabajo) {
        InterfazAgregar.listaTrabajo = listaTrabajo;
    }

    public static void setListaAmigos(ListaEnlazadaSimple listaAmigos) {
        InterfazAgregar.listaAmigos = listaAmigos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}
