package Tugas;
public class TestBarang1 {
    public static void main(String[] args) {
        Barang1 br = new Barang1();
        
        br.kode = "K24";
        br.namaBarang = "Chitato";
        br.hargaDasar = 10000;
        br.diskon = 0.1f;
        br.tampilData();
    }
}
