/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevim;

import java.util.ArrayList;

/**
 *
 * @author Baris
 */
public class Hastane {

    private String adi;
    private int yatakSayisi;
    static ArrayList<Hastane> hastaneler = new ArrayList<>();
    ArrayList<Hasta> yataklardaYatanlar = new ArrayList<>();
    static ArrayList<Hasta> sistemeKayitliHastalar = new ArrayList<>();
    static ArrayList<String> hastaneİsimleri = new ArrayList<>();

    public Hastane() {
    }

    public Hastane(String adi) {
        this.adi = adi;
        this.yatakSayisi = 10;
        for (int i = 0; i < yatakSayisi; i++) {
            yataklardaYatanlar.add(new Hasta(" ", " ", 0, 0, 0));
        }
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYatakSayisi() {
        return yatakSayisi;
    }
//suçlu büyük ihtimalle bu müsait olunca kontrol et.

    public void setYatakSayisi(int yatakSayisi) {
        if (yatakSayisi > this.yatakSayisi) {
            for (int i = 0; i < yatakSayisi - this.yatakSayisi; i++) {
                yataklardaYatanlar.add(new Hasta(" ", " ", 0, 0, 0));
            }
        } else if (yatakSayisi < this.yatakSayisi) {
            for (int i = 0; i < this.yatakSayisi - yatakSayisi; i++) {
                yataklardaYatanlar.remove(this.yatakSayisi - (i + 1));
            }
        }
        this.yatakSayisi = yatakSayisi;
        for (int i = 0; i < this.yataklardaYatanlar.size(); i++) {
        }
    }

    public static void hastaneEkle(Hastane has) {
        hastaneler.add(has);
        hastaneİsimleri.add(has.getAdi());
        System.out.println("Hastane oluşturuldu");
    }

    public static void hastaneSil(int sira) {
        hastaneler.remove(sira);
        System.out.println("Hastane silindi");
    }

    public static void hastaKayit(Hasta hasta) {

        sistemeKayitliHastalar.add(hasta);
        System.out.println(hasta.getAdi() + "   "
                + "   " + hasta.getSifre()
                + "   " + hasta.getSoyadi()
                + "   " + hasta.getTc()
                + "   " + hasta.getYas());
        System.out.println("Hasta Oluşturuldu");
    }
}
