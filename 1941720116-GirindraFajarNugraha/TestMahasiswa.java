public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        
        mhs2.nim = 102;
        mhs2.nama = "Candra Kardina";
        mhs2.alamat = "Jl. Cinta No 18";
        mhs2.kelas = "2A";
        
        mhs3.nim = 103;
        mhs3.nama = "Kardina Candra";
        mhs3.alamat = "Jl. Liberia No 22";
        mhs3.kelas = "3A";
        
        mhs1.tampilBiodata();
        System.out.println();
        mhs2.tampilBiodata();
        System.out.println();
        mhs3.tampilBiodata();
    }
}
