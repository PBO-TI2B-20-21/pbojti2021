public class Barangg {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    int hitungHargaJual() {
        int hargaDiskon = hargaDasar;
        diskon /= 100;
        hargaDiskon *= diskon;
        return hargaDasar - hargaDiskon;
    }
    
    void tampilData() {
        System.out.println("Data Barang");
        System.out.println("--------------------------------------");
        System.out.println("Kode Barang \t: " + kode);
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Harga Dasar \t: Rp " + hargaDasar);
        System.out.println("Diskon \t\t: " + diskon + "%");
        System.out.println("Harga Jual \t: Rp " + hitungHargaJual());
        System.out.println("--------------------------------------");
    }
}
