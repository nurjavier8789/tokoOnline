package tokoOnline;

import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> stok = new ArrayList<Integer>();
    ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang () {
        this.namaBarang.add("Doritos Big");
        this.stok.add(10);
        this.harga.add(9000);
        
        this.namaBarang.add("Indomini");
        this.stok.add(20);
        this.harga.add(2000);
        
        this.namaBarang.add("Toblerone");
        this.stok.add(1);
        this.harga.add(6000);
    }
    
    public void addBarang(){
        Scanner i = new Scanner(System.in);
        
        System.out.println("Tambah Barang");
        System.out.print("\nMasukkan nama barang: ");
        String bar = i.next();
        setNamaBarang(bar);
        System.out.print("Berapa stok yang mau dimasukkan: ");
        int stonk = i.nextInt();
        setStok(stonk);
        System.out.print("Masukkan harga per 1 barangnya? ");
        int har = i.nextInt();
        setHarga(har);
        
        System.out.println("\nReview");
        int ban = getJmlBarang();
        System.out.println("\nTabel Barang\n\n| ID |\t| Nama Barang |\t| Stok |\t| Harga |");
        for (int j = 0; j < ban; j++) {
            System.out.println("| "+j+" |\t| "+getNamaBarang(j) + " |\t| " + getStok(j)+ " |\t\t| " + getHarga(j)+" |");
        }
    }
    
    public void editBarang() {
        Scanner i = new Scanner(System.in);
        
        System.out.println("Edit Barang");
        System.out.println("\nList yang tersedia");
        int ban = getJmlBarang();
        System.out.println("\nTabel Barang\n\n| ID |\t| Nama Barang |\t| Stok |\t| Harga |");
        for (int j = 0; j < ban; j++) {
            System.out.println("| "+j+" |\t| "+getNamaBarang(j) + " |\t| " + getStok(j)+ " |\t\t| " + getHarga(j)+" |");
        }
        
        System.out.print("\nMasukkan ID barang yang mau di edit > ");
        int idBar = i.nextInt();
        System.out.print("\nMasukkan nama barang baru > ");
        String namaEdit = i.next();
        System.out.print("\nMasukkan stok barang > ");
        int stokedit = i.nextInt();
        System.out.print("\nMasukkan harga barang baru > ");
        int hargaedit = i.nextInt();
        editNamaBarang(idBar, namaEdit);
        editStok(idBar, stokedit);
        editHarga(idBar, hargaedit);
        
        System.out.println("\nReview");
        System.out.println("\nTabel Barang\n\n| ID |\t| Nama Barang |\t| Stok |\t| Harga |");
        for (int j = 0; j < ban; j++) {
            System.out.println("| "+j+" |\t| "+getNamaBarang(j) + " |\t| " + getStok(j)+ " |\t\t| " + getHarga(j)+" |");
        }
    }

    public int getJmlBarang () {
        return this.namaBarang.size();
    }

    public void setNamaBarang (String barang) {
        this.namaBarang.add(barang);
    }

    public String getNamaBarang (int brg) {
        return this.namaBarang.get(brg);
    }
    
    public void editNamaBarang (int id, String nama) {
        this.namaBarang.set(id, nama);
    }

    public void setStok (int stok) {
        this.stok.add(stok);
    }

    public int getStok (int stk) {
        return this.stok.get(stk);
    }

    public void editStok (int a, int b) {
        this.stok.set(a, b);
    }

    public void setHarga (int a) {
        this.harga.add(a);
    }

    public int getHarga (int a) {
        return this.harga.get(a);
    }
    
    public void editHarga (int id, int harga) {
        this.harga.set(id, harga);
    }
}