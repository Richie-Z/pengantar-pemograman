package soal_cerita_nov23;

import java.util.Scanner;

/*
Nama : Immanuel Richie De Harjo Zakaria
NIM : 2142101927
 */
public class Answer {
    public static void answer() {
        Scanner sc = new Scanner(System.in);
        int umr, jumAnak = 0, gajiPokok, tunjanganIstri = 0, tunjanganAnak = 0,
                asuransiKesehatan, tunjanganTransportasi, pajakPenghasilan, domisil, jabatan;
        String[] sebDomisil = {"Yogyakarta", "Jakarta", "Semarang"},
                sebJabatan = {"Direktur Cabang", "Manager", "Staff"};
        System.out.print("Masukan Nama : ");
        String nama = sc.nextLine();
        System.out.println("Pilih Domisil : ");
        umr:
        while (true) {
            System.out.println("[1] Yogyakarta");
            System.out.println("[2] Jakarta");
            System.out.println("[3] Semarang");
            domisil = sc.nextInt();
            switch (domisil) {
                case 1:
                    umr = 2000000;
                    break umr;
                case 2:
                    umr = 4000000;
                    break umr;
                case 3:
                    umr = 3000000;
                    break umr;
                default:
                    System.out.println("Pilih yang benar!!");
                    break;
            }
        }
        System.out.println("Pilih Jabatan : ");
        gapok:
        while (true) {
            System.out.println("[1] Direktur Cabang");
            System.out.println("[2] Manager");
            System.out.println("[3] Staff");
            jabatan = sc.nextInt();
            switch (jabatan) {
                case 1:
                    gajiPokok = 3 * umr;
                    break gapok;
                case 2:
                    gajiPokok = 2 * umr;
                    break gapok;
                case 3:
                    gajiPokok = (int) (1.5 * umr);
                    break gapok;
                default:
                    System.out.println("Pilih yang benar!!");
                    break;
            }
        }
        System.out.print("""
                Status Pernikahan
                (Ketik y jika sudah menikah) :\s""");
        boolean isMarried = sc.next().equalsIgnoreCase("y");
        asuransiKesehatan = gajiPokok * 2 / 100;
        if (isMarried) {
            System.out.print("Jumlah Anak : ");
            jumAnak = sc.nextInt();
            int jumAnakDitihung = Math.min(jumAnak, 5);
            tunjanganIstri = gajiPokok * 10 / 100;
            tunjanganAnak = gajiPokok * 5 / 100 * jumAnakDitihung;
            asuransiKesehatan = gajiPokok * 3 / 100 + gajiPokok / 100 * jumAnakDitihung;
        }
        tunjanganTransportasi = gajiPokok * 2 / 100;
        pajakPenghasilan = gajiPokok * 7 / 100;

        int pendapatanTambahan = tunjanganIstri + tunjanganAnak + tunjanganTransportasi;
        int potonganWajib = asuransiKesehatan + pajakPenghasilan;
        int totalGaji = gajiPokok + pendapatanTambahan - potonganWajib;
        System.out.println("===========================================");
        System.out.println("Nama \t\t\t\t: " + nama);
        System.out.println("Domisil \t\t\t: " + sebDomisil[domisil - 1]);
        System.out.println("Jabatan \t\t\t: " + sebJabatan[jabatan - 1]);
        System.out.println("Status Pernikahan \t: " + (isMarried ? "Menikah" : "Tidak Menikah"));
        System.out.println("Jumlah Anak \t\t: " + jumAnak);
        System.out.println("Pendapatan Tambahan : Rp. " + pendapatanTambahan);
        System.out.println("Potongan Wajib \t\t: Rp. " + potonganWajib);
        System.out.println("Gaji Pokok \t\t\t: Rp. " + gajiPokok);
        System.out.println("Total Gaji \t\t\t: Rp. " + totalGaji);
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        Answer.answer();
    }
}
