package com.company;

public class TestBarang1 {
    public static void main(String[] args) {
        Barang1 bg = new Barang1();
        bg.kode = "1111100000222";
        bg.namaBarang = "Grand Theft Auto V";
        bg.hargaDasar = 300000;
        bg.diskon = 0.15f;
        bg.tampilData();
    }
}
