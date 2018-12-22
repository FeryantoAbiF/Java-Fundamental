/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author Feryanto
 */
public class Main {
  public static void main(String[] args){
      System.out.println("Hello Word!");
      
      Gitar.bunyi();
      Mobil.jumlahban();
      Motor.jumlahban();
      Kereta.jumlahban();
      
      Date today = new Date();
      System.out.println("Hari ini : "+today);
      Date tomorow = DateUtils.addDays(today, 1);
      System.out.println("Besok : " +tomorow);
  }
}
