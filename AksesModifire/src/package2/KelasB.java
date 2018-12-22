/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import package1.KelasA;

/**
 *
 * @author Feryanto
 */
public class KelasB extends KelasA{
    
    protected void methodC(){
        super.methodC();
        
        System.out.println("contoh pemanggilan protected");
    }
            
    
}
