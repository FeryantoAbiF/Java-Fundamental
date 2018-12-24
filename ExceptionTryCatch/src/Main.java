
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feryanto
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            
//         / Mencoba membaca berkas latihan.txt
           File file = new File("C://latihan.txt");
           FileReader fr = new FileReader(file);
         
           // Jika berhasil maka tampilkan pesan
           System.out.println("Read file berhasil");
           
        } catch (Exception e) {
//            CATCH BLOK
            System.out.println(e.getMessage());
        }
    }
    
}
