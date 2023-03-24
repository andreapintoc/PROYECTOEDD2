/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;
import HashTable.HashTable;
import HashTable.HashTableParametroTabla;
import HashTable.Nodo;

import HashTable.ParametroTabla;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class BuscarPalabraClave extends javax.swing.JFrame {

    /**
     * Creates new form BuscarPalabraClave
     */
    public BuscarPalabraClave() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        DefaultListModel modelo = new DefaultListModel();
        titulos.setModel(modelo);
        
        /////// PRUEBAS
        HashTable<Articulo> tabla = new HashTable(40);
        HashTableParametroTabla tablita = new HashTableParametroTabla(40);
        String titulo = "Hola";
        String[] autores = {"Liz", "Yo"};
        String resumen = "Hola";
        String[] palabrasClav = {"Ciencia", "Musica"};
        String[] palabrasClav2 = {"Ciencia"};
        Articulo art = new Articulo("Hola", autores, resumen, palabrasClav);
        Articulo art2 = new Articulo("Holita", autores, resumen, palabrasClav2);
        ParametroTabla pc = new ParametroTabla(palabrasClav[0]);
        ParametroTabla pc1 = new ParametroTabla(palabrasClav[1]);
        tablita.insertar(pc, art);
        tablita.insertar(pc, art2);
        tablita.insertar(pc1, art);
        
        tabla.insertar(art, art.getTitulo());
        tabla.insertar(art2, art2.getTitulo());
        Global.setTablaArticulos(tabla);
        Global.setTablaPalabrasClave(tablita);
        /////
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
        palabra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mostrarDetalles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        titulos = new javax.swing.JList<>();
        buscadorPalabra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        palabra.setBackground(new java.awt.Color(255, 255, 255));
        palabra.setForeground(new java.awt.Color(0, 0, 0));
        palabra.setName(""); // NOI18N
        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });
        jPanel1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escriba una palabra clave:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 40));

        jLabel2.setBackground(new java.awt.Color(255, 204, 102));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, 40));

        mostrarDetalles.setBackground(new java.awt.Color(0, 26, 26));
        mostrarDetalles.setForeground(new java.awt.Color(255, 255, 255));
        mostrarDetalles.setText("Ver detalles");
        mostrarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDetallesActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 110, -1));

        titulos.setBackground(new java.awt.Color(0, 34, 34));
        titulos.setForeground(new java.awt.Color(255, 255, 255));
        titulos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(titulos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 220));

        buscadorPalabra.setBackground(new java.awt.Color(0, 26, 26));
        buscadorPalabra.setForeground(new java.awt.Color(255, 255, 255));
        buscadorPalabra.setText("Enviar");
        buscadorPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorPalabraActionPerformed(evt);
            }
        });
        jPanel1.add(buscadorPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, -1));

        detalles.setBackground(new java.awt.Color(255, 255, 255));
        detalles.setColumns(20);
        detalles.setForeground(new java.awt.Color(0, 0, 0));
        detalles.setRows(5);
        jScrollPane2.setViewportView(detalles);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 280, 220));

        jLabel3.setBackground(new java.awt.Color(255, 204, 102));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por Palabra Clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 280, 40));

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

    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraActionPerformed

    private void mostrarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDetallesActionPerformed
        // TODO add your handling code here:
        String nombre = titulos.getSelectedValue();
        if (nombre != null) {
            Articulo mostrar = Global.getTablaArticulos().buscar(nombre);
            detalles.setText(mostrar.MostrarResumen()); 
        }
        
    }//GEN-LAST:event_mostrarDetallesActionPerformed

    private void buscadorPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorPalabraActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = new DefaultListModel();
        String palabraC = palabra.getText();
        if (!"".equals(palabraC)) {
            ParametroTabla PC = Global.getTablaPalabrasClave().buscar(palabraC);
            if (PC != null) {
                Nodo<Articulo> Npc = PC.getArticulos().getHead();
                for (int j = 0; j < PC.getArticulos().getSize(); j++) {
                modelo.addElement(Npc.getData().getTitulo());
                Npc = Npc.getNext();
                }
                titulos.setModel(modelo);
            }else {
                titulos.setModel(modelo);
            }    
        } else {
            JOptionPane.showMessageDialog(null, "Escribe una palabra");
        }
        
    }//GEN-LAST:event_buscadorPalabraActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPalabraClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscadorPalabra;
    private javax.swing.JTextArea detalles;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrarDetalles;
    private javax.swing.JTextField palabra;
    private javax.swing.JList<String> titulos;
    // End of variables declaration//GEN-END:variables
}
