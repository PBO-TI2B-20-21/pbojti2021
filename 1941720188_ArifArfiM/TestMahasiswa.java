package com.company;

public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        Mahasiswa mhs2=new Mahasiswa();
        Mahasiswa mhs3=new Mahasiswa();
        mhs1.nim=1944591188;
        mhs1.nama="Arif Arfi Murdani";
        mhs1.alamat="Jl.Nin Aja Dulu No.30";
        mhs1.kelas="2B";
        mhs1.tampilBiodata();

        mhs2.nim=1941672192;
        mhs2.nama="ahmad power rangers";
        mhs2.alamat="Kapal Terbang di Angkasa";
        mhs2.kelas="2C";
        mhs2.tampilBiodata();

        mhs3.nim=1955709966;
        mhs3.nama="Satria Baja Hitam";
        mhs3.alamat="Berpindah  pindah tapi di jepang";
        mhs3.kelas="2D";
        mhs3.tampilBiodata();
    }
}
