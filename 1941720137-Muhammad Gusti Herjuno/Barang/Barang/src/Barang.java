public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

<<<<<<< HEAD
=======
    //hitung disk
>>>>>>> 7491599... 1941720137-Muhammad Gusti Herjuno
    public int diskon(){
        int disc;
        disc = (int)(diskon*100);
        return disc;
    }

    public int hitungHargaJual(){
        int hargaJual;
        hargaJual = (int)(hargaDasar-(diskon*hargaDasar));
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " +"Rp." +hargaDasar);
        System.out.println("Diskon      : " + diskon() + "%");
        System.out.println("Total harganya adalah " +"Rp." +hitungHargaJual());
    }
}
