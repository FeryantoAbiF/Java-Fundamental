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
        
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");
       
        Elang.jumlahkakiHewan(2);
        Elang.beratHewan(5);
        Elang.cetakHewan();
        
        Kucing.beratHewan(10);
        Kucing.jumlahkakiHewan(4);
        Kucing.cetakHewan();
        
    }
    
}
