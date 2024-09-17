
public class Peminjaman {
    public int id;
    public String nama_member;
    public String nama_game;
    public int lama_sewa;
    public int harga;
    
    public int total(){
        int total = this.harga*this.lama_sewa;
        return total;
    }
    public void cetakData(){
        System.out.println("id member = " + this.id);
        System.out.println("nama member = " + this.nama_member);
        System.out.println("nama game = " + this.nama_game);
        System.out.println("harga sewa perhari = " + this.harga );
        System.out.println("lama sewa = " + this.lama_sewa );
        
    }
    public static void main(String[] args) {
        Peminjaman pj1= new Peminjaman();
        pj1.id=1001;
        pj1.nama_member = "shafriza ladiyan";
        pj1.nama_game="mortal combat";
        pj1.harga=10000;
        pj1.lama_sewa=2;
        pj1.cetakData();
        System.out.println("total yang harus dibayar adalah "+pj1.total());
        
    }
}
