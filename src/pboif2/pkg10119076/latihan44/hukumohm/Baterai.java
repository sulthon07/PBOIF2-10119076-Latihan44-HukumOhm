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
public class Baterai {
    private float kuatArus;

    private float hambatan;

    

    public Baterai(){

        System.out.println("=====Hukum Ohm=====");

        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"

                + " akan berbanding lurus dengan beda potensial"

                + " pada ujun-ujung kawat penghantar tersebut "

                + "asalkan suhu kawat dijaga konstan.");

    }

    

    public Baterai(float kuatArus, float hambatan){

        this.kuatArus = kuatArus;

        this.hambatan = hambatan;

    }



    public float getKuatArus() {

        return kuatArus;

    }



    public float getHambatan() {

        return hambatan;

    }

    

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }

        
}
