package tokoOnline;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Karyawan implements User {

    uh hmm = new uh();
    Scanner i = new Scanner(System.in);

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("anjayani");
        this.alamat.add("Mars");
        this.jabatan.add(0);
        this.telepon.add("08123456789");

        this.namaKaryawan.add("budi");
        this.alamat.add("Jupiter");
        this.jabatan.add(0);
        this.telepon.add("08515468767");
    }

    public void runKaryaran(Barang brg, Member mbr, Transaksi tran) {
        Laporan lap = new Laporan();
        System.out.print("Masukkan ID Anda > ");
        int id = i.nextInt();
        try {
            hmm.bot();
        } catch (AWTException | InterruptedException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("Selamat datang " + getNama(id) + "!\nMenu\n1. Barang\n2. Member\n3. Transaksi\n> ");
        int cek = i.nextInt();

        switch (cek) {
            case 1:
                System.out.print("\nBarang\n1. Cek Barang\n2. Edit Barang\n3. Tambah Barang\n> ");
                int barpil = i.nextInt();
                switch (barpil) {
                    case 1:
                        lap.laporan(brg);
                        break;
                    case 2:
                        brg.editBarang(); 
                        break;
                    case 3:
                        brg.addBarang();
                        break;
                    default:
                        System.out.println("Tidak ada dipilihan :(");
                        break;
                }
                break;
            case 2:
                lap.laporan(mbr);
                break;
            case 3:
                lap.laporan(tran, brg);
                break;
            case 4:
                brg.addBarang();
                break;
            default:
                System.out.println("Tidak ada dipilihan :(");
                break;
        }
    }

    public void setJabatan(int jabat) {
        this.jabatan.add(jabat);
    }

    public int getJabatan(int jabat) {
        return this.jabatan.get(jabat);
    }

    public int getJmlKaryawan() {
        return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int nama) {
        return this.namaKaryawan.get(nama);
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getTelepon(int telepon) {
        return this.telepon.get(telepon);
    }
}
