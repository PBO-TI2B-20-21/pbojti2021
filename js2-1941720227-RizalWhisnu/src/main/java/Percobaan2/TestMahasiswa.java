/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author hp
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jln. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println("----------------------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nim = 102;
        mhs1.nama = "Rizal";
        mhs1.alamat = "Jln. Mastrip No 5A";
        mhs1.kelas = "2B";
        mhs1.tampilBiodata();
        System.out.println("----------------------------------");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 103;
        mhs1.nama = "Whisnu";
        mhs1.alamat = "Jln. Pahlawan No 5B";
        mhs1.kelas = "2B";
        mhs1.tampilBiodata();
    }
}