public class Barang3 {

    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;
    private int HitungHargaJual;

    public void setKode(String nilaiKode) {
        kode = nilaiKode;
    }

    public void setNamaBarang(String nilaiNamaBarang) {
        namaBarang = nilaiNamaBarang;
    }

    public int setHargaDasar(int nilaiHargaDasar) {
        hargaDasar = nilaiHargaDasar;
        return hargaDasar;
    }

    public float setDiskon(float nilaiDiskon) {
        diskon = nilaiDiskon;
        return diskon;
    }

    public int HitungHargaJual() {
        HitungHargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return HitungHargaJual;
    }

    public void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp" + hargaDasar);
        System.out.println("Diskon: " + diskon * 100 + "%");

    }
}
