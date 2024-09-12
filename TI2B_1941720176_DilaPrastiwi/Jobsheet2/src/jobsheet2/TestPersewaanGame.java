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
public class TestPersewaanGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersewaanGame pg = new PersewaanGame();

        pg.id = 24365;
        pg.namaMember = "Zayn Malik";
        pg.namaGame = "Anggry Bird";
        pg.waktuPinjam = 6;
        pg.hargaSewa = 100000;
        pg.totalHarga();
        pg.data();
    }
}
