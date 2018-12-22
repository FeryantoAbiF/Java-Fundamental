
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class fungsiinputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("masukan angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1+value2;
        System.out.println("Hasilnya adalah = "+hasil);
    }
    
}
