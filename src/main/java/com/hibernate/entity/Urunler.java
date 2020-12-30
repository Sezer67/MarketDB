package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urunler")
public class Urunler {
    
    @Id
    @Column(name="urun_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int urunId;
    
    @Column(name="urun_ad")
    private String urunAd;
    
    @Column(name="alis_fiyat")
    private double alisFiyati;
    
    @Column(name="satis_fiyat")
    private double satisFiyat;

    public Urunler() {
    }

    public Urunler(String urunAd, double alisFiyati, double satisFiyat) {
        this.urunAd = urunAd;
        this.alisFiyati = alisFiyati;
        this.satisFiyat = satisFiyat;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public double getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public double getSatisFiyat() {
        return satisFiyat;
    }

    public void setSatisFiyat(double satisFiyat) {
        this.satisFiyat = satisFiyat;
    }
    
    
}
