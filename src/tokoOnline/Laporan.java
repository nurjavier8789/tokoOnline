    package tokoOnline;

public class Laporan {
    public void laporan(Barang brg){
        int x = brg.getJmlBarang();
        
        System.out.println("\nTabel Barang\n\nID \tNama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+brg.getNamaBarang(i) + "\t" + brg.getStok(i)+ "\t" + brg.getHarga(i));
        }
    }

    public void laporan(Member mbr){
        int x = mbr.getJmlMember();
        
        System.out.println("\nTabel Member\n\nID \tNama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+mbr.getNama(i) + "\t" + mbr.getAlamat(i)+ "\t\t" +mbr.getTelepon(i)+ "\t" + mbr.getSaldo(i));
        }
    }

    public void laporan (Transaksi tran, Barang brg) {
        int x = tran.getJmlTransaksi();
        
        System.out.println("\nLaporan Transaksi\n\nNama Barang \tQty \tHarga \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = tran.getBanyaknya(i)*brg.getHarga(tran.getIdBarang(i));
            total += jumlah;
            System.out.println(brg.getNamaBarang(tran.getIdBarang(i)) + "\t" + tran.getBanyaknya(i)+ "\t" + brg.getHarga(tran.getIdBarang(i)) + "\t" + jumlah);
        }
        System.out.println("Total Omset = "+total);
    }
}
