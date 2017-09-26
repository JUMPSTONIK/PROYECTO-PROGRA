
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOSUE FLORIAN
 */
public class RegistraUsuario extends javax.swing.JFrame {
    private boolean typeofuser;
    /**
     * Creates new form RegistraUsuario
     */
    public RegistraUsuario(boolean x) {
        initComponents();
        ToolTip();
        cambiolbl(x);
        this.typeofuser = x;
        System.out.println(this.typeofuser);
    }

    private RegistraUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void cambiolbl(boolean estado){
        if (estado==false) {
            lbcomodin.setText("Trabajo");
            txfcomodin.setToolTipText("debe ingresar a que se dedica o de que trabaja. ejemplo: vendedor, artiista, circense, etc..");
        }
        if (estado==true) {
           lbcomodin.setText("puesto:");
           txfcomodin.setToolTipText("debe ingresar el puesto que ocupa en la municipalidad ejemplo: policia, secretario, etc. ");
        }
    } 
    private void ToolTip(){
        txfNombre.setToolTipText("debe ingresar minimo 1 nombre y apellido");
        tfDPI.setToolTipText("recuerde ingresar todos los digitos de su DPI juntos y no agregar ningun caracter que no sea numero");
        jpContrasena.setToolTipText("debe tener minimo 8 caracteres");
        jprepContrasena.setToolTipText("repita la contraseña exactamente igual como la ha escrito anteriormente");
        txfcodigo.setToolTipText("ingrese el codigo de acceso asignado por la Municipalidad");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombre = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txfNombre = new javax.swing.JTextField();
        lbDPI = new javax.swing.JLabel();
        lbcomodin = new javax.swing.JLabel();
        tfDPI = new javax.swing.JTextField();
        txfcomodin = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        lblrepContrasena = new javax.swing.JLabel();
        lbcodigo = new javax.swing.JLabel();
        txfcodigo = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpContrasena = new javax.swing.JPasswordField();
        jprepContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setText("Nombre y Apellido:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNombreMouseClicked(evt);
            }
        });
        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });

        lbDPI.setText("DPI:");

        lbcomodin.setText("0");
        lbcomodin.setToolTipText("");

        txfcomodin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfcomodinActionPerformed(evt);
            }
        });

        lblContrasena.setText("contraseña:");

        lblrepContrasena.setText("Repita contraseña:");

        lbcodigo.setText("codigo:");

        btnregresar.setText("<----Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Para saber como llenar las casillas, deje el cursor sobre el cambo a escribir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnregresar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbcodigo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContrasena)
                                    .addComponent(lbcomodin)
                                    .addComponent(lblrepContrasena))
                                .addComponent(lbDPI, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(tfDPI)
                            .addComponent(txfcomodin)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfcodigo)
                            .addComponent(jpContrasena)
                            .addComponent(jprepContrasena))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresar)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDPI)
                    .addComponent(tfDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcomodin)
                    .addComponent(txfcomodin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(jpContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblrepContrasena)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jprepContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbcodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(47, 47, 47))
        );

        lbNombre.getAccessibleContext().setAccessibleName("lbNombre");
        btnRegistrar.getAccessibleContext().setAccessibleName("btnRegistrar");
        txfNombre.getAccessibleContext().setAccessibleName("txfNombre");
        lbDPI.getAccessibleContext().setAccessibleName("lbDPI");
        lbcomodin.getAccessibleContext().setAccessibleName("lbcomodin");
        tfDPI.getAccessibleContext().setAccessibleName("tfDPI");
        txfcomodin.getAccessibleContext().setAccessibleName("txfcomodin");
        lblContrasena.getAccessibleContext().setAccessibleName("lblContrasena");
        lblrepContrasena.getAccessibleContext().setAccessibleName("lblrepContraseña");
        lbcodigo.getAccessibleContext().setAccessibleName("lbcodigo");
        txfcodigo.getAccessibleContext().setAccessibleName("txfcodigo");
        btnregresar.getAccessibleContext().setAccessibleName("btnregresar");
        jpContrasena.getAccessibleContext().setAccessibleName("jpContrasena");
        jprepContrasena.getAccessibleContext().setAccessibleName("jprepContrasena");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       
        if (this.typeofuser==true) {
            Comunidad admin = new Comunidad();
            char[] arraycontra = jpContrasena.getPassword();
            String contrasena = new String(arraycontra);
            char[] arrayrepcontra = jprepContrasena.getPassword();
            String repcontrasena = new String(arrayrepcontra);
            JOptionPane.showMessageDialog(null, admin.agregarAdministrador(txfNombre.getText(), tfDPI.getText(), contrasena, repcontrasena, txfcomodin.getText(), txfcodigo.getText()));
            regresar();
        }
        if (this.typeofuser==false) {
            Comunidad trabajador = new Comunidad();
            char[] arraycontra = jpContrasena.getPassword();
            String contrasena = new String(arraycontra);
            char[] arrayrepcontra = jprepContrasena.getPassword();
            String repcontrasena = new String(arrayrepcontra);
            JOptionPane.showMessageDialog(null, trabajador.agregarUsuario(txfNombre.getText(), tfDPI.getText(), contrasena, repcontrasena, txfcomodin.getText(), txfcodigo.getText()));
            regresar();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txfNombreActionPerformed

    private void txfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreMouseClicked

    private void txfcomodinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfcomodinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfcomodinActionPerformed
    public void regresar(){
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(RegistraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpContrasena;
    private javax.swing.JPasswordField jprepContrasena;
    private javax.swing.JLabel lbDPI;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbcomodin;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblrepContrasena;
    private javax.swing.JTextField tfDPI;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfcodigo;
    private javax.swing.JTextField txfcomodin;
    // End of variables declaration//GEN-END:variables

    private boolean type(char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
