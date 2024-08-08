/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.GUI.load;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import static java.time.Instant.now;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Suco
 */
public class main extends javax.swing.JFrame {

    private Point point;
    int xmouse, ymouse;

    public main() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(imgbien, "C:\\Users\\Suco\\Pictures\\img\\img4.jpg");
        time();
        date();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingpanel = new javax.swing.JPanel();
        pan = new javax.swing.JPanel();
        biblio = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        enexit = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        WELCOM = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imgbien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        ingpanel.setBackground(new java.awt.Color(255, 255, 255));
        ingpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan.setBackground(new java.awt.Color(204, 153, 0));
        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        biblio.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        biblio.setForeground(new java.awt.Color(255, 255, 255));
        biblio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biblio.setText("Biblioteca");
        pan.add(biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 40));

        name.setFont(new java.awt.Font("Times New Roman", 2, 50)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setText("<html>Sueños<p>En<p>Papel<html>");
        pan.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 190, 240));

        enexit.setBackground(new java.awt.Color(204, 153, 0));

        exit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitMouseDragged(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout enexitLayout = new javax.swing.GroupLayout(enexit);
        enexit.setLayout(enexitLayout);
        enexitLayout.setHorizontalGroup(
            enexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        enexitLayout.setVerticalGroup(
            enexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pan.add(enexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        time.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("\"hh : mm : ss a\"");
        pan.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 140, 60));

        fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("\"yyyy / MM / dd \"");
        pan.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 160, 50));

        ingpanel.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        WELCOM.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 50)); // NOI18N
        WELCOM.setForeground(new java.awt.Color(255, 204, 0));
        WELCOM.setText("BIENVENIDOS");
        WELCOM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingpanel.add(WELCOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 390, 80));

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 250, 50));

        imgbien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img4.jpg"))); // NOI18N
        imgbien.setText("jLabel1");
        ingpanel.add(imgbien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int Currentx = this.getLocation().x;
        int Currenty = this.getLocation().y;
        int movex = (Currentx + evt.getX()) - (Currentx + point.x);
        int movey = (Currenty + evt.getY()) - (Currenty + point.y);
        int x = Currentx + movex;
        int y = Currenty + movey;
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_exitMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        enexit.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        enexit.setBackground(Color.LIGHT_GRAY);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        ingpanel.setBackground(new java.awt.Color(153, 102, 0));
        ingpanel.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        ingpanel.setBackground(new java.awt.Color(204, 51, 0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        login logg=new login();
        logg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }
    public void time(){
        DateTimeFormatter times=DateTimeFormatter.ofPattern("hh : mm : ss a");
        LocalDateTime now=LocalDateTime.now();
        time.setText(times.format(now));       
    }
    public void date(){
        DateTimeFormatter fechas=DateTimeFormatter.ofPattern("yyyy / MM / dd");
        LocalDateTime now=LocalDateTime.now();
        fecha.setText(fechas.format(now)); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WELCOM;
    private javax.swing.JLabel biblio;
    private javax.swing.JPanel enexit;
    public javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel imgbien;
    private javax.swing.JPanel ingpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pan;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
