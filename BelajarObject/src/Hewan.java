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
   
    String nama;
    int berat; 
    int jumlahkaki;
    
// ini adalah onstruktor
    public Hewan(String namaHewan) {
     nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    
    public void jumlahkakiHewan(int jumlahkakiHewan){
        jumlahkaki = jumlahkakiHewan;
    }
    
    public void cetakHewan(){
        System.out.println("Nama Hewan : "+nama);
        System.out.println("Berat Hewan : " +berat+ " kg");
        System.out.println("Jumlah Kaki : "+jumlahkaki);
        System.out.println();
    }
    
    
}
