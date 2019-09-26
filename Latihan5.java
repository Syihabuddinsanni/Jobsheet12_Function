package Jobsheet12;

import java.util.Scanner;

    public class Latihan5 {
         public static void main(String[] args) {
         int pertama, kedua, ketiga, terbesar;
        Scanner hab = new Scanner(System.in);
  
        System.out.print("Masukkan bilangan I : ");
            pertama = hab.nextInt();
  
            System.out.print("Masukkan bilangan II : ");
            kedua = hab.nextInt();
  
                System.out.print("Masukkan bilangan III : ");
             ketiga = hab.nextInt();
  
            if(pertama>kedua && pertama>ketiga){
                terbesar = pertama;
            }else{
            if(kedua>ketiga){
             terbesar=kedua;
            }else{
            terbesar=ketiga;
                }
            }
  
            System.out.println("Bilangan terbesar adalah "+terbesar);
  
 }
 
}
   
