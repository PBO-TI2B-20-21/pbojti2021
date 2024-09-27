package pbojs2;
public class Barang {
    String kode,namabarang;
    int hargadasar,hargajual;
    float diskon;
    Barang(){
        
    }
    void Barang(String nb,String code,int hd,float dsk){
        namabarang=nb;
        kode=code;
        hargadasar=hd;
        diskon=dsk/100;
    }
    int hitungharga(){
        hargajual = (int) (hargadasar-(diskon*hargadasar));
        return hargajual;
    }
    void tampil(){
        System.out.println("Kode barang : "+kode);
        System.out.println("Nama Barang : "+namabarang);
        System.out.println("Harga : Rp"+hargadasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Harga Jual : "+hargajual);
    }
}
