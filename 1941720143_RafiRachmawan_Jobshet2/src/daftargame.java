/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class daftargame {
    public int id;
    public String nama_member;
    public String nama_game;
    public int harga ;
    public int lama_sewa ;
    String nim;
    
    public void tampilhasilpinjam(){
        System.out.println("nama member     : " + nama_member);
        System.out.println("nama game       : " + nama_game);
        System.out.println("lama sewa       : " + lama_sewa);
        
    }
   
    public int  tampilharga(int hasil){
         hasil = lama_sewa+harga;
        return hasil;
    }
    
}
