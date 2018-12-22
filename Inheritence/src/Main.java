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
        Hewan hewan = new Hewan();
        System.out.println("Apakah Hewan IS-A Object -> " + (hewan instanceof Object ));
        System.out.println("Apakah Hewan IS-A Hewan -> " + (hewan instanceof Hewan ));
        System.out.println("Apakah Hewan IS-A Kucing -> " + (hewan instanceof Kucing ));
        
        System.out.println("------------------------");
 
        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));
    
    }
    
}
