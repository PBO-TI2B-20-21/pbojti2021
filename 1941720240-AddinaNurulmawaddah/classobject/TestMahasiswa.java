package classobject;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        
        mhs1.nim=110;
        mhs1.nama="Addina";
        mhs1.alamat="Jl Raya Santren No.17 ";
        mhs1.kelas="2B";
        mhs1.tampilBiodata();
        
        mhs1.nim=111;
        mhs1.nama="Nurul";
        mhs1.alamat="Jl. Kenangan 05";
        mhs1.kelas="2A";
        mhs1.tampilBiodata();
        
    }
}
