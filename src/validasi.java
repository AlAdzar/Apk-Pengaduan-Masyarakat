/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Database.KoneksiDatabase;
import Database.ResultSetTable;

import javax.swing.JOptionPane;

import Database.ResultSetTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.view.JRViewer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.java.conection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.java.conection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.DriverManager;
import java.sql.Statement;
/*
 * LaporanPelanggan.java
 *
 * Created on Jun 27, 2012, 9:59:46 PM
 */

/**
 *
 * @author suyoto
 */
public class validasi extends javax.swing.JFrame {

    ResultSet rs;
    KoneksiDatabase con;
    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost/masyarakat";

    /**
     * Creates new form LaporanPelanggan
     */
    public validasi() {
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel();
        loadPasien();
        loadTabel();
        nonaktif();
    }

    private void nonaktif() {

        txt_no.setEnabled(false);
        jTextArea1.setEnabled(false);
        //txt_tgl.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox1.setEnabled(true);
    }

    private void Aktif() {
    }

    public class cetak {

        public cetak(String nama) {
            try {
                conection konek = new conection();
                Connection con = konek.getConnection();

                Map<String, Object> map = new HashMap<>();

                map.put("no", txt_no.getText());

                File file = new File(nama);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, con);
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception ex) {
                System.out.println(ex);
                Logger.getLogger(pengaduan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txt_no = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_tgl = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSearch = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Id Pengaduan");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txt_no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noActionPerformed(evt);
            }
        });
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Tanggal Pengaduan");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txt_tgl.setForeground(new java.awt.Color(255, 255, 255));
        txt_tgl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 220, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Nik");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Isi Laporan");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Status");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton8.setText("Edit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menunggu", "Proses", "Selesai" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 220, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nik" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 240, 230));

        jTable2.setBackground(new java.awt.Color(0, 153, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Pengaduan", "Tanggal Pengaduan", "Nik", "Status", "Isi Laporan"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 780, 100));

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("VALIDASI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("PRINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jSearch.setText("SEARCH");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 120, -1));

        txt_search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 610, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/iStock-616893620.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.jpg"))); // NOI18N
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 480));

        setSize(new java.awt.Dimension(812, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String st = (String) jComboBox1.getSelectedItem();
        ResultSet rst = con.querySelectAll("masyarakat", "nik='" + st + "'");
        try {
            while (rst.next()) {
            }
        } catch (SQLException ex) {
            Logger.getLogger(pengaduan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try {
            if (!txt_no.getText().isEmpty()) {
                String kolom[] = {"no_pengaduan", "tgl", "nik", "status", "isi_pengaduan"};
                java.util.Date tgl = (java.util.Date) this.txt_tgl.getDate();
                String isi[] = {txt_no.getText(), new java.sql.Date(tgl.getTime()).toString(), jComboBox2.getSelectedItem().toString(), jComboBox1.getSelectedItem().toString(), jTextArea1.getText()};

                con.queryUpdate("pengaduan", kolom, isi, "no_pengaduan='" + String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)) + "'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            } else {
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        txt_no.setText("");
        jComboBox2.setSelectedItem("");
        jComboBox1.setSelectedItem("");
        jTextArea1.setText("");
        loadTabel();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new cetak("src\\laporan\\kclaim.jasper");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        if (txt_search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        } else {
            try {
                rs = con.querySelectAll("pengaduan", "no LIKE '%" + txt_search.getText() + "%' OR tgl LIKE '%" + txt_search.getText() + "%' OR nik LIKE '%" + txt_search.getText() + "&'");
                jTable2.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
    }//GEN-LAST:event_jSearchActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        txt_no.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
        jComboBox2.setSelectedItem(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 2)));
        jTextArea1.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 4)));
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new validasi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSearch;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_search;
    private com.toedter.calendar.JDateChooser txt_tgl;
    // End of variables declaration//GEN-END:variables

    private void loadPasien() {  // mengambil database

        rs = con.querySelectAll("masyarakat");
        try {
            while (rs.next()) {
                jComboBox2.addItem(rs.getString("nik"));
            }

        } catch (SQLException ex) {
            // Logger.getLogger(Form_Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadTabel() {
        String namaKolom[] = {"no_pengaduan", "tgl", "nik", "status", "isi_pengaduan"}; //,
        rs = con.querySelect(namaKolom, "pengaduan");
        jTable2.setModel(new ResultSetTable(rs)); //,"tgl_pinjam","tgl_kembali" ,jDateChooser1.getDateFormatString(),jDateChooser2.getDateFormatString()
    }
}