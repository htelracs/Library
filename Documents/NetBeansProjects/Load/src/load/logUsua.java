/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package load;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Suco
 */
public class logUsua extends javax.swing.JFrame {
    int xmouse, ymouse;
    public logUsua() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(labelfon, "C:\\Users\\Suco\\Pictures\\img\\fondo.jpg");
        setImagen(iccorr, "C:\\Users\\Suco\\Pictures\\img\\corr.jpg");
        setImagen(icusua, "C:\\Users\\Suco\\Pictures\\img\\usua.jpg");
        setImagen(iccod, "C:\\Users\\Suco\\Pictures\\img\\codi.jpg");
        setImagen(icpass, "C:\\Users\\Suco\\Pictures\\img\\cont.jpg");
        setImagen(icfacu, "C:\\Users\\Suco\\Pictures\\img\\fac.jpg");
        setImagen(ictel, "C:\\Users\\Suco\\Pictures\\img\\cel.jpg");
        setImagen(iccedu, "C:\\Users\\Suco\\Pictures\\img\\ced.jpg");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoi = new javax.swing.JPanel();
        textreg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        textusua = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textucor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        textcedu = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        texttel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        textcod = new javax.swing.JTextField();
        coduni = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        contrasena = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        facu = new javax.swing.JLabel();
        icusua = new javax.swing.JLabel();
        iccorr = new javax.swing.JLabel();
        icpass = new javax.swing.JLabel();
        iccod = new javax.swing.JLabel();
        iccedu = new javax.swing.JLabel();
        icfacu = new javax.swing.JLabel();
        ictel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelfon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoi.setBackground(new java.awt.Color(255, 255, 255));
        fondoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textreg.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        textreg.setForeground(new java.awt.Color(0, 0, 255));
        textreg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textreg.setText("REGISTRO USUARIO¡");
        textreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoi.add(textreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 380, 40));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
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

        usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario.setText("Usuario");

        textusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusua.setForeground(new java.awt.Color(204, 204, 204));
        textusua.setText("Ingrese su usuario");
        textusua.setBorder(null);
        textusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        correo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        correo.setText("Correo");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        textucor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textucor.setForeground(new java.awt.Color(204, 204, 204));
        textucor.setText("Ingrese su usuario");
        textucor.setBorder(null);
        textucor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        textcedu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textcedu.setForeground(new java.awt.Color(204, 204, 204));
        textcedu.setText("Ingrese su usuario");
        textcedu.setBorder(null);
        textcedu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cedula.setText("Cédula");

        telefono.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefono.setText("Teléfono");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        texttel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texttel.setForeground(new java.awt.Color(204, 204, 204));
        texttel.setText("Ingrese su usuario");
        texttel.setBorder(null);
        texttel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        textcod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textcod.setForeground(new java.awt.Color(204, 204, 204));
        textcod.setText("Ingrese su usuario");
        textcod.setBorder(null);
        textcod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        coduni.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        coduni.setText("Código Único");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        contrasena.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        contrasena.setText("Password");

        jComboBox1.setBackground(new java.awt.Color(153, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración de empresas", "Cincia de datos e inteligencia artificial", "Economía", "Física", "Matemática", "Mecánica", "Química", "Computación", "Electricidad", "Geología", "Mecatrónica", "Sistema de información", "Telecomunicaciones", "Ambiental", "Civil", "Electrónica y automatización", "Petróleos", "Software", "Agua y saneamiento ambiental", "Redes y telecomunicaciones", "Electromecánica" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        facu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        facu.setText("Facultad");

        icusua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/usua.jpg"))); // NOI18N
        icusua.setText("jLabel2");
        icusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icusua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icusuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icusuaMouseExited(evt);
            }
        });

        iccorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/corr.jpg"))); // NOI18N
        iccorr.setText("jLabel2");
        iccorr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iccorr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iccorrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iccorrMouseExited(evt);
            }
        });

        icpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cont.jpg"))); // NOI18N
        icpass.setText("jLabel2");
        icpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icpassMouseExited(evt);
            }
        });

        iccod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/codi.jpg"))); // NOI18N
        iccod.setText("jLabel2");
        iccod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iccod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iccodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iccodMouseExited(evt);
            }
        });

        iccedu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ced.jpg"))); // NOI18N
        iccedu.setText("jLabel1");
        iccedu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iccedu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icceduMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icceduMouseExited(evt);
            }
        });

        icfacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fac.jpg"))); // NOI18N
        icfacu.setText("jLabel2");
        icfacu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icfacu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icfacuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icfacuMouseExited(evt);
            }
        });

        ictel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cel.jpg"))); // NOI18N
        ictel.setText("jLabel2");
        ictel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ictel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ictelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ictelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(icusua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iccorr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iccod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iccedu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icfacu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ictel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textusua, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textucor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texttel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcod, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coduni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(319, 319, 319))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textcedu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textusua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(icusua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textucor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iccorr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textcedu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(iccedu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texttel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ictel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(coduni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textcod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iccod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icpass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(facu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icfacu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondoi.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 570));

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoi.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, 40));

        jButton2.setBackground(new java.awt.Color(153, 102, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoi.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 100, 40));

        jButton3.setBackground(new java.awt.Color(153, 102, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoi.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 100, 40));

        labelfon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        labelfon.setText("jLabel1");
        fondoi.add(labelfon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icusuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icusuaMouseEntered
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_icusuaMouseEntered

    private void icusuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icusuaMouseExited
        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
    }//GEN-LAST:event_icusuaMouseExited

    private void iccorrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iccorrMouseEntered
        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
    }//GEN-LAST:event_iccorrMouseEntered

    private void iccorrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iccorrMouseExited
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_iccorrMouseExited

    private void icceduMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icceduMouseEntered
        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
    }//GEN-LAST:event_icceduMouseEntered

    private void icceduMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icceduMouseExited
        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_icceduMouseExited

    private void ictelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ictelMouseEntered
        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_ictelMouseEntered

    private void ictelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ictelMouseExited
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ictelMouseExited

    private void iccodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iccodMouseEntered
        jPanel1.setBackground(new java.awt.Color(102, 153, 0));
    }//GEN-LAST:event_iccodMouseEntered

    private void iccodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iccodMouseExited
        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
    }//GEN-LAST:event_iccodMouseExited

    private void icpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icpassMouseEntered
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_icpassMouseEntered

    private void icpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icpassMouseExited
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_icpassMouseExited

    private void icfacuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icfacuMouseEntered
        jPanel1.setBackground(new java.awt.Color(102, 153, 0));
    }//GEN-LAST:event_icfacuMouseEntered

    private void icfacuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icfacuMouseExited
        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_icfacuMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      FlatLightLaf.setup();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logUsua().setVisible(true);
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
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel coduni;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel facu;
    private javax.swing.JPanel fondoi;
    private javax.swing.JLabel iccedu;
    private javax.swing.JLabel iccod;
    private javax.swing.JLabel iccorr;
    private javax.swing.JLabel icfacu;
    private javax.swing.JLabel icpass;
    private javax.swing.JLabel ictel;
    private javax.swing.JLabel icusua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelfon;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField textcedu;
    private javax.swing.JTextField textcod;
    private javax.swing.JLabel textreg;
    private javax.swing.JTextField texttel;
    private javax.swing.JTextField textucor;
    private javax.swing.JTextField textusua;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
