/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisteminformasipemesanantravel;

/**
 *
 * @author WINDOWS 11
 */
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Date;
import javax.swing.JOptionPane;

public class GUI_SI extends javax.swing.JFrame {

    /**
     * Creates new form GUI_SI
     */
    public GUI_SI() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
        tampiltanggal();

        harga.disable();
        biayayangdiperlukan.disable();
        jenistravel.disable();
        jlabel10.disable();
        kembalian.disable();

    }

    //method tanggal
    public void tampiltanggal() {
        Date tgl = new Date();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(aa.format(tgl));

    }

    //MEMBUAT METHOD JUMLAH KARAKTER 
    public void JumlahKarakter(KeyEvent a) {
        if (transaksi.getText().length() == 8) {
            a.consume();
            JOptionPane.showMessageDialog(null,
                    "Maksimal 7 KARAKTER!",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    //METHOD HANYA ANGKA
    public void FilterAngka(KeyEvent B) {
        if (Character.isAlphabetic(B.getKeyChar())) {
            B.consume();
            JOptionPane.showMessageDialog(null,
                    "Masukkan ANGKA YA BOS",
                    "Peringatan", JOptionPane.WARNING_MESSAGE
            );
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transaksi = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        destinasiwisata = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jenistravel = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        lamaperjalanan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tambahan = new javax.swing.JComboBox<>();
        biayayangdiperlukan = new javax.swing.JTextField();
        jlabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalbiaya = new javax.swing.JTextField();
        uangbayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INFORMASI BIAYA PERJALANAN TRAVEL");

        jLabel2.setText("Nama Pemesan");

        jLabel3.setText("Destinasi Wisata");

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal");

        destinasiwisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BALI", "JAKARTA", "YOGYAKARTA", " " }));
        destinasiwisata.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinasiwisataItemStateChanged(evt);
            }
        });
        destinasiwisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinasiwisataActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Travel");

        jLabel6.setText("Harga");

        jLabel7.setText("Lama Perjalanan");

        jenistravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenistravelActionPerformed(evt);
            }
        });

        lamaperjalanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaperjalananActionPerformed(evt);
            }
        });
        lamaperjalanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lamaperjalananKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lamaperjalananKeyReleased(evt);
            }
        });

        jLabel8.setText("Tambahan");

        jLabel9.setText("Biaya Yang Diperlukan");

        Tambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KARAOKE PLUS MAKANAN DAN SNACK", "TIDAK ADA TAMBAHAN" }));
        Tambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahanActionPerformed(evt);
            }
        });

        biayayangdiperlukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayayangdiperlukanActionPerformed(evt);
            }
        });

        jlabel10.setText("Total Biaya");

        jLabel11.setText("Masukan Jumlah uang Pembayaran");

        jLabel12.setText("Uang Kembali Anda");

        totalbiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbiayaActionPerformed(evt);
            }
        });

        uangbayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uangbayarFocusLost(evt);
            }
        });
        uangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangbayarActionPerformed(evt);
            }
        });

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });

        jButton1.setText("HAPUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TOTAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(destinasiwisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jenistravel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lamaperjalanan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(biayayangdiperlukan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(63, 63, 63))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinasiwisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenistravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lamaperjalanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(biayayangdiperlukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahanActionPerformed
        if (Tambahan.getSelectedItem() == "KARAOKE PLUS MAKANAN DAN SNACK") {
            biayayangdiperlukan.setText("200000");
        } else {
            biayayangdiperlukan.setText("0");
        }

    }//GEN-LAST:event_TambahanActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:.


    }//GEN-LAST:event_tanggalActionPerformed

    private void lamaperjalananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaperjalananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaperjalananActionPerformed

    private void destinasiwisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinasiwisataActionPerformed
        // TODO add your handling code here:
        if (destinasiwisata.getSelectedItem() == "BALI") {
            jenistravel.setText("BIG BUS");
            harga.setText("1000000");
        } else if (destinasiwisata.getSelectedItem() == "JAKARTA") {
            jenistravel.setText("BIG BUS");
            harga.setText("1500000");
        } else {
            jenistravel.setText("BIG BUS");
            harga.setText("1300000");
        }

    }//GEN-LAST:event_destinasiwisataActionPerformed

    private void jenistravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenistravelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenistravelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        transaksi.setText("");
        jenistravel.setText("");
        harga.setText("");
        lamaperjalanan.setText("");
        biayayangdiperlukan.setText("");
        totalbiaya.setText("");
        uangbayar.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,
                "Apakah Yakin akan Keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void biayayangdiperlukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayayangdiperlukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayayangdiperlukanActionPerformed

    private void totalbiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbiayaActionPerformed

    private void uangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangbayarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_uangbayarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int sewa = Integer.parseInt(harga.getText());
        int lama = Integer.parseInt(lamaperjalanan.getText());
        int bise = Integer.parseInt(biayayangdiperlukan.getText());
        int tobi;

        tobi = ((sewa * lama) + bise);
        totalbiaya.setText(Integer.valueOf(tobi).toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_kembalianActionPerformed

    private void uangbayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uangbayarFocusLost
        // TODO add your handling code here:
        int cektotal = Integer.parseInt(totalbiaya.getText());
        int cekbayar = Integer.parseInt(uangbayar.getText());

        if (cekbayar < cektotal) {
            JOptionPane.showMessageDialog(null,
                    "Uang bayar kurang dari Total Bayar",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int hitungkembalian;
            hitungkembalian = cekbayar - cektotal;
            kembalian.setText(Integer.valueOf(hitungkembalian).toString());
        }

    }//GEN-LAST:event_uangbayarFocusLost

    private void lamaperjalananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamaperjalananKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lamaperjalananKeyPressed

    private void lamaperjalananKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamaperjalananKeyReleased
        // TODO add your handling code here:
        if (!lamaperjalanan.getText().isEmpty()) {
            PemesananMobil pm = new PemesananMobil();
            pm.setLamaPerjalanan(Integer.parseInt(lamaperjalanan.getText()));
            pm.setHargaDestinasi(Integer.parseInt(harga.getText()));
            int _totalBiaya = pm.hitungBiaya();
            totalbiaya.setText(String.valueOf(_totalBiaya));
        } else {
            totalbiaya.setText("");
        }
    }//GEN-LAST:event_lamaperjalananKeyReleased

    private void destinasiwisataItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinasiwisataItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_destinasiwisataItemStateChanged

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
            java.util.logging.Logger.getLogger(GUI_SI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_SI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_SI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_SI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_SI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tambahan;
    private javax.swing.JTextField biayayangdiperlukan;
    private javax.swing.JComboBox<String> destinasiwisata;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jenistravel;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField lamaperjalanan;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalbiaya;
    private javax.swing.JTextField transaksi;
    private javax.swing.JTextField uangbayar;
    // End of variables declaration//GEN-END:variables
}