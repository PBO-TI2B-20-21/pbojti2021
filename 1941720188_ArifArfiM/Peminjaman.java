package com.company;

public class Peminjaman {
    public int id;
    public String nama;
    public String namaGame;
    public int harga;
    public int durasi;

    public int totalHarga() {
        int total;
        total = durasi * harga;
        return total;
    }

    public void tampilData() {
        System.out.println("Id        : "+id);
        System.out.println("Nama      : "+nama);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga     : "+harga);
        System.out.println("Durasi    : "+durasi);
        System.out.println("Total     : "+totalHarga());
    }
}
