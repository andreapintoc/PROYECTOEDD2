/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;



/**
 *
 * @author Liz
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form BuscarPalabraClave
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        AgregarResumen = new javax.swing.JButton();
        BusquedaAutor = new javax.swing.JButton();
        AnalizarResumen = new javax.swing.JButton();
        BusquedaPalabraClave = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 204, 102));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione una opción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 40));

        Salir.setBackground(new java.awt.Color(0, 19, 19));
        Salir.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 230, 50));

        AgregarResumen.setBackground(new java.awt.Color(0, 19, 19));
        AgregarResumen.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        AgregarResumen.setForeground(new java.awt.Color(255, 255, 255));
        AgregarResumen.setText("Agregar Resumen");
        AgregarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarResumenActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, 50));

        BusquedaAutor.setBackground(new java.awt.Color(0, 19, 19));
        BusquedaAutor.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        BusquedaAutor.setForeground(new java.awt.Color(255, 255, 255));
        BusquedaAutor.setText("Buscar por Autor");
        BusquedaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaAutorActionPerformed(evt);
            }
        });
        jPanel1.add(BusquedaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 230, 50));

        AnalizarResumen.setBackground(new java.awt.Color(0, 19, 19));
        AnalizarResumen.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        AnalizarResumen.setForeground(new java.awt.Color(255, 255, 255));
        AnalizarResumen.setText("Analizar Resumen");
        AnalizarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarResumenActionPerformed(evt);
            }
        });
        jPanel1.add(AnalizarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 230, 50));

        BusquedaPalabraClave.setBackground(new java.awt.Color(0, 19, 19));
        BusquedaPalabraClave.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        BusquedaPalabraClave.setForeground(new java.awt.Color(255, 255, 255));
        BusquedaPalabraClave.setText("Buscar por Palabra Clave");
        BusquedaPalabraClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaPalabraClaveActionPerformed(evt);
            }
        });
        jPanel1.add(BusquedaPalabraClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void AgregarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarResumenActionPerformed
     /**
     * llama a lector para cargar un articulo  
     */
        Lector l = new Lector();
        String txt = l.openTxt(); 
        l.loadFiles(txt);
    }//GEN-LAST:event_AgregarResumenActionPerformed

    private void BusquedaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaAutorActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        BuscarPorAutor v1 = new BuscarPorAutor();
    }//GEN-LAST:event_BusquedaAutorActionPerformed

    private void AnalizarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarResumenActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AnalizarResumen v1 = new AnalizarResumen();
    }//GEN-LAST:event_AnalizarResumenActionPerformed

    private void BusquedaPalabraClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaPalabraClaveActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BuscarPalabraClave v2 = new BuscarPalabraClave();
    }//GEN-LAST:event_BusquedaPalabraClaveActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarResumen;
    private javax.swing.JButton AnalizarResumen;
    private javax.swing.JButton BusquedaAutor;
    private javax.swing.JButton BusquedaPalabraClave;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
