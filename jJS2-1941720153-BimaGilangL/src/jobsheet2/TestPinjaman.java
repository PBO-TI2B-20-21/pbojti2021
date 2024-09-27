/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;
/**
 * BimaGL_1941720153
 */
public class TestPinjaman {
    public static void main(String []args){
        Peminjaman pjm1 = new Peminjaman();
            pjm1.id = 31;
            pjm1.namamember = "BimaGilang";
            pjm1.namagame = "GTA V INDOPRIDE";
            pjm1.harga= 450000;
            pjm1.lamasewa = 7;
            pjm1.tampilData();
    }
}
