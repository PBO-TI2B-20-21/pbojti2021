/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zidan
 */
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int diskon(){
        int dsk;
        dsk=(int)(diskon*100);
        return dsk;
    }
    
    public int hitungHargaJual(){
        int hargaJual;
        hargaJual=(int)(hargaDasar-(diskon*hargaDasar));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga : "+hargaDasar);
        System.out.println("Diskon : "+diskon()+"%");
        System.out.println("Harga Total : "+hitungHargaJual());
    }
}
