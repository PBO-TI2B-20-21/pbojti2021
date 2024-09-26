package jobsheet2;
public class BarangMain {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();
        
        b1.kode = "301";
        b1.namaBarang = "Sepeda Dynamite";
        b1.hargaDasar = 2000000;
        b1.diskon = 50;
        b1.tampilData();
        
        b2.kode = "302";
        b2.namaBarang = "Realme PRO 6";
        b2.hargaDasar = 1800000;
        b2.diskon = 25;
        b2.tampilData();
    }
}
