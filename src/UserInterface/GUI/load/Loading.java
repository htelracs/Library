/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.GUI.load;

/**
 *
 * @author Grupo 4
 */
public class Loading extends javax.swing.JFrame {
    public Loading() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Carga = new javax.swing.JLabel();
        barracarga = new javax.swing.JProgressBar();
        Text = new javax.swing.JLabel();
        imgc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Carga.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Carga.setForeground(new java.awt.Color(255, 255, 255));
        Carga.setText("0%");
        getContentPane().add(Carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 430, 110, 37));
        getContentPane().add(barracarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 820, 32));

        Text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Loading....");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 430, -1));

        imgc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.jpg"))); // NOI18N
        imgc.setText("jLabel2");
        getContentPane().add(imgc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Carga;
    public static javax.swing.JLabel Text;
    public static javax.swing.JProgressBar barracarga;
    private javax.swing.JLabel imgc;
    // End of variables declaration//GEN-END:variables
}
