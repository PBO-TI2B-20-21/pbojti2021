/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author WINDOWS 10
 */
public class PersewaanGame {

    String namaMember, namaGame;
    int id, waktuPinjam, hargaSewa, total;

    void data() {
        System.out.println("ID\t\t\t : " + id);
        System.out.println("Nama Member\t\t : " + namaMember);
        System.out.println("Nama Game\t\t : " + namaGame);
        System.out.println("Harga Sewa Perhari\t : Rp." + hargaSewa);
        System.out.println("Waktu Peminjaman\t\t : " + waktuPinjam+" hari");
        System.out.println("Total yang harus dibayar : " + total);
    }

    void totalHarga() {
        total = waktuPinjam * hargaSewa;
    }
}
