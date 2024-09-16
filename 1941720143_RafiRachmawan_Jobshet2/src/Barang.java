/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilbarang(){
        System.out.println("nama barang     : " + namaBrg);
        System.out.println("jenis barang    : " + jenisBrg);
        System.out.println("stok            : " + stok);
        
    }
    //method dengan argumen dan nilai balik (return)
    public int  tambahstok(int brgMasuk){
        int stockbaru = brgMasuk+stok;
        return stockbaru;
    }
    
}
