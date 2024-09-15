/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

/**
 *
 * @author ASUS
 */
public class TestBarang2 {

    public static void main(String[] args) {
        Barang2 brg = new Barang2 ();
        brg.kode = "Kosmetik";
        brg.namaBarang = "Foundation";
        brg.hargaDasar = 150000;
        brg.diskon = 0.50f;
        brg.tampildata();
    }
}
