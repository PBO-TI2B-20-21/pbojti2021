/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peminjaman;

/**
 *
 * @author ASUS
 */
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = 23;
        p.namaMember = "Ella Amelia";
        p.namaGame = "PUBG";
        p.harga = 5000;
        p.durasi = 2;
        p.tampilData();
        System.out.println("--------------------");
        Peminjaman pm = new Peminjaman();
        pm.id = 10;
        pm.namaMember = "M Ridho";
        pm.namaGame = "Free Fire";
        pm.harga = 5000;
        pm.durasi = 4;
        pm.tampilData();
}
}
