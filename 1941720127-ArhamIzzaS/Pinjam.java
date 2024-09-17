public class Pinjam {
    
    public int id;
    public String nama;
    public String member;
    public String namagame;
    public int harga;
    public int total;

    public int lamasewa(int sewa) {
        total=sewa*harga;
        return total;
    }
    public void cekHarga(){
        System.out.println("id= " + id);
        System.out.println("nama= " + member);
        System.out.println("namagame= " + namagame);
        System.out.println("harga= " + harga);
        System.out.println("Jadi totalnya= " + total);
    }
}
