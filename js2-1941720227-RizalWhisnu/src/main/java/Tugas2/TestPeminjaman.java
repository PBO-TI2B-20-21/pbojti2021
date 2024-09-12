/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author hp
 */
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = 10;
        p.namaMember = "Rizal Whisnu";
        p.namaGame = "Mobile Legend";
        p.harga = 5000;
        p.durasi = 2;
        p.tampilData();
        System.out.println("	");
        Peminjaman pm = new Peminjaman();
        pm.id = 15;
        pm.namaMember = "Hanin Dhiya";
        pm.namaGame = "PUBG";
        pm.harga = 7000;
        pm.durasi = 3;
        pm.tampilData();
    }
}
