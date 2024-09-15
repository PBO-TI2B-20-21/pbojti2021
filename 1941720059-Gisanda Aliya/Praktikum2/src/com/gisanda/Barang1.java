package com.gisanda;

public class Barang1 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;

    public void hitungHargaJual(int hargaDasar, float diskon){
        hargaJual = (int) (hargaDasar - (diskon*hargaDasar));
    }

    public void tampilData(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+"Rp. "+hargaDasar);
        System.out.println("Diskon : "+diskon);
        System.out.println("Harga Jual : "+"Rp. "+hargaJual);

    }
}