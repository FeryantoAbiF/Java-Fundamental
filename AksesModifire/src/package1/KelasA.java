package package1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class KelasA {

    private int memberA = 5;
    
//    modifier default bisa di akses selama masih satu pakecage 
    char memberB = 'A';
    double memberC = 1.5;
    
    private int functionA(){
        return memberA;
    }
   
    int functionB(){
//        pemangilan private member dan function
        int hasil = functionA() + memberA;
        return hasil;
    }
    
    protected void methodC(){
        System.out.println("Percobaan acces protected");
    }
}
