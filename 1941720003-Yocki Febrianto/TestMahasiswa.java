public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Sekolah skl = new Sekolah();
        Kampus kmp = new Kampus();

        mhs.nim = 101;
        mhs.nama = "Lestari";
        mhs.alamat = "Jl. Vinolia No 1A";
        mhs.kelas = "1A";
        mhs.tampilBiodata();

        skl.namaSekolah = "Smk 1 Malang";
        skl.alamatSekolah = "Kota Malang";
        skl.tampilBiodata();

        kmp.namaKampus = "Polinema";
        kmp.jurusan = "Teknologi Informasi";
        kmp.prodi = "D4";
        kmp.tampil();
    }
}
