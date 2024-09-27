package pbojs2;
public class sewaGame {
    String namamember,namagame;
    int harga,id,durasi,total;
    
    sewaGame(){
    }
    void sewaGame(int iD,String name, String game){
        id = iD;
        namamember = name;
        namagame = game;
    }
    void durasiSewa(int sewa){
        durasi=sewa;
    }
    void harga(int price){
        harga=price;
    }
    void tampil(){
        System.out.println("ID : "+id);
        System.out.println("Nama : "+namamember);
        System.out.println("Nama Game : "+namagame);
        System.out.println("Harga : "+harga);
        System.out.println("Lama sewa : "+durasi);
        System.out.println("Total Bayar : "+total);
    }
    int totalHarga(){
        total = durasi*harga;
        return total;
    }
    
   }



