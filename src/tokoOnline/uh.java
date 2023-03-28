package tokoOnline;

import java.awt.AWTException;
import java.awt.Robot;

public class uh {
    public void bot() throws AWTException, InterruptedException {
        Robot r = new Robot();
        r.keyPress(17);
        r.keyPress(76);
        r.keyRelease(17);
        r.keyRelease(76);
        Thread.sleep(500);
        
        //        uh nope = new uh();
        
//        System.out.print("Masuk sebagai?(\"P\"egawai/\"M\"ember)\n> ");
//        String ce = i.next();
//        nope.bot();
        
//        if (ce.equalsIgnoreCase("m")||ce.equalsIgnoreCase("member")) {
//            System.out.println("-= Selamat Datang di Toko Online =- (Beta Test 0.1)\nSilahkan cek barang kami :D\n-------------------------------");
//            for (int j = 0; j < barang.getJmlBarang(); j++) {
//                System.out.println((j+1)+". "+barang.getNamaBarang(j)+" | Stok: "+barang.getStok(j)+" -> Rp."+barang.getHarga(j));
//            }
//        } else if (ce.equalsIgnoreCase("p")||ce.equalsIgnoreCase("pegawai")) {
//            System.out.println("-= Selamat Datang di Toko Online =- (Beta Test 0.1) [Pegawai Mode]");
//        }
    }
}
