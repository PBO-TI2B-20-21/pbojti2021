/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class TestBarang {
    public static void main(String args[]){
        Barang brgl=new Barang ();
        brgl.namaBrg="pensil";
        brgl.jenisBrg="ATK";
        brgl.stok=10;
        brgl.tampilbarang();
        //menampilkan dan mengisi argumen untuk menambahkan stok barang 
        
        System.out.println("stock baru adalah " + brgl.tambahstok(20));
        
        
    }
}
