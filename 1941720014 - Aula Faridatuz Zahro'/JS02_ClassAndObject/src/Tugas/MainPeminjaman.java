package Tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class MainPeminjaman {

    public static void main(String[] args) {
        Peminjaman pnjm1 = new Peminjaman();
        Scanner aula = new Scanner(System.in);
        int pilih, lamaSewa;
        pnjm1.id = "1941720014";
        pnjm1.namaMember = "Aula Farida";
        pnjm1.namaGame = "PlantsVsZombie";
        pnjm1.harga = 10000;
        System.out.println("1. Tampil Data");
        System.out.println("2. Cek Bayar");
        System.out.print("Masukkan pilihan anda : ");
        pilih = aula.nextInt();
        switch (pilih) {
            case 1:
                pnjm1.tampilData();
                break;
            case 2:
                System.out.print("Masukkan lama sewa : ");
                lamaSewa = aula.nextInt();
                System.out.println("Yang harus anda bayar adalah : " +  pnjm1.bayar(lamaSewa));
                break;
            default:
                System.out.println("Pilihan anda tidak ditemukan.");
        }

    }
}
