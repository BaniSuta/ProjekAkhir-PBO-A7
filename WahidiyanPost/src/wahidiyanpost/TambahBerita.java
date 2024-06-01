/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wahidiyanpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo - GK
 */
public class TambahBerita extends javax.swing.JFrame {

    /**
     * Creates new form TambahBerita
     */
    public TambahBerita() {
        initComponents();
    }

    private void cls() {
        txtjudul.setText("");
        txtisi.setText("");
        Date date = new Date();
       datechoose.setDate(date);
        cbjenis.setSelectedItem("Bencana");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtjudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        jlabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtisi = new javax.swing.JTextArea();
        btnback = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        datechoose = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Judul Berita");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 67, 90, 16);
        getContentPane().add(txtjudul);
        txtjudul.setBounds(233, 64, 234, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Jenis Berita");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(82, 101, 80, 16);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bencana", "Duka", "Keuangan", "Kriminal", "Sport", "Politik" }));
        getContentPane().add(cbjenis);
        cbjenis.setBounds(233, 98, 234, 22);

        jlabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel3.setText("Tanggal Berita");
        getContentPane().add(jlabel3);
        jlabel3.setBounds(82, 132, 100, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Isi Berita");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(82, 160, 70, 16);

        txtisi.setColumns(20);
        txtisi.setRows(5);
        jScrollPane1.setViewportView(txtisi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(233, 160, 234, 140);

        btnback.setBackground(new java.awt.Color(0, 153, 204));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(395, 318, 72, 23);

        btntambah.setBackground(new java.awt.Color(0, 153, 204));
        btntambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah);
        btntambah.setBounds(303, 318, 80, 23);

        datechoose.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(datechoose);
        datechoose.setBounds(233, 132, 230, 22);

        jPanel1.setBackground(java.awt.SystemColor.info);

        jLabel3.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("TAMBAH BERITA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(183, 183, 183))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        MenuAdmin MA = new MenuAdmin();
        MA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        String judul, jenis, tgl, isi;
        judul = txtjudul.getText();
        jenis = cbjenis.getSelectedItem().toString();
        isi = txtisi.getText();
        java.util.Date date = datechoose.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        tgl = sdf.format(date);

        try {
            Connection conn = koneksi.getConnection();
            String sql = "INSERT INTO berita VALUES (NULL, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Login.ID);
            stmt.setString(2, judul);
            stmt.setString(3, jenis);
            stmt.setString(4,tgl);
            stmt.setString(5, isi);

            int rowAffected = stmt.executeUpdate();
            if (rowAffected > 0) {
                cls();
                JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Berita!", "SQL Information", JOptionPane.INFORMATION_MESSAGE);
                MenuAdmin MA = new MenuAdmin();
                stmt.close();
                MA.setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btntambahActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbjenis;
    private com.toedter.calendar.JDateChooser datechoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextArea txtisi;
    private javax.swing.JTextField txtjudul;
    // End of variables declaration//GEN-END:variables
}
