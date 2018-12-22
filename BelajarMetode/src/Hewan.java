/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class Hewan {
    
//    inisasi dengan nilai
    double tinggi =30;
    double berat = 3;
    
//    inisasi dengan kontrukstor
    int umur;
    
//    konstruktor dengan parameter

    public Hewan(int umur) {
    this.umur = umur;
    
    }
    
    void lari(){
        System.out.println("berlari");
    }
    void makan(){
        System.out.println("makan dengan mulut");
    }
    void jalan(){
        System.out.println("berjalan");
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }
    
}
