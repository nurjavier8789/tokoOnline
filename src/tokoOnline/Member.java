package tokoOnline;
import java.util.ArrayList;

public class Member implements User{
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    

    public Member() {
        this.namaMember.add("Asep");
        this.alamat.add("Mars");
        this.saldo.add(100000);
        this.telp.add("08123456789");
        
        this.namaMember.add("Mamat");
        this.alamat.add("Jupiter");
        this.saldo.add(200000);
        this.telp.add("08515468767");
    }

    public void setSaldo (int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo (int ndo) {
        return this.saldo.get(ndo);
    }

    public void editSaldo (int saldo1, int saldo2) {
        this.saldo.set(saldo1, saldo2);
    }

    public int getJmlMember () {
        return this.saldo.size();
    }

    @Override
    public void setNama (String nama) {
        this.namaMember.add(nama);
    }

    @Override
    public void setAlamat (String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon (String telp) {
        this.telp.add(telp);
    }

    @Override
    public String getNama (int namaArr) {
        return this.namaMember.get(namaArr);
    }

    @Override
    public String getAlamat (int alamatarr) {
        return this.alamat.get(alamatarr);
    }

    @Override
    public String getTelepon (int telp) {
        return this.telp.get(telp);
    }
}