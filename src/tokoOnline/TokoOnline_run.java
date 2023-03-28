package tokoOnline;

import java.awt.AWTException;
import java.util.Scanner;

public class TokoOnline_run {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Laporan lapor = new Laporan();
        Transaksi transaksi = new Transaksi();
        Barang barang = new Barang();
        uh hmm = new uh();
        Scanner i = new Scanner(System.in);

        System.out.println("Selamat datang di Toko Online!! (Beta 0.1)");
        System.out.print("Masuk Sebagai? (\"P\"egawai/\"M\"ember)\n> ");
        String masuk = i.next();

        if (masuk.equalsIgnoreCase("p") || masuk.equalsIgnoreCase("pegawai")) {
            try {
                karyawan.runKaryaran(barang, member, transaksi);
            } catch (Exception a) {
                System.out.println("\nMaaf angka yang anda masukkan tidak benar...\nAtau mungkin anda salah memasukkan....\nATAU... pilihan anda tidak ada diopsi");
                System.exit(0);
            }
        } else if (masuk.equalsIgnoreCase("m") || masuk.equalsIgnoreCase("member")) {
            System.out.println("Selamat datang ditoko Online!!");
            try {
                transaksi.prosesTransaksi(member, transaksi, barang);
            } catch (Exception a) {
                System.out.println("\nMaaf angka yang anda masukkan tidak benar...\nAtau mungkin anda salah memasukkan....\nATAU... pilihan anda tidak ada diopsi");
                System.exit(0);
            }
        } else {
            System.out.println("Maaf tidak ada pilihan itu >_<\nPlease rerun again...");
            System.exit(0);
        }

//        System.out.print("\n\nlogout? (ya/tidak) ");
//        String log = i.next();
//
//        if (log.equalsIgnoreCase("y") || log.equalsIgnoreCase("ya")) {
//            hmm.bot();
//            System.out.println("Logout berhasil!\nSee next time o/");
//            System.exit(0);
//        } else if (log.equalsIgnoreCase("t") || log.equalsIgnoreCase("tidak")) {
//            hmm.bot();
//            System.out.println("Otomatis Logout...");
//            System.exit(0);
//        }
    }
}
