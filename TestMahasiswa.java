public class TestMahasiswa {
    public static void main(String args[]) {
        Mahasiswa mhs1=new Mahasiswa();
        Mahasiswa mhs2=new Mahasiswa();
        Mahasiswa mhs3=new Mahasiswa();
        mhs1.nim    =101;
        mhs1.nama   ="Lestari";
        mhs1.alamat ="JL.Vinolia No 1A";
        mhs1.kelas  ="1A";
        mhs1.tampilbiodata();
        System.out.println();
        mhs2.nim    =129;
        mhs2.nama   = " BAGIO ";
        mhs2.alamat = " JL. kecoa terbang NO 2b";
        mhs2.kelas  = "2B";
        mhs2.tampilbiodata();
        System.out.println();
        mhs3.nim    = 234;
        mhs3.nama   = " Andrew ";
        mhs3.alamat = " JL. Gajah Terbang NO 34";
        mhs3.kelas   = "2G";
        mhs3.tampilbiodata();

    }
}
