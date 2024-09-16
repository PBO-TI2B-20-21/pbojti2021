package Tugas;

/**
 *
 * @author Aulafz
 */
public class MainBarang {

    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "A001";
        brg1.namaBarang = "Mini Ransel";
        brg1.hargaDasar = 45000;
        brg1.diskon = 10;
        brg1.hitungHargaJual();
        brg1.tampilData();
    }
}
