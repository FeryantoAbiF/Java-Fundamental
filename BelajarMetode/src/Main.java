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
        Hewan kucing = new Hewan(2);
        System.out.println("Umurnya Adalah : "+kucing.getUmur()+" Tahun");
        
        double bmi = kucing.getBerat()/((kucing.getTinggi()*0.01)*(kucing.getTinggi()*0.01));
        System.out.println("indeks massa tubuhnya adalah : "+bmi);
    }
    
}
