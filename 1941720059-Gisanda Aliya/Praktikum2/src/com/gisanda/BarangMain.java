package com.gisanda;

public class BarangMain {
    public static void main(String[] args){
        Barang1 brg = new Barang1();

        brg.kode="213";
        brg.namaBarang="Jeans";
        brg.hargaDasar=250000;
        brg.diskon=0.3f;
        brg.hitungHargaJual(250000, 0.3f);
        brg.tampilData();
    }
}