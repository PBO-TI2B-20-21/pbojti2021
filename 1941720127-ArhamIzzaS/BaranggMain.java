public class BaranggMain {

    public static void main(String[] args) {
        Barangg b1 = new Barangg();
        Barangg b2 = new Barangg();
        
        b1.kode = "22";
        b1.namaBarang = "buku";
        b1.hargaDasar = 3000;
        b1.diskon = 5;
        b1.tampilData();
        
        b2.kode = "33";
        b2.namaBarang = "Gelas";
        b2.hargaDasar = 5000;
        b2.diskon = 10;
        b2.tampilData();
    }
}
