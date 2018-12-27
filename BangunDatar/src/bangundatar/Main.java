/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author Feryanto
 */
public class Main {
     private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
 
    private static void main_menu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
 
    public static void main(String[] args){
        /*Kamus*/
        PersegiPanjang opersegi;
        Segitigasiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
 
        opersegi = new PersegiPanjang();
        osegitiga = new Segitigasiku();
        olingkaran = new Lingkaran();
 
        /*Program*/
        //panggil metode
        main_menu();
 
        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case '1':{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.kliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.kliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.kliling(r));
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
 
        }
 
    }
    
}
