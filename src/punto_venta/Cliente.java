/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_venta;

/**
 *
 * @author Eduar
 */
public class Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Proveedor
     */
    public Cliente() {
        initComponents();
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
        lbl_Proveedor = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_correo = new javax.swing.JLabel();
        txt_Correo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_rfc = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Proveedor.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        lbl_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Proveedor.setText("Cliente");
        jPanel1.add(lbl_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 140, 30));

        lbl_nombre.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre:");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        txt_nombre.setBackground(new java.awt.Color(0, 0, 0));
        txt_nombre.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setBorder(null);
        txt_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 400, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 400, 10));

        lbl_direccion.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Direccion:");
        jPanel1.add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_direccion.setBackground(new java.awt.Color(0, 0, 0));
        txt_direccion.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setBorder(null);
        txt_direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 400, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 400, 10));

        lbl_correo.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lbl_correo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_correo.setText("Correo:");
        jPanel1.add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txt_Correo.setBackground(new java.awt.Color(0, 0, 0));
        txt_Correo.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        txt_Correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_Correo.setBorder(null);
        txt_Correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 400, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 400, 10));

        lbl_telefono.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_telefono.setText("Telefono:");
        jPanel1.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(0, 0, 0));
        txt_telefono.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setBorder(null);
        txt_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 210, 20));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 10));

        lbl_rfc.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lbl_rfc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rfc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_rfc.setText("RFC:");
        jPanel1.add(lbl_rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 20));

        txt_telefono1.setBackground(new java.awt.Color(0, 0, 0));
        txt_telefono1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        txt_telefono1.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono1.setBorder(null);
        txt_telefono1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 210, 10));

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_Proveedor;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rfc;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables
}