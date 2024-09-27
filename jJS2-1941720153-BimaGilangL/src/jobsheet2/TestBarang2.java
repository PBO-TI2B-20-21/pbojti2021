/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
/**
 * BimaGL_1941720153
 */
public class TestBarang2 {
    public static void main (String[] args){
        Barang2 brg = new Barang2();
        brg.kode = "555";
        brg.namabarang = "VIVA 250 Watt";
        brg.hargadasar = 600000;
        brg.diskon = 0.15f;
        brg.tampilData();
    }
}
