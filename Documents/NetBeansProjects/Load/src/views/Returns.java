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
public class Returns extends javax.swing.JPanel {

    public Returns() {
        initComponents();
        setImagen(devimg, "C:\\Users\\Suco\\Pictures\\img\\devo.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        textusua = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        textusua1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        devimg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("Devolución del libro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 40));

        usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 30));

        textusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusua.setForeground(new java.awt.Color(204, 204, 204));
        textusua.setBorder(null);
        textusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 310, 10));

        usuario1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuario1.setText("Libro ID");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 100, 30));

        textusua1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusua1.setForeground(new java.awt.Color(204, 204, 204));
        textusua1.setBorder(null);
        textusua1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 310, 30));

        jSeparator3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 310, 10));

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolución");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 280, 40));

        devimg.setBackground(new java.awt.Color(255, 255, 255));
        devimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devo.jpg"))); // NOI18N
        jPanel1.add(devimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel devimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField textusua;
    private javax.swing.JTextField textusua1;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
