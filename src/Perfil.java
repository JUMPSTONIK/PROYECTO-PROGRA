
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * 29 de septiembre de 2017
 * @author josue David Lopez Florian 17081
 * @author Juan Rodolfo Alonzo Molina 15470
 */




/**
 *
 * @author JUMPSTONIK
 */
public class Perfil extends javax.swing.JFrame {
    
    /**
     * Creates new form perfil
     */
    private static String userID;
    private static String userNombre;
    private static String userDescripcion;
    private static boolean usertypeUser;
    private static int userIndex;
    
    public Perfil(ArrayList <Personas> usuario, boolean typeUser, int indexUser) {
        initComponents();
        setLocationRelativeTo(null);
        //aqui en esta parte solo se asigna los datos del perfil del usuario que ha ingresado y se
        // inicializa las variables que se necesitan para trabajar
        lblID.setText(usuario.get(indexUser).getID());
        this.userID = usuario.get(indexUser).getID();
        lblUsuario.setText(usuario.get(indexUser).getNombre());
        this.userNombre = usuario.get(indexUser).getNombre();
        lblDescripcion.setText(usuario.get(indexUser).getDescripcion());
        this.userDescripcion = usuario.get(indexUser).getDescripcion();
        this.userIndex = indexUser;
        this.usertypeUser = typeUser;
        //aqui se hace la diferenciacion de que dira cada boton dependiendo el usuario
        if (typeUser == false) {
            btnAsignaOVerUser.setText("ASIGNAR SECTOR Y HORARIO");
            btnAsignarOVerMultas.setText("VER MULTAS");
            btnPagarOEditarUser.setText("PAGAR MULTAS");
        }
        if (typeUser == true) {
            btnAsignaOVerUser.setText("CONTROL DE USUARIOS");
            btnAsignarOVerMultas.setText("ASIGNAR MULTAS");
            btnPagarOEditarUser.setText("EDITAR INFORMACION DE USUARIOS");
        }
        
        
    }
    
    public Perfil() {
        initComponents();
        setLocationRelativeTo(null);
        lblID.setText(this.userID);
        lblUsuario.setText(this.userNombre);
        lblDescripcion.setText(this.userDescripcion);
        if (this.usertypeUser == false) {
            btnAsignaOVerUser.setText("ASIGNAR SECTOR Y HORARIO");
            btnAsignarOVerMultas.setText("VER MULTAS");
            btnPagarOEditarUser.setText("PAGAR MULTAS");
        }
        if (this.usertypeUser == true) {
            btnAsignaOVerUser.setText("CONTROL DE USUARIOS");
            btnAsignarOVerMultas.setText("ASIGNAR MULTAS");
            btnPagarOEditarUser.setText("EDITAR INFORMACION DE USUARIOS");
        } 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnAsignaOVerUser = new javax.swing.JButton();
        btnAsignarOVerMultas = new javax.swing.JButton();
        btnPagarOEditarUser = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setText("ID:");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Descripcion:");

        lblID.setText("0");

        lblUsuario.setText("0");

        lblDescripcion.setText("0");

        btnAsignaOVerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaOVerUserActionPerformed(evt);
            }
        });

        btnAsignarOVerMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarOVerMultasActionPerformed(evt);
            }
        });

        btnPagarOEditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarOEditarUserActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagarOEditarUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignarOVerMultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignaOVerUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(lblID)
                            .addComponent(lblUsuario)
                            .addComponent(lblDescripcion)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescripcion))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignaOVerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAsignarOVerMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagarOEditarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        lblID.getAccessibleContext().setAccessibleName("lblID");
        lblUsuario.getAccessibleContext().setAccessibleName("lblUsuario");
        lblDescripcion.getAccessibleContext().setAccessibleName("lblDescripcion");
        btnAsignaOVerUser.getAccessibleContext().setAccessibleName("btnAsignaOVerUser");
        btnAsignarOVerMultas.getAccessibleContext().setAccessibleName("btnAsignarOVerMultas");
        btnPagarOEditarUser.getAccessibleContext().setAccessibleName("btnPagarOEditarUser");
        btnCerrarSesion.getAccessibleContext().setAccessibleName("btnCerrarSesion");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnAsignaOVerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaOVerUserActionPerformed
        // TODO add your handling code here:
        Mapa mapa = new Mapa(this.userIndex);
        //meter aqui lo que quieras llamar para los vendedores o trabajadores
        if (this.usertypeUser == false) {
            mapa.setVisible(true);
            this.setVisible(false);
        }
        //meter el codigo aqui de lo que quieras que haga el boton de los administradores
        if (this.usertypeUser == true) {
            ControlUsuarios controlU = new ControlUsuarios();
            controlU.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnAsignaOVerUserActionPerformed

    private void btnAsignarOVerMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarOVerMultasActionPerformed

        //meter aqui lo que quieras llamar para los vendedores o trabajadores
        if (this.usertypeUser == false) {
            Comunidad comunidad = new Comunidad();
            JOptionPane.showMessageDialog(null, "no tiene multas");
            
        }
        //meter el codigo aqui de lo que quieras que haga el boton de los administradores
        if (this.usertypeUser == true) {
            AsignarMulta multa = new AsignarMulta();
            multa.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_btnAsignarOVerMultasActionPerformed

    private void btnPagarOEditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarOEditarUserActionPerformed
      
        //meter aqui lo que quieras llamar para los vendedores o trabajadores
        if (this.usertypeUser == false) {
            
            //.setVisible(true);
            //this.setVisible(false);
        }
        //meter el codigo aqui de lo que quieras que haga el boton de los administradores
        if (this.usertypeUser == true) {
            CambioDataUser cdata = new CambioDataUser();
            cdata.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_btnPagarOEditarUserActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignaOVerUser;
    private javax.swing.JButton btnAsignarOVerMultas;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnPagarOEditarUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
