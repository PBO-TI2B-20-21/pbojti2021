/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objek;

public class Mahasiswa {

    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    public String nomer_absen;
    public int anak_ke;

    public void tampilBiodata() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Kelas  : "+kelas);
        System.out.println("Nomer abse :" +nomer_absen);
        System.out.println("anak ke"+ anak_ke);
    }
}
