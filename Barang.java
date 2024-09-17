
/**
 *
 * @author mshaf
 */
public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    public float hitungHargaJual(){
    float hargaJual = hargaDasar - (hargaDasar*diskon/100);
    return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("kode barang = "+ kode);
        System.out.println("nama barang = "+ namaBarang);
        System.out.println("harga dasar = " + hargaDasar);
        System.out.println("diskon = "+diskon + "%");
        System.out.println("harga jual dari barang adalah = Rp." + hitungHargaJual());
    }
    public static void main(String[] args) {
        Barang br1 = new Barang();
        br1.kode="K001";
        br1.namaBarang="sunsilk";
        br1.hargaDasar=5000;
        br1.diskon=50;
        br1.tampilData();
    }
}
