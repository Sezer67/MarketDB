
package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musteriler")
public class Musteriler {
    
    @Id
    @Column(name="m_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int musteriId;
    
    @Column(name="m_ad")
    private String musteriAd;
    
    @Column(name="m_soyad")
    private String musteriSoyad;

    public Musteriler() {
    }

    public Musteriler(String musteriAd, String musteriSoyad) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
    }
    

    
    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }
    
}
