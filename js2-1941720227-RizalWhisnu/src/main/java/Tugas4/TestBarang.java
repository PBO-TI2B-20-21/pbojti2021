/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author hp
 */
public class TestBarang {

    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "Mebel";
        brg.namaBarang = "Meja";
        brg.hargaDasar = 500000;
        brg.diskon = 0.50f;
        brg.tampildata();
    }
}