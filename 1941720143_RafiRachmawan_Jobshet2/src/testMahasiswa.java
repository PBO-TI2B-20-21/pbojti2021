/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi Rachmawan
 */
public class testMahasiswa {
    
	public static void main (String args[]){
	Mahasiswa mhs1=new Mahasiswa ();
	mhs1.nim=101;
	mhs1.nama="Lestari";
	mhs1.alamat="jl.vinolia no 1A";
	mhs1.kelas="1A";
	mhs1.tampilBiodata ();
        
        dosen dsn1=new dosen ();
        dsn1.nama="dwi";
	dsn1.alamat="jl.bunga sepatu";
	dsn1.matkul="Daspro";
        dsn1.tampilBiodata1();
        
        wali wl=new wali ();
        wl.nama="yeni";
	wl.alamat="jl.soekarno hatta";
	wl.umur="Daspro";
        wl.tampilBiodata2 ();
        
        
	}
}

