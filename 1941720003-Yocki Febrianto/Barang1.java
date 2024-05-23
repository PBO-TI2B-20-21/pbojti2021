public class Barang1 {
    String kode, namabarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual(int harga){
        
        float hargaJual = (float)harga - (diskon * (float)harga);
        int totalHarga = (int)hargaJual;
        return totalHarga;
    }

    public void tampilData(){
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama Barang\t: " + namabarang);
        System.out.println("Harga Dasar\t: Rp " + hargaDasar);
        System.out.println("Diskon\t\t: " + ((int)(diskon * 100)) + "%");
        System.out.println("Harga Jual\t: Rp " + hitungHargaJual(hargaDasar));
    }
}
