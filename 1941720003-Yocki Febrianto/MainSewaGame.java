public class MainSewaGame {
    public static void main(String[] args) {
        SewaGame sg = new SewaGame();

        sg.id = 123;
        sg.namaMember = "Febri";
        sg.namaGame = "Valorant";
        sg.harga = 10000;
        sg.tampil();
        System.out.println("Harga Yang Harus Dibayar\t: " + sg.hargaBayar(5));
    }
}
