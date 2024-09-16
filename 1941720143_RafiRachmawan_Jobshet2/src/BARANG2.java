/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class BARANG2 {
    public int hargadasar; 
    public float diskon ;
    public String kode, namabarang ;
    
    public void tampildata(){
        System.out.println("kode        :" + kode);
        System.out.println("nama barang :"  + namabarang);
        System.out.println("nama dasar  :" + "Rp" +hargadasar);
        System.out.println("diskon:" + diskon +"%" );
        System.out.println("harga jual :" +"Rp" +hitunghargajual());
    }
    public int hitunghargajual(){
        int hargajual = hargadasar - (int) ((diskon/100) * hargadasar );
        return hargajual ;
    }
}
