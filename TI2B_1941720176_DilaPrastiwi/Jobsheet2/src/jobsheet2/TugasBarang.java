/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author WINDOWS 10
 */
public class TugasBarang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    public double hargaJual;

    public double hitungHargaJual() {
        hargaJual = hargaDasar - ((diskon/100) * hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode\t\t : " + kode);
        System.out.println("Nama Barang\t : " + namaBarang);
        System.out.println("Harga Dasar\t : Rp" + hargaDasar);
        System.out.println("Diskon\t\t : " + diskon+"%");
        System.out.println("Harga Jual\t : " + hitungHargaJual());
    }
}
