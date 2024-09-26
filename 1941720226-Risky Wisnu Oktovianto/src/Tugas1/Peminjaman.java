/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Risky
 */
public class Peminjaman {

    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void tampilData() {
        System.out.println("========================");
        System.out.println("ID             : " + id);
        System.out.println("Nama Member    : " + namaMember);
        System.out.println("Nama Game      : " + namaGame);
        System.out.println("Harga/hari     : " + harga);
        System.out.println("========================");
    }

    //Method dengan argumen dan nilai balik (return)
    public int lamaPinjam(int ttlBayar) {
        int total = ttlBayar * harga;
        return total;
    }
}
