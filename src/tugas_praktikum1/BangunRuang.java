/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum1;

import java.util.HashMap;

/**
 *
 * @author Richie-PC
 */
public class BangunRuang {

    public static final String PERSEGI = "persegi", PERSEGI_PANJANG = "persegi panjang", SEGITIGA = "segitiga"
            , JAJAR_GENJANG = "jajar genjang";
    public static final String TIPE[] = {PERSEGI, PERSEGI_PANJANG, SEGITIGA, JAJAR_GENJANG}; //"belah ketupat", "layang layang", "trapesium"

    private HashMap<String, String> type = new HashMap<>();

    public void initType() {
        for (String s : this.TIPE) {
            String initial = "";
            for (String x : s.split(" ")) {
                initial += x.charAt(0);
            }
            this.type.put(s, initial);
        }
    }

    public double luasPermukaan(double t, double a) {
        return (t * a) / 2;
    }
}
