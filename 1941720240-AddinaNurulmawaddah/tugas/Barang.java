package tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public void tampilData(){
        System.out.println("Kode            :"+kode);
        System.out.println("Nama Barang     :"+namaBarang);
        System.out.println("Harga Barang    : Rp."+hargaDasar);
        System.out.println("Diskon          :"+diskon+"%");
    }
    public int hitungHargaJual(){
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar)/100) ;
        return hargaJual;
    }

}
