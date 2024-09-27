/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
/**
 * BimaGl_1941720153
 */
public class Peminjaman {
    public int id;
    public String namamember;
    public String namagame;
    public int harga;
    public int lamasewa;
        public int totalHarga(){
            int total;
            total = lamasewa*harga;
            return total;
        }
        public void tampilData(){
            System.out.println("Id         : "+id);
            System.out.println("Nama       : "+namamember);
            System.out.println("Nama Game  : "+namagame);
            System.out.println("Harga      : "+harga);
            System.out.println("Lama Sewa  : "+lamasewa);
            System.out.println("Total      : "+totalHarga());
        }
}
