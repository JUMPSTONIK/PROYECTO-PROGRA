
import javax.swing.JOptionPane;

/*
 * 29 de septiembre de 2017
 * @author josue David Lopez Florian 17081
 * @author Juan Rodolfo Alonzo Molina 15470
 */
public class Sector extends javax.swing.JFrame {
    private int indexUser;
    private int sector;
    /**
     * en este contructor se usa para obtener el numero del sector y el index del usuario el cual se le quiere asignar
     * su sector y horas.
     * @param index
     * @param numsector 
     */
    public Sector(int index, int numsector) {
        initComponents();
        //esto solo sirve para centrar el jFrame
        setLocationRelativeTo(null);
        this.indexUser = index;
        this.sector = numsector;
    }
    public Sector() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbHoras = new javax.swing.JComboBox<>();
        btnAsignarse = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcbHoras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione hora...", "8:00am - 10:00am", "10:00am - 12:00am", "12:00pm - 2:00pm", "2:00pm - 4:00pm", "4:00pm - 6:00pm", "6:00pm - 8:00pm", "8:00pm - 10:00pm" }));

        btnAsignarse.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnAsignarse.setText("Asignarse");
        btnAsignarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarseActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnAsignarse, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAsignarse, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jcbHoras.getAccessibleContext().setAccessibleName("jcbHoras");
        btnAsignarse.getAccessibleContext().setAccessibleName("btnAsignarse");
        btnRegresar.getAccessibleContext().setAccessibleName("btnRegresar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarseActionPerformed
        // se crea el objeto para obtener sus metodos
        Comunidad comunidad = new Comunidad();
        // se toma el valor seleccionado
        String intervalo = (String) jcbHoras.getSelectedItem();
        //se verifica si ha seleccionado algo que no sea la primer opcion
        if (!(intervalo.equals("Seleccione hora..."))) {
            //aqui se crea la asignacion y se obtiene el mensaje de si se ha logrado o no asignar su sector y horas
            JOptionPane.showMessageDialog(null, ( (RegistroUsuario) comunidad.getTrabajadores().get(this.indexUser)).setHorarioYsector(intervalo, "sector "+this.sector));
        } else {
            //mensaje en caso que no lo haya hecho
            JOptionPane.showMessageDialog(null, "debe seleccionar su horario en este sector");
        }
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAsignarseActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Sector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarse;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jcbHoras;
    // End of variables declaration//GEN-END:variables
}
