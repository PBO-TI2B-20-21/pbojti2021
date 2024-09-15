package com.gisanda;

public class Sewa {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;
    public int totalBayar;

    public void hitungHargaSewa(int lamaSewa, int harga){

        totalBayar = lamaSewa*harga;
    }

    public void tampilData(){
        System.out.println("ID : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa : "+lamaSewa+" hari");
        System.out.println("Sewa harga per hari : "+"Rp. "+harga);
        System.out.println("Total Bayar : "+"Rp. "+totalBayar);

    }
}