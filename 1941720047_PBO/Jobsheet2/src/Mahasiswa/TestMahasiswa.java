/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author ASUS
 */
public class TestMahasiswa {
    public static void main(String[]args){
        Mahasiswa mhs1 = new Mahasiswa ();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jln.Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println("-------------------------------------------");
        Mahasiswa mhs2= new Mahasiswa();
        mhs2.nim=102;
        mhs2.nama="Jefri";
        mhs2.alamat="Jln Pucangro";
        mhs2.kelas="1B";
        mhs2.tampilBiodata();
        System.out.println("---------------------------------------------");
        Mahasiswa mhs3= new Mahasiswa();
        mhs3.nim=103;
        mhs3.nama="Ella";
        mhs3.alamat="Jln Sumberjo";
        mhs3.kelas="1C";
        mhs3.tampilBiodata();
    }
    
}
