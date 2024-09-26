public class Persewaan {
    private String id;
    private String namaMember;
    private String namaGame;
    private int harga;
    
    
    public void setId(String nilaiId){
        id = nilaiId;
    }
    public void setNamaMember(String nilaiNamaMember){
        namaMember = nilaiNamaMember;
    }
    public void setNamaGame(String nilaiNamaGame){
        namaGame = nilaiNamaGame;
    }
    public int setHarga(int nilaiHarga, int lamaSewa){
        harga = nilaiHarga * lamaSewa;
        return harga;
    }
    
    public void tampilData(){
        System.out.println("ID: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        
    }
    public void tampilHarga(){
        System.out.println("Harga: " + harga);
    }
}
