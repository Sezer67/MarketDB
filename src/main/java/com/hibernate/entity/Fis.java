
package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.hibernate.entity.Musteriler;

@Entity
@Table(name = "Fis")
public class Fis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fis_id")
    private int fisNo;
    
    @Column(name="tutar")
    private double tutar;
    
    //1 müşterinin n fişi olur
    @ManyToOne
    @JoinColumn(name="m_id" , foreignKey = @ForeignKey(name = " FK_mid"))
    private Musteriler musteri;

    public Fis() {
    }

    public Fis(double tutar, Musteriler musteri) {
        this.tutar = tutar;
        this.musteri = musteri;
    }

    public int getFisNo() {
        return fisNo;
    }

    public void setFisNo(int fisNo) {
        this.fisNo = fisNo;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }
    
    
}
