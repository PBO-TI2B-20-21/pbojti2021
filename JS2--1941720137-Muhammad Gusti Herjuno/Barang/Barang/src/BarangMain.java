public class BarangMain {
    public static void main(String[] args) {
        Barang brg = new Barang();

        brg.kode = "334121";
        brg.namaBarang = "Jaket Angkatan";
        brg.hargaDasar = 100000;
        brg.diskon = 0.20f;
        brg.tampilData();
    }
}
