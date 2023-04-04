package tokoOnline;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaksi extends Barang {

    ArrayList<Integer> idMember = new ArrayList<Integer>();
    ArrayList<Integer> idBarang = new ArrayList<Integer>();
    ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Transaksi() {
//        this.idMember.add(0);
//        this.idBarang.add(0);
//        this.banyak.add(2);
//
//        this.idMember.add(0);
//        this.idBarang.add(1);
//        this.banyak.add(3);
//
//        this.idMember.add(1);
//        this.idBarang.add(0);
//        this.banyak.add(1);
//
//        this.idMember.add(1);
//        this.idBarang.add(2);
//        this.banyak.add(2);
    }

    public void setTransaksi(Barang brg, int idMember, int idBarang, int banyaknya) {
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya);
        brg.editStok(idBarang, brg.getStok(idBarang) - banyaknya);
    }

    public void prosesTransaksi(Member c, Transaksi b, Barang a) {
        Scanner i = new Scanner(System.in);
        uh hmm = new uh();

        String cek = "";
        int akeh,idMember;
        
        do {
            System.out.print("Masukkan ID Member > ");
            idMember = i.nextInt();
            
            if (idMember >= c.getJmlMember() && idMember >= 0) {
                System.out.println("Maaf ID Member tidak diketahui...\nSilahkan coba lagi");
            }
        } while (idMember >= c.getJmlMember() && idMember >= 0);

        try {
            hmm.bot();
        } catch (AWTException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Selamat datang " + c.getNama(idMember) + "\nSelamat belanja :D");
        System.out.println("\nSaldo anda saat ini: " + c.getSaldo(idMember));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int ii = 0;
        int temp = 0;

        int o = getJmlBarang();

        do {
            System.out.println("\n\nList Barang\n\nID \tNama Barang \tStok \tHarga");
            for (int j = 0; j < o; j++) {
                System.out.println(j + "\t" + getNamaBarang(j) + "\t" + getStok(j) + "\t" + getHarga(j));
            }

            System.out.print("\nMasukkan kode barang > ");
            temp = i.nextInt();
            idBarang.add(temp);

            if (getStok(temp) <= 0) {
                System.out.println("Maaf Stok Habis >_<");
                idBarang.remove(ii);
            } else {
                System.out.print(a.getNamaBarang(idBarang.get(ii)) + " sebanyak: ");
                akeh = i.nextInt();
                banyak.add(akeh);
                ii++;
                editStok(temp, getStok(temp) - akeh);
            }
            System.out.print("\nApakah mau nambah barang? (Y/N) ");
            cek = i.next();
        } while (cek.equalsIgnoreCase("Y"));

        System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Transaksi belanja " + c.getNama(idMember) + " sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * a.getHarga(idBarang.get(j));
            total += jumlah;
            System.out.println(a.getNamaBarang(idBarang.get(j)) + "\t" + banyak.get(j) + "\t" + a.getHarga(idBarang.get(j)) + "\t" + jumlah);
            b.setTransaksi(a, idMember, idBarang.get(j), banyak.get(j));
        }
        System.out.println("Total Belanja:\t\t\t" + total);
        c.editSaldo(idMember, c.getSaldo(idMember) - total);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Saldo anda saat ini: " + c.getSaldo(idMember));
    }

    public int getIdBarang(int barang) {
        return this.idBarang.get(barang);
    }

    public int getBanyaknya(int barng) {
        return this.banyak.get(barng);
    }

    public int getIdMember(int id) {
        return this.idMember.get(id);
    }

    public int getJmlTransaksi() {
        return this.idMember.size();
    }
}