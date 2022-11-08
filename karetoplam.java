/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class karetoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen Bir Tam Sayı Giriniz: ");        
       int sayi = input.nextInt();
       int toplam = 0;
       int a = 0;
       while(a < sayi){
       
       toplam = toplam +  (a * a);
       a++;
       }
        
       System.out.println(toplam);
        
        
        
        
        
        
        
    }
    
}
