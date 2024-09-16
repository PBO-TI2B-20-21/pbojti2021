/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaPinjam;
    public int hargaTotal;
    
    public static int hargaTotal(int harga, int lamaPinjam){
        return (harga*lamaPinjam);
    }
    
    public void tampilData(){
        System.out.println("ID : "+id);
        System.out.println("Nama : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga : "+harga);
        System.out.println("Lama Sewa : "+lamaPinjam);
        System.out.println("Harga Total : "+hargaTotal);
    }
}
