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
    public void makan() { // base method
   System.out.println("Hewan sedang makan..");
}
}
 
 
class Kucing extends Hewan {
  public void makan() { // overriding
   System.out.println("Kucing sedang makan..");
  }
  public void makan(int food) { // overloading
   System.out.println("Kucing makan " + food);
  }
}
