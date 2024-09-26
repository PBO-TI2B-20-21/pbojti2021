/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Personal
 */
public class PeminjamanTest {

    public static void main(String[] args) {
        Peminjaman pjm1 = new Peminjaman();

        pjm1.id = 01;
        pjm1.namaMember = "Yunus";
        pjm1.namaGame = "One Punch Man";
        pjm1.harga = 10000;
        pjm1.tampilData();
     //Argumen lama peminjaman
        System.out.println("Lama Pinjam = 3 Hari");
        System.out.println("Total Harga " + pjm1.lamaPinjam(3));
    }
}
