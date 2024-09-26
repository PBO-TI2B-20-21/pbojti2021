package jobsheet2;
public class Pinjam {
    public int id;
    public int harga;
    public String namaGame;
    public String namaMember;
   
    public void sewa(int lamaSewa){
        harga = harga*lamaSewa;
        System.out.println("Lama Sewa   : "+lamaSewa);
        System.out.println("Sewa        : "+harga);
    }
    public void tampilBiodata(){
        System.out.println("Id          : "+id);
        System.out.println("Nama        : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga       : "+harga);
    }
    
}
