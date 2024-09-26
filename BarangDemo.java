public class BarangDemo {
    
    public static void main(String[] args) {
        Barang3 bg = new Barang3();
   
        
        bg.setKode("BJHD");
        bg.setNamaBarang("Baju");
        bg.setHargaDasar(200000);
        bg.setDiskon(0.3f);
        bg.tampilData();
        //bg.tampilHarga();
        System.out.println("Harga Jual :" + bg.HitungHargaJual());
    }
}
