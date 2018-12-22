/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.fungsiinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Feryanto
 */
public class UserBufferedReader {
    public static void main(String[] args) {
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program perkalian sangat sederhana");
        int value1 = 0;
        int value2 = 0;
        
        try {
            System.out.print("Masukan angka perama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = value1*value2;
        System.out.println("Hasilnya = "+hasil);
                
    }
    
}
