/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class CobaArray2D {
    public static void main(String[] args) {
        char[][]arrChar = new char[2][];
        arrChar[0]=new char[2];
        arrChar[1]=new char[3];
        
//        Array 1 dengan index 0 memiliki panjang elemen 2
         arrChar[0][0] = 'A';
         arrChar[0][1] = 'B';
         
//         Array 2 dengan index 1 memiliki panjang elemen 3
         arrChar[1][0] = 'C';
         arrChar[1][1] = 'D';
         arrChar[1][2] = 'E';
         
//         tampilan dari dimensi dengan index 0
         System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 = "+arrChar[0][0]);
         System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 = "+arrChar[0][1]);
         
//         tampilan dari dimensi dengan index 1
         System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 = "+arrChar[1][0]);
         System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 = "+arrChar[1][1]);
         System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 = "+arrChar[1][2]);
    }
    
}
