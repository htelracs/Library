/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.GUI.views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Grupo 4
 */
public class lending extends javax.swing.JPanel {

    public lending() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textdev = new javax.swing.JLabel();
        usuadev = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usuatext = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        folio = new javax.swing.JTextField();
        prestimg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textdev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textdev.setForeground(new java.awt.Color(204, 153, 0));
        textdev.setText("Nuevo Préstamo");
        jPanel1.add(textdev, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, 40));

        usuadev.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuadev.setText("Usuario");
        jPanel1.add(usuadev, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 310, 10));

        usuatext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuatext.setText("Libro ID");
        jPanel1.add(usuatext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 100, 30));

        book_id.setForeground(new java.awt.Color(102, 102, 102));
        book_id.setText("Ingrese el ID del Libro a prestar");
        book_id.setBorder(null);
        book_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book_idMousePressed(evt);
            }
        });
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        jPanel1.add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 310, 30));

        jSeparator3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 310, 10));

        folio.setForeground(new java.awt.Color(102, 102, 102));
        folio.setText("Ingrese el folio del usuario");
        folio.setBorder(null);
        folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folioMousePressed(evt);
            }
        });
        jPanel1.add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 30));

        prestimg.setBackground(new java.awt.Color(255, 255, 255));
        prestimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pres.jpg"))); // NOI18N
        jPanel1.add(prestimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Prestar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 280, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void folioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folioMousePressed
        if(folio.getText().equals("Ingrese el folio del usuario"))
        folio.setText("");
        if(book_id.getText().equals("") || book_id.getText() == null || book_id.getText().equals(" "))
        book_id.setText("Ingrese el ID del Libro a prestar");
    }//GEN-LAST:event_folioMousePressed

    private void book_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_idMousePressed
        if(book_id.getText().equals("Ingrese el ID del Libro a prestar"))
        book_id.setText("");
        if(folio.getText().equals("") || folio.getText() == null || folio.getText().equals(" "))
        folio.setText("Ingrese el folio del usuario");
    }//GEN-LAST:event_book_idMousePressed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField folio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel prestimg;
    private javax.swing.JLabel textdev;
    private javax.swing.JLabel usuadev;
    private javax.swing.JLabel usuatext;
    // End of variables declaration//GEN-END:variables
}
