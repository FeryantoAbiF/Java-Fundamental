/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Feryanto
 */
public class Lingkaran implements BangunDatar{

    private double phi = 3.14;
    
    public Lingkaran() {
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double kliling(int s1, int s2) {
        return 0;
    }
    
    public double luas (int r){
        return (phi *r*r);
        
    }
    
    public double kliling (int r){
        return (2*phi*r);
    }
    
}
