public class MainBarang1 {
    public static void main(String[] args) {
        Barang1 brg1 = new Barang1();

        brg1.kode = "A1";
        brg1.namabarang = "Smartphone";
        brg1.hargaDasar = 500000;
        brg1.diskon = (25/100f);
        brg1.tampilData();
    }
}
