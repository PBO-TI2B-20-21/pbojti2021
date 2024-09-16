/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
public class BarangMain {
    public static void main(String[] args) {
        Barang brg=new Barang();
        brg.kode="ABCD";
        brg.namaBarang="Kaos Supreme";
        brg.hargaDasar=200000;
        brg.diskon=0.25f;
        brg.tampilData();
    }
}
