
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
public class TempAir {
    
    public static void main(String[] args) {
        
//        KAMUS
        int T;
        
//        PROGRAM
        System.out.println("Contoh If 3 Kasus");
        System.out.print("Temperatur (der. C) = ");
        
//        SCANNER UNTUK MASUKAN TEMPERATUR AIR
        Scanner S = new Scanner(System.in);
        T = S.nextInt();
        
//        PENGECEKAN DENGAN IF
        if(T < 0){
            System.out.println("Wujud Air Beku "+T);
        }else if((0 <= T) && (T <= 100)){
            System.out.println("Wujud Air Cair "+T);
        }else if(T > 100){
            System.out.println("Wujud Air Gas "+T);
        }
       
    }
    
}
