/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class Main {
    public static void main(String[] args) {
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();
        
        h.makan();
        k.makan();
        
        Object object = k;
        Hewan hewan = k;
        
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewan.makan();
        
        Kucing kucing = (Kucing)h;
        kucing.makan();
        
        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
    
}
