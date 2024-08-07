/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Suco
 */
public class lending extends javax.swing.JPanel {

    public lending() {
        initComponents();
        setImagen(prestimg, "C:\\Users\\Suco\\Pictures\\img\\pres.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textdev = new javax.swing.JLabel();
        usuadev = new javax.swing.JLabel();
        ingdev = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        usuatext = new javax.swing.JLabel();
        textusuadev = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        prestimg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textdev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textdev.setForeground(new java.awt.Color(204, 153, 0));
        textdev.setText("Nuevo Préstamo");
        jPanel1.add(textdev, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 40));

        usuadev.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuadev.setText("Usuario");
        jPanel1.add(usuadev, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 30));

        ingdev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingdev.setForeground(new java.awt.Color(204, 204, 204));
        ingdev.setBorder(null);
        ingdev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ingdev, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 310, 10));

        usuatext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuatext.setText("Libro ID");
        jPanel1.add(usuatext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 100, 30));

        textusuadev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusuadev.setForeground(new java.awt.Color(204, 204, 204));
        textusuadev.setBorder(null);
        textusuadev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusuadev, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 310, 30));

        jSeparator3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 310, 10));

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Prestar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 280, 40));

        prestimg.setBackground(new java.awt.Color(255, 255, 255));
        prestimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pres.jpg"))); // NOI18N
        jPanel1.add(prestimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ingdev;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel prestimg;
    private javax.swing.JLabel textdev;
    private javax.swing.JTextField textusuadev;
    private javax.swing.JLabel usuadev;
    private javax.swing.JLabel usuatext;
    // End of variables declaration//GEN-END:variables
}
