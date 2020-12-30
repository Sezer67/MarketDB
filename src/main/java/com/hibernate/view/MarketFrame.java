package com.hibernate.view;

import com.hibernate.entity.Fis;
import com.hibernate.entity.Musteriler;
import com.hibernate.entity.Urunler;
import com.hibernate.util.HibernateUtil;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MarketFrame extends javax.swing.JFrame {

    Transaction transaction = null;
    DefaultTableModel model = null;
    
    DefaultListModel<String> listModelUrun;
    DefaultListModel<String> listModelSepet;
    
    public MarketFrame() {
        initComponents();
       txt_fis.setEnabled(false);
       this.setResizable(false);
       listModelUrun = new DefaultListModel<>();
       listModelSepet = new DefaultListModel<>();
       list_urun.setModel(listModelUrun);
       list_sepet.setModel(listModelSepet);
      btn_buy.setEnabled(false);
       //ürünler listesini ekle
       addListUrun();
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Musteri = new javax.swing.JPanel();
        btn_buy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_urun = new javax.swing.JList<>();
        panel_giris = new javax.swing.JPanel();
        txt_Musteriadi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Mnew = new javax.swing.JButton();
        btn_Mlogin = new javax.swing.JButton();
        txt_Musterisoyad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_urunFiyat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_sepet = new javax.swing.JList<>();
        lbl_toplamFiyat = new javax.swing.JLabel();
        btn_leave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_ekle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_calculate = new javax.swing.JButton();
        txt_fis = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_Mshow = new javax.swing.JButton();
        btn_Ushow = new javax.swing.JButton();
        txt_degistir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_kazanc = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bar_oran = new javax.swing.JProgressBar();
        btn_degistir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Mdelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_createUrun = new javax.swing.JButton();
        btn_Fshow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kenar Market");
        setBackground(new java.awt.Color(51, 51, 51));

        panel_Musteri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 102))); // NOI18N

        btn_buy.setText("Satın Al");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        list_urun.setBackground(new java.awt.Color(240, 240, 240));
        list_urun.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürünler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 0, 153))); // NOI18N
        list_urun.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_urunValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list_urun);

        panel_giris.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giriş", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("Soyadı");

        jLabel1.setText("Adı");

        btn_Mnew.setText("Yeni Kayıt");
        btn_Mnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MnewActionPerformed(evt);
            }
        });

        btn_Mlogin.setText("Giriş");
        btn_Mlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MloginActionPerformed(evt);
            }
        });

        jLabel8.setText("İD");

        javax.swing.GroupLayout panel_girisLayout = new javax.swing.GroupLayout(panel_giris);
        panel_giris.setLayout(panel_girisLayout);
        panel_girisLayout.setHorizontalGroup(
            panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_girisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_girisLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Musteriadi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_girisLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Musterisoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Mnew))
                .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_girisLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_girisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Mlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_girisLayout.setVerticalGroup(
            panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_girisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Musteriadi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txt_Musterisoyad))
                .addGap(18, 18, 18)
                .addGroup(panel_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mnew)
                    .addComponent(btn_Mlogin))
                .addContainerGap())
        );

        lbl_urunFiyat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_urunFiyat.setText("0.0");

        list_sepet.setBackground(new java.awt.Color(240, 240, 240));
        list_sepet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sepetim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jScrollPane2.setViewportView(list_sepet);

        lbl_toplamFiyat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_toplamFiyat.setText("0.0");

        btn_leave.setText("Yerine Koy");
        btn_leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sepet Fiyatı");

        btn_ekle.setText("Sepete At");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ürünün Fiyatı ");

        btn_calculate.setText("Hesapla");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_MusteriLayout = new javax.swing.GroupLayout(panel_Musteri);
        panel_Musteri.setLayout(panel_MusteriLayout);
        panel_MusteriLayout.setHorizontalGroup(
            panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MusteriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_MusteriLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_urunFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_toplamFiyat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_leave, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btn_calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panel_MusteriLayout.setVerticalGroup(
            panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MusteriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_giris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_MusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_MusteriLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_urunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_toplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btn_ekle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MusteriLayout.createSequentialGroup()
                        .addComponent(btn_leave)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calculate)
                        .addGap(20, 20, 20)
                        .addComponent(btn_buy))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_fis.setEditable(false);
        txt_fis.setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Market Sahibi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(0, 51, 153))); // NOI18N

        btn_Mshow.setText("Müşterileri Gör");
        btn_Mshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MshowActionPerformed(evt);
            }
        });

        btn_Ushow.setText("Ürünleri Gör");
        btn_Ushow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UshowActionPerformed(evt);
            }
        });

        jLabel5.setText("(Sadece program ilk kez çalıştığında bas )");

        lbl_kazanc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_kazanc.setText("0.0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        bar_oran.setStringPainted(true);

        btn_degistir.setText("Değiştir");
        btn_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_degistirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Satış Fiyatını Değiştir");

        btn_Mdelete.setText("Müşteriyi Sil");
        btn_Mdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MdeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Kazancım");

        btn_createUrun.setText("Ürünleri Oluştur");
        btn_createUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createUrunActionPerformed(evt);
            }
        });

        btn_Fshow.setText("İşlemleri Gör");
        btn_Fshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FshowActionPerformed(evt);
            }
        });

        jButton1.setText("Ürün Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_Mshow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_kazanc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_createUrun)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btn_Ushow, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Fshow, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_degistir, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_degistir)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(bar_oran, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btn_Mdelete))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mshow)
                    .addComponent(btn_Ushow)
                    .addComponent(btn_Fshow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Mdelete)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar_oran, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_kazanc, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_degistir)
                    .addComponent(btn_createUrun)
                    .addComponent(jButton1))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fis, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(panel_Musteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Musteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fis)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addListUrun(){
        //ürünler listesine eleman eklemek
       try(Session session = HibernateUtil.getSessionFactory().openSession();){
        List<Urunler> urunler = session.createQuery("from Urunler", Urunler.class).list();
        for (int i = 0; i < urunler.size(); i++) 
            listModelUrun.addElement(urunler.get(i).getUrunAd());
       }catch(Exception ex){
           if(transaction != null)
               transaction.rollback();
           ex.printStackTrace();
       }
    }
    
    public void createUrunler(){
        Urunler urun1 = new Urunler("Süt",3,4.25);//alış 3 tl satış 4 tl
        Urunler urun2 = new Urunler("Ekmek",1, 1.75);
        Urunler urun3 = new Urunler("Peynir",5, 7.25);
        Urunler urun4 = new Urunler("Yumurta",9.5, 13.25);
        Urunler urun5 = new Urunler("Çay",14.5, 18.75);
        Urunler urun6 = new Urunler("Su",0.25, 0.50);
        Urunler urun7 = new Urunler("Salatalık",3, 4.25);
        Urunler urun8 = new Urunler("Kola",1.75, 2.75);
        Urunler urun9 = new Urunler("Sigara",10, 15);
        Urunler urun10 = new Urunler("Çikolata",0.75, 1.25);
        
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(urun1);
            session.save(urun2);
            session.save(urun3);
            session.save(urun4);
            session.save(urun5);
            session.save(urun6);
            session.save(urun7);
            session.save(urun8);
            session.save(urun9);
            session.save(urun10);
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
    }
    } 
    public void kazancHesabi(){
         //seçilen satırdaki üründen kazancı ve oranı lbl ve progress barda göstersin
        jTable1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            //eğer o satıra tıklandıysa 
            if(e.getClickCount() >=1){
                int selectRow = jTable1.getSelectedRow();
                //aliş fiyatı sütun =2 satış fiyatı sütun =3
                double alis = Double.parseDouble(jTable1.getValueAt(selectRow, 2).toString());
                double satis = Double.parseDouble(jTable1.getValueAt(selectRow, 3).toString());
                
                double kazanc = satis - alis;
                lbl_kazanc.setText(String.valueOf(kazanc)+ " TL");
                
                int oran = (int) (100*(satis-alis)/alis);
                bar_oran.setValue(oran);
            }
        }
        });
    }
    
    private void btn_MloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MloginActionPerformed
        int id = Integer.parseInt(txt_id.getText());
        //böyle bir kişi varsa markete hoşgeldiniz dicek yoksa kayıt ettircek 
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            
            Musteriler musteri = session.load(Musteriler.class, id);
            JOptionPane.showMessageDialog(rootPane, "Sayın " + musteri.getMusteriAd() + " Marketimize Hoşgeldiniz");
            txt_id.setEnabled(false);//girilen müşteriye sonradan ulaşmak için yani kullanıcı değişmesin diye veya silmesin
            
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) 
            transaction.rollback();
           JOptionPane.showMessageDialog(rootPane, "Sistemde bu İD ye sahip kayıtlı bulunmamaktadır");
        }
    }//GEN-LAST:event_btn_MloginActionPerformed

    private void btn_MnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MnewActionPerformed
        String ad = txt_Musteriadi.getText();
        String soyad = txt_Musterisoyad.getText();
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Musteriler musteri = new Musteriler(ad , soyad);
            session.save(musteri);
            txt_Musteriadi.setText("");
            txt_Musterisoyad.setText("");
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
        btn_MshowActionPerformed(evt);
    }//GEN-LAST:event_btn_MnewActionPerformed

    private void btn_MshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MshowActionPerformed
        Object[] headers = {"Müşteri ID", "Müşteri Adı", "Müşteri Soyadı"};
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Musteriler> musteriler = session.createQuery("from Musteriler", Musteriler.class).list();
            Object[][] data = new Object[musteriler.size()][3];
            for (int i = 0; i < data.length; i++) {
                data[i][0] = musteriler.get(i).getMusteriId();
                data[i][1] = musteriler.get(i).getMusteriAd();
                data[i][2] = musteriler.get(i).getMusteriSoyad();
            }
            model = new DefaultTableModel(data, headers){
                @Override
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
            jTable1.setModel(model);
            
        } catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_MshowActionPerformed

    private void btn_createUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createUrunActionPerformed
        createUrunler();
        addListUrun(); // ilk çalışmada Ürün list boş olacak 
        btn_createUrun.setEnabled(false);
        btn_UshowActionPerformed(evt);
    }//GEN-LAST:event_btn_createUrunActionPerformed

    private void list_urunValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_urunValueChanged
        int selectedItemIndex = list_urun.getSelectedIndex();
        //burdaki isme göre fiyatını bulucam
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            
            int urunId = selectedItemIndex +1 ;
            Urunler urun = session.load(Urunler.class, urunId); // o indextedi ürünün satış fiyatını çekicez
            lbl_urunFiyat.setText((urun.getSatisFiyat())+"");
            
            transaction.commit();
        }catch(Exception e){
            if(transaction != null)
            transaction.rollback();
         e.printStackTrace();
        }
    }//GEN-LAST:event_list_urunValueChanged

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
       List<String> selectedItem = list_urun.getSelectedValuesList();
       for(int i=0;i<selectedItem.size();i++){
           listModelSepet.addElement(selectedItem.get(i));
       }
       JOptionPane.showMessageDialog(rootPane,"Hesapla Butonuna Basmayı Unutmayınız","DİKKAT",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leaveActionPerformed
        //seçilen elemanların indexlerini alıp Sepet listesinden kaldırcam
        for(int i=0; i<listModelSepet.size();i++){
            int selectedIndex = list_sepet.getSelectedIndex();
            listModelSepet.remove(selectedIndex);
        }
        JOptionPane.showMessageDialog(rootPane,"Hesapla Butonuna Basmayı Unutmayınız","DİKKAT",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_leaveActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        //iki farklı yerde kullanılıyor (sepet atmak ve sepetten çıkarmak ikisinde de toplam fiyatım değişecek)
        //ekledikten sonra sepetin toplam fiyatı gözükmeli
        //sepetteki ürünün Urunler tablosundaki id ye erişmeliyim bunun için de önce listurunden o ürünü bulmalıyım 
        double toplam = 0;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (int i = 0; i < listModelSepet.size(); i++) {
                for (int j = 0; j < listModelUrun.size(); j++) {
                    String sepet = listModelSepet.getElementAt(i).toString();
                    String uruna = listModelUrun.getElementAt(j).toString();
                    if (sepet.equals(uruna)) {
                        //ürünlerlistesindeki elemanın index ini bulmalıyım
                        //zaten j o elemanın indexini verir ama id 1 den başladığı için +1 ekleriz
                        int urunId = j + 1;
                        Urunler urun = session.load(Urunler.class, urunId);//Sepetteki her bir ürün için fiyatları toplucaz
                        toplam += urun.getSatisFiyat();
                    }
                }
            }
            lbl_toplamFiyat.setText(toplam + "");
            btn_buy.setEnabled(true);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed

        String kontrol = txt_id.getText();
        if(kontrol.equals(""))
            JOptionPane.showMessageDialog(rootPane,"Önce Müşteri Girişi Yapmalısınız","HATA",JOptionPane.ERROR_MESSAGE);
        
        else {

            double tutar = Double.parseDouble(lbl_toplamFiyat.getText());
            int musteriId = Integer.parseInt(txt_id.getText());
            //önce o müşteriyi bulalım

            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();

                Musteriler musteri = session.load(Musteriler.class, musteriId);
                Fis fis = new Fis(tutar, musteri);
                session.save(fis);

                txt_fis.setText("Fiş Numaranız:" + fis.getFisNo()
                        + "\tMüşteri İD:" + musteri.getMusteriId()
                        + "\tTutar:" + tutar + "\tYine Bekleriz");
                //müşterinin satın alma işlemi bittikten sonra artık marketten çıkcağı için Yeniden İd girişi açılmalı
                txt_id.setEnabled(true);
                listModelSepet.removeAllElements();
   
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) 
                    transaction.rollback();
                e.printStackTrace();
            }
        }
        btn_FshowActionPerformed(evt);
        
    }//GEN-LAST:event_btn_buyActionPerformed

    private void btn_FshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FshowActionPerformed
         Object[] headers = {"Fiş Numarası", "Müşteri Id", "Tutar"};
         
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
         List<Fis> fisler = session.createQuery("from Fis",Fis.class).list();
         Object[][] data = new Object[fisler.size()][3];
         for (int i = 0; i < fisler.size(); i++) {
                data[i][0] = fisler.get(i).getFisNo();
                data[i][1] = fisler.get(i).getMusteri().getMusteriId();
                data[i][2] = fisler.get(i).getTutar();
         }
         model = new DefaultTableModel(data, headers){
                @Override
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
         jTable1.setModel(model);
       
        } catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_FshowActionPerformed

    private void btn_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_degistirActionPerformed
        //satış Fiyatları 3. sütun
        int selectRow = jTable1.getSelectedRow();
        Double eskiFiyat = Double.parseDouble(jTable1.getValueAt(selectRow, 3).toString());
        //Tablodaki fiyata ulaştık şimdi update edecem
        int id = Integer.parseInt(jTable1.getValueAt(selectRow, 0).toString());
        Double yeniFiyat = Double.parseDouble(txt_degistir.getText());
       
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            Urunler urun = session.load(Urunler.class, id);
            urun.setSatisFiyat(yeniFiyat);
            session.update(urun);

            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
        btn_UshowActionPerformed(evt);
    }//GEN-LAST:event_btn_degistirActionPerformed

    private void btn_MdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MdeleteActionPerformed
        //tablodan seçilen satırı silecek
        int selectRow = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(selectRow, 0).toString()); // ürün id sine ulaştı
        
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Object musteri = session.load(Musteriler.class,id);
            session.delete(musteri);
            
            transaction.commit();
            
        }catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            JOptionPane.showMessageDialog(rootPane,"Seçilen Müşterinin Alışveriş Kaydı Olduğu İçin Silinemez","HATA",JOptionPane.ERROR_MESSAGE);
        }
        btn_MshowActionPerformed(evt);
        
    }//GEN-LAST:event_btn_MdeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addFrame addUrun = new addFrame();
        addUrun.setVisible(true);
        addUrun.pack();
        addUrun.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_UshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UshowActionPerformed
              Object[] headers = {"Urun ID", "Urun Adı", "Alış Fiyatı", "Satış Fiyatı"};
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Urunler> urunler = session.createQuery("from Urunler", Urunler.class).list();
            Object[][] data = new Object[urunler.size()][4];
            for (int i = 0; i < data.length; i++) {
                data[i][0] = urunler.get(i).getUrunId();
                data[i][1] = urunler.get(i).getUrunAd();
                data[i][2] = urunler.get(i).getAlisFiyati();
                data[i][3] = urunler.get(i).getSatisFiyat();
            }
            model = new DefaultTableModel(data, headers){
                @Override
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
            jTable1.setModel(model);
            
            
        } catch (Exception e) {
            if (transaction != null) 
                transaction.rollback();
            e.printStackTrace();
        }
        kazancHesabi();
    }//GEN-LAST:event_btn_UshowActionPerformed
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
            java.util.logging.Logger.getLogger(MarketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_oran;
    private javax.swing.JButton btn_Fshow;
    private javax.swing.JButton btn_Mdelete;
    private javax.swing.JButton btn_Mlogin;
    private javax.swing.JButton btn_Mnew;
    private javax.swing.JButton btn_Mshow;
    public javax.swing.JButton btn_Ushow;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_createUrun;
    private javax.swing.JButton btn_degistir;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_leave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_kazanc;
    private javax.swing.JLabel lbl_toplamFiyat;
    private javax.swing.JLabel lbl_urunFiyat;
    private javax.swing.JList<String> list_sepet;
    private javax.swing.JList<String> list_urun;
    private javax.swing.JPanel panel_Musteri;
    private javax.swing.JPanel panel_giris;
    private javax.swing.JTextField txt_Musteriadi;
    private javax.swing.JTextField txt_Musterisoyad;
    private javax.swing.JTextField txt_degistir;
    private javax.swing.JTextField txt_fis;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables

}
