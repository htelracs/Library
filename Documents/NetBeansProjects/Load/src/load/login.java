/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package load;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Suco
 */
public class login extends javax.swing.JFrame {
    int xmou, ymou;
    public login() {
        initComponents();
        setLocationRelativeTo(null);
        setImagen(imgusua, "C:\\Users\\Suco\\Pictures\\img\\img3.jpg"); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usua = new javax.swing.JLabel();
        imgusua = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        perfil = new javax.swing.JLabel();
        lista = new javax.swing.JComboBox<>();
        textusua = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correo = new javax.swing.JLabel();
        textcorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        contra = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        botonsesion = new javax.swing.JButton();
        botonregistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonregistro1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usua.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        usua.setForeground(new java.awt.Color(204, 153, 0));
        usua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usua.setText("LOGIN");
        jPanel1.add(usua, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 40));

        imgusua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img3.jpg"))); // NOI18N
        imgusua.setText("jLabel2");
        jPanel1.add(imgusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 480));

        usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        perfil.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        perfil.setText("Profile");
        jPanel1.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 80, 30));

        lista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Administrador" }));
        lista.setBorder(null);
        lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaMouseExited(evt);
            }
        });
        jPanel1.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 30));

        textusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusua.setForeground(new java.awt.Color(204, 204, 204));
        textusua.setText("Ingrese su nombre");
        textusua.setBorder(null);
        textusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 10));

        correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("Correo");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 30));

        textcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textcorreo.setForeground(new java.awt.Color(204, 204, 204));
        textcorreo.setText("Ingrese su correo");
        textcorreo.setBorder(null);
        textcorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 10));

        contra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contra.setForeground(new java.awt.Color(255, 255, 255));
        contra.setText("Contraseña");
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 290, 10));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        botonsesion.setBackground(new java.awt.Color(204, 153, 0));
        botonsesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonsesion.setForeground(new java.awt.Color(255, 255, 255));
        botonsesion.setText("INICIAR SESIÓN");
        botonsesion.setBorder(null);
        botonsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonsesionMouseExited(evt);
            }
        });
        jPanel1.add(botonsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 30));

        botonregistro.setBackground(new java.awt.Color(204, 153, 0));
        botonregistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonregistro.setForeground(new java.awt.Color(255, 255, 255));
        botonregistro.setText("<html>REGISTRO <P>ADMINISTRADOR<html>");
        botonregistro.setBorder(null);
        botonregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonregistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonregistroMouseExited(evt);
            }
        });
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Olvidaste tu contraseña?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, 40));

        botonregistro1.setBackground(new java.awt.Color(204, 153, 0));
        botonregistro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonregistro1.setForeground(new java.awt.Color(255, 255, 255));
        botonregistro1.setText("<html>REGISTRO <P>ESTUDIANTE<html>");
        botonregistro1.setBorder(null);
        botonregistro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonregistro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonregistro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonregistro1MouseExited(evt);
            }
        });
        botonregistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistro1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonregistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 160, 50));

        exx.setBackground(new java.awt.Color(255, 255, 255));
        exx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exx.setText("X");
        exx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exx, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exx, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

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

    private void botonsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsesionMouseEntered
        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botonsesionMouseEntered

    private void botonsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsesionMouseExited
        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
    }//GEN-LAST:event_botonsesionMouseExited

    private void listaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseEntered
        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_listaMouseEntered

    private void listaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseExited
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_listaMouseExited

    private void botonregistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroMouseEntered
        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botonregistroMouseEntered

    private void botonregistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroMouseExited
        jPanel1.setBackground(new java.awt.Color(155, 52, 0));
    }//GEN-LAST:event_botonregistroMouseExited

    private void botonregistro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistro1MouseEntered
        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botonregistro1MouseEntered

    private void botonregistro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistro1MouseExited
        jPanel1.setBackground(Color.black);
    }//GEN-LAST:event_botonregistro1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmou= evt.getX();
        ymou= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmou, y- ymou);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exxMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exxMouseClicked

    private void exxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exxMouseEntered
        jPanel2.setBackground(Color.red);
        jPanel2.setForeground(Color.white);
    }//GEN-LAST:event_exxMouseEntered

    private void exxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exxMouseExited
        jPanel2.setBackground(new java.awt.Color(150, 92, 0));
    }//GEN-LAST:event_exxMouseExited

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroActionPerformed
        this.setVisible(false);
        logAdmin logAd=new logAdmin();
        logAd.setVisible(true);
    }//GEN-LAST:event_botonregistroActionPerformed

    private void botonregistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistro1ActionPerformed
        this.setVisible(false);
        logUsua logusu=new logUsua();
        logusu.setVisible(true);
    }//GEN-LAST:event_botonregistro1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonregistro;
    private javax.swing.JButton botonregistro1;
    private javax.swing.JButton botonsesion;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel exx;
    private javax.swing.JLabel imgusua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JLabel perfil;
    private javax.swing.JTextField textcorreo;
    private javax.swing.JTextField textusua;
    private javax.swing.JLabel usua;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
