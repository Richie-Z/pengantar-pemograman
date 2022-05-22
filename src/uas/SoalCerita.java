package uas;

import java.util.Scanner;

/**
 * @author Immanuel Richie De Harjo Zakaria - 2142101927
 */

public class SoalCerita {
    public static void main(String[] args) {
        int umr = 0, gapok = 0, jumlahAnak = 0, tunjanganTransportasi = 500000,
                pilihanDomisili, pilihanJabatan, jumlahAnakDihitung;
        double tunjanganIstri = 0, tunjanganAnak = 0;
        String[] sebDomisil = {"Medan", "Yogyakarta", "Bandung", "Jakarta", "Semarang", "Aceh"},
                sebJabatan = {"Manajer", "Asisten Manajer", "Programmer", "System Analis", "Project Manajer", "Staff"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        String nama = sc.next();

        System.out.println("Pilih Domisil : ");
        do {
            System.out.println(""" 
                    [1] Medan
                    [2] Yogyakarta
                    [3] Bandung
                    [4] Jakarta
                    [5] Semarang
                    [6] Aceh""");
            pilihanDomisili = sc.nextInt();
            switch (pilihanDomisili) {
                case 1 -> umr = 2500000;
                case 2 -> umr = 1800000;
                case 3 -> umr = 2900000;
                case 4 -> umr = 4210000;
                case 5 -> umr = 3500000;
                case 6 -> umr = 2100000;
                default -> System.out.println("Pilih yang benar !!");
            }
        } while (umr == 0);

        System.out.println("Pilih Jabatan : ");
        do {
            System.out.println(""" 
                    [1] Manajer
                    [2] Asisten Manajer
                    [3] Programmer
                    [4] System Analis
                    [5] Project Manajer
                    [6] Staff""");
            pilihanJabatan = sc.nextInt();
            switch (pilihanJabatan) {
                case 1 -> gapok = 3 * umr;
                case 2 -> gapok = (int) (2.5 * umr);
                case 3 -> gapok = 2 * umr;
                case 4 -> gapok = (int) (2.7 * umr);
                case 5 -> gapok = (int) (1.8 * umr);
                case 6 -> gapok = umr;
                default -> System.out.println("Pilih yang benar !!");
            }
        } while (gapok == 0);

        double asuransiKesehatan = 0.01 * gapok,
                pajakPenghasilan = 0.05 * gapok;

        System.out.print("""
                Status Pernikahan
                (Ketik y jika sudah menikah) :\s""");
        boolean isMarried = sc.next().equalsIgnoreCase("y");
        if (isMarried) {
            System.out.print("Jumlah Anak : ");
            jumlahAnak = sc.nextInt();
            jumlahAnakDihitung = Math.min(jumlahAnak, 5);
            tunjanganIstri = gapok * 0.075;
            tunjanganAnak = gapok * 0.03 * jumlahAnakDihitung;
            asuransiKesehatan = (gapok * 0.02) + (jumlahAnakDihitung * gapok * 0.005);
        }

        System.out.print("Masukan Jarak Rumah ke Kantor(km) : ");
        int jarak = sc.nextInt();
        if (jarak <= 10) {
            tunjanganTransportasi = 200000;
        } else if (jarak <= 20) {
            tunjanganTransportasi = 250000;
        } else if (jarak <= 50) {
            tunjanganTransportasi = 350000;
        }

        int pendapatanTambahan = tunjanganTransportasi + (int) (tunjanganIstri + tunjanganAnak),
                potonganWajib = (int) (pajakPenghasilan + asuransiKesehatan),
                totalGaji = gapok + pendapatanTambahan - potonganWajib;

        System.out.println("===========================================");
        System.out.println("Nama \t\t\t\t\t: " + nama);
        System.out.println("Domisil \t\t\t\t: " + sebDomisil[pilihanDomisili - 1]);
        System.out.println("Jabatan \t\t\t\t: " + sebJabatan[pilihanJabatan - 1]);
        System.out.println("Status Pernikahan \t\t: " + (isMarried ? "Menikah" : "Tidak Menikah"));
        System.out.println("Jumlah Anak \t\t\t: " + jumlahAnak);
        System.out.println("Jarak Rumah ke Kantor\t: " + jarak + " km");
        System.out.println("Pendapatan Tambahan \t: Rp. " + pendapatanTambahan);
        System.out.println("Potongan Wajib \t\t\t: Rp. " + potonganWajib);
        System.out.println("Gaji Pokok \t\t\t\t: Rp. " + gapok);
        System.out.println("Total Gaji \t\t\t\t: Rp. " + totalGaji);
        System.out.println("===========================================");
    }
}
