/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevim;

/**
 *
 * @author Baris
 */
public class Hasta {
//Databaseden sonra gereksiz class
    private String adi, soyadi;
    private int yas;
    private long tc, sifre;
    private boolean randevuVarMi = false;

    public Hasta(String adi, String soyadi, long tc, int yas, long sifre) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tc = tc;
        this.yas = yas;
        this.sifre = sifre;
    }

    public boolean isRandevuVarMi() {
        return randevuVarMi;
    }

    public void setRandevuVarMi(boolean randevuVarMi) {
        this.randevuVarMi = randevuVarMi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setTc(long tc) {
        this.tc = tc;
    }

    public void setSifre(long sifre) {
        this.sifre = sifre;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public long getTc() {
        return tc;
    }

    public int getYas() {
        return yas;
    }

    public long getSifre() {
        return sifre;
    }

}
