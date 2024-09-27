/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 * BimaGl_1941720153
 */
public class TestMahasiswa {
    public static void main(String args[]){
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "JL. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
        mhs2.nim = 102;
        mhs2.nama = "Alamku";
        mhs2.alamat = "Jl.Nisaja no 2B";
        mhs2.kelas ="1A";
        mhs2.tampilBiodata();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        mhs3.nim = 103;
        mhs3.nama = "Negeriku";
        mhs3.alamat= "Jl. Nisaja Tapi Ga Mau no 3A";
        mhs3.kelas= "1A";
        mhs3.tampilBiodata();
    }
}
