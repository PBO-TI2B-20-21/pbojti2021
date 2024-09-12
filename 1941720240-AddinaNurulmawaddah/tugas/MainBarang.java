package tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "111";
        brg.namaBarang = "Sepatu";
        brg.hargaDasar =350000;
        brg.diskon = (float) 15;
        brg.tampilData();
        // menampilkan dan mengisi argumen untuk menambahkan dtok barang
        System.out.println("Harga Jual :"+brg.hitungHargaJual());
    }

}
