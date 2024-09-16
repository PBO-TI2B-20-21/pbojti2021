package com.company;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1=new Barang();
        brg1.namaBrg="ROG";
        brg1.jenisBrg="LAPTOP GAMING";
        brg1.stok=10;
        brg1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah " +brg1.tambahStok(20));
    }
}
