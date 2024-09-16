/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class TestBarang2 {
    public static void main (String args []) {
        BARANG2 br1 = new BARANG2 ();
        
        br1.kode = "py1";
        br1.namabarang = "payung";
        br1.hargadasar = 10000;
        br1.diskon = 5;
        br1.tampildata() ;
    }
}
