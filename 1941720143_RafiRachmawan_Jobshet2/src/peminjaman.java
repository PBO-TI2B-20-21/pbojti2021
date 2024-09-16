/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class peminjaman {
// 
    public static void main(String args []){
         daftargame dftr=new daftargame ();
        dftr.nama_member="eko";
        dftr.nama_game="residen evi";
        dftr.lama_sewa=1;
        dftr.tampilhasilpinjam();
        
        System.out.println("tampil harga :" + dftr.tampilharga(10));
    }
    
}
