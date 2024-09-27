/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
/**
 * BimaGL_1941720153
 */
public class Barang2 {
    public String kode;
    public String namabarang;
    public int hargadasar;
    public float diskon;
        public int disc(){
            int disc;
            disc = (int)(diskon*100);
            return disc;
        }
        public int hitungHargaJual(){
            int hargajual;
            hargajual = (int)(hargadasar-(diskon * hargadasar));
            return hargajual;
        }
        public void tampilData(){
            System.out.println("Kode        : "+kode);
            System.out.println("Nama Barang : "+namabarang);
            System.out.println("Harga Dasar : "+hargadasar);
            System.out.println("Diskon      : "+disc()+"%");
            System.out.println("Harga Jual  : "+hitungHargaJual());
        }
}
