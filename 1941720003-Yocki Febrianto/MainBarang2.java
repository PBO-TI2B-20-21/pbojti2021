public class MainBarang2 {
    public static void main(String[] args) {
        Barang brg2 = new Barang();

        brg2.kode = "A1";
        brg2.namaBarang = "Palu";
        brg2.hargaDasar = 50000;
        brg2.diskon = (25/100);

        brg2.tampilData();
    }
}
