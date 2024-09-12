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
public class TestTugasBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TugasBarang tb = new TugasBarang();

        tb.kode = "48b12z";
        tb.namaBarang = "Sepatu";
        tb.hargaDasar = 250000;
        tb.diskon = 15;
        tb.tampilData();
    }

}
