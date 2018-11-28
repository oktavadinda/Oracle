/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class TambahDokterDialog extends JDialog {

    private RumahSakit rumahSakit;
    private JLabel tambahDokterLabel;
    private JLabel idDokterLabel;
    private JTextField idDokterText;
    private JLabel namaDokterLabel;
    private JTextField namaDokterText;
    private JButton tambahButton;

    public TambahDokterDialog(JDialog owner, RumahSakit rs) {
        super(owner);
        rumahSakit = rs;
        init();
    }

    /**
     * Fungsi untuk inisialisasi
     */
    public void init() {
        // set size
        setSize(400, 300);
        // set layout
        setLayout(null);

        tambahDokterLabel = new JLabel("Tambah Dokter");
        tambahDokterLabel.setBounds(230, 15, 150, 10);
        this.add(tambahDokterLabel);

        idDokterLabel = new JLabel("Id Dokter");
        idDokterLabel.setBounds(20, 50, 100, 15);
        this.add(idDokterLabel);
        
        idDokterText = new JTextField();
        idDokterText.setBounds(150, 50, 350, 20);
        this.add(idDokterText);
        
        // tambah Tombol Tambah
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(50, 200, 100, 30);
        add(tambahButton);
        // set action listener button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahDokter();
            }
        });
    }

    public void tambahDokter() {
        dispose();
    }

}
