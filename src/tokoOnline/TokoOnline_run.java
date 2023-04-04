package tokoOnline;

import java.awt.AWTException;
import java.util.Scanner;

public class TokoOnline_run {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Member member = new Member();
        Karyawan karyawan = new Karyawan();
        Transaksi transaksi = new Transaksi();
        Barang barang = new Barang();
        TokoOnline_run run = new TokoOnline_run();
        Scanner i = new Scanner(System.in);
        uh hmm = new uh();
        String masuk = "";
        
        System.out.println("Selamat datang di Toko Online!! (Beta 0.1)");
        System.out.print("Masuk Sebagai? (\"P\"egawai/\"M\"ember)\n> ");
        masuk = i.next();
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
            System.out.println("Maaf tidak ada pilihan itu >_<\nMenjalankan ulang program dalam 20 detik...");
            Thread.sleep(2000);
            hmm.bot();
            run.main(null);
        }
        
        run.ceklog();
    }

    public void ceklog() throws AWTException, InterruptedException {
        TokoOnline_run run = new TokoOnline_run();
        Scanner i = new Scanner(System.in);
        uh hmm = new uh();
        String log = "";
        System.out.print("\n\nkeluar dari program? (y/n) ");
        log = i.next();

        if (log.equalsIgnoreCase("y") || log.equalsIgnoreCase("yes")) {
            hmm.bot();
            System.out.println("See next time o/");
            System.exit(0);
        } else {
            System.out.println("Mengirim ke program awal...");
            Thread.sleep(2000);
            hmm.bot();
            run.main(null);
        }
    }
}
