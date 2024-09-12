/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void tampilBiodata() {
        System.out.println("Nim  : " + nim);
        System.out.println("Nam  : " + nama);
        System.out.println("Alamat : " + alamat);
    }
}
