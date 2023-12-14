/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectPratikum.Bab8;

/**
 *
 * @author Edwar Arliman Gea
 */
public class GUI_MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form GUI_MenuUtama
     */
    public GUI_MenuUtama() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        GUI_Mahasiswa = new javax.swing.JMenuItem();
        GUI_Matkul = new javax.swing.JMenuItem();
        GUI_Nilai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("HOME");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("FORM");

        GUI_Mahasiswa.setText("GUI Mahasiswa");
        GUI_Mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUI_MahasiswaActionPerformed(evt);
            }
        });
        jMenu2.add(GUI_Mahasiswa);

        GUI_Matkul.setText("GUI Mata Kuliah");
        GUI_Matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUI_MatkulActionPerformed(evt);
            }
        });
        jMenu2.add(GUI_Matkul);

        GUI_Nilai.setText("GUI Nilai");
        GUI_Nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUI_NilaiActionPerformed(evt);
            }
        });
        jMenu2.add(GUI_Nilai);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUI_MahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUI_MahasiswaActionPerformed
        // TODO add your handling code here:
        GUI_Mahasiswa mhs = new GUI_Mahasiswa();
        mhs.show();
    }//GEN-LAST:event_GUI_MahasiswaActionPerformed

    private void GUI_MatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUI_MatkulActionPerformed
        // TODO add your handling code here:
        GUI_Matkul mk = new GUI_Matkul();
        mk.show();
    }//GEN-LAST:event_GUI_MatkulActionPerformed

    private void GUI_NilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUI_NilaiActionPerformed
        // TODO add your handling code here:
        GUI_Penilaian nilai = new GUI_Penilaian();
        nilai.show();
    }//GEN-LAST:event_GUI_NilaiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GUI_Mahasiswa;
    private javax.swing.JMenuItem GUI_Matkul;
    private javax.swing.JMenuItem GUI_Nilai;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
