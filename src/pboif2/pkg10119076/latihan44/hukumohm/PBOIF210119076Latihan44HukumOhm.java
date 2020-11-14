/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan44.hukumohm;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi :hukum ohm
 */
public class PBOIF210119076Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Baterai objBaterai = new Baterai();

        

        Baterai objBaterai1 = new Baterai(3, 12);

        System.out.println("Kuat Arus : "+objBaterai1.getKuatArus());

        System.out.println("Hambatan : "+objBaterai1.getHambatan());

        System.out.println("Hasil tegangan : "+objBaterai1.hitungTegangan());

        

    }

    

}
    
    

