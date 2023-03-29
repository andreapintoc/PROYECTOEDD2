/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;
import HashTable.Nodo;
import HashTable.HashTable;
import HashTable.HashTableParametroTabla;
import HashTable.ListaSimple;
import HashTable.ParametroTabla;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class BuscarPorAutor extends javax.swing.JFrame {
   
    /**
     * Creates new form BuscarInvestigacionesPorAutor
     */
    public BuscarPorAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ListaDesplegableAutores.removeAllItems();
        ListaDesplegableResumenes.removeAllItems();
        this.CargarListasDesplegables();
        
    }
    
    public void CargarListasDesplegables(){
        for (int i = 0; i < Global.getTablaAutores().getSize(); i++) {
            if(Global.getTablaAutores().getTabla()[i] != null){
                ListaDesplegableAutores.addItem(Global.getTablaAutores().getTabla()[i].getName());
            }
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

        jPanel1 = new javax.swing.JPanel();
        ListaDesplegableAutores = new javax.swing.JComboBox<>();
        ListaDesplegableResumenes = new javax.swing.JComboBox<>();
        MostrarInvestigacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        MostrarInvestigacionDelAutor = new javax.swing.JButton();
        RegresarMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaDesplegableAutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaDesplegableAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDesplegableAutoresActionPerformed(evt);
            }
        });
        jPanel1.add(ListaDesplegableAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 240, 30));

        ListaDesplegableResumenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaDesplegableResumenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDesplegableResumenesActionPerformed(evt);
            }
        });
        jPanel1.add(ListaDesplegableResumenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 240, 30));

        MostrarInvestigacion.setBackground(new java.awt.Color(0, 19, 19));
        MostrarInvestigacion.setForeground(new java.awt.Color(255, 255, 255));
        MostrarInvestigacion.setText("Mostrar Investigacion");
        MostrarInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInvestigacionActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 220, 30));

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane1.setViewportView(TextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 580, 260));

        MostrarInvestigacionDelAutor.setBackground(new java.awt.Color(0, 19, 19));
        MostrarInvestigacionDelAutor.setForeground(new java.awt.Color(255, 255, 255));
        MostrarInvestigacionDelAutor.setText("Mostrar Investigaciones del Autor");
        MostrarInvestigacionDelAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInvestigacionDelAutorActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarInvestigacionDelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 220, 30));

        RegresarMenu.setBackground(new java.awt.Color(0, 19, 19));
        RegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegresarMenu.setText("Regresar al Menu");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 130, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por Autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 240, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2. Selecciona una investigación:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("1. Selecciona un Autor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaDesplegableAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDesplegableAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaDesplegableAutoresActionPerformed

    private void MostrarInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInvestigacionActionPerformed
        // TODO add your handling code here:
        if(ListaDesplegableResumenes.getSelectedItem() != null){
            String tituloArticulo = ListaDesplegableResumenes.getSelectedItem().toString();
            Articulo articulo = Global.getTablaArticulos().buscar(tituloArticulo);
            TextArea1.setText(articulo.MostrarResumen());
        }else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Autor y luega presionar el boton 'Mostrar investigaciones del autor' para poder escoger una y asi poder verla");
        }
    }//GEN-LAST:event_MostrarInvestigacionActionPerformed

    private void MostrarInvestigacionDelAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInvestigacionDelAutorActionPerformed
        // TODO add your handling code here:
        if(ListaDesplegableAutores.getSelectedItem() != null){
            ListaDesplegableResumenes.removeAllItems();
            ParametroTabla autor = Global.getTablaAutores().buscar(ListaDesplegableAutores.getSelectedItem().toString());
            Nodo<Articulo> auxArticulo = autor.getArticulos().getHead();
            for (int j = 0; j < autor.getArticulos().getSize(); j++) {
                ListaDesplegableResumenes.addItem(auxArticulo.getData().getTitulo());
                auxArticulo = auxArticulo.getNext();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Autor");
        }
    }//GEN-LAST:event_MostrarInvestigacionDelAutorActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu();
    }//GEN-LAST:event_RegresarMenuActionPerformed

    private void ListaDesplegableResumenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDesplegableResumenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaDesplegableResumenesActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPorAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPorAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaDesplegableAutores;
    private javax.swing.JComboBox<String> ListaDesplegableResumenes;
    private javax.swing.JButton MostrarInvestigacion;
    private javax.swing.JButton MostrarInvestigacionDelAutor;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
