/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
public class TestPeminjaman {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Peminjaman pjm=new Peminjaman();
        pjm.id="Kaito Delax";
        pjm.namaMember="Ferguso";
        pjm.namaGame="COD : Warzone";
        pjm.harga=50000;
        pjm.lamaPinjam=7;
        pjm.hargaTotal=350000;
        pjm.tampilData();
    }
}
