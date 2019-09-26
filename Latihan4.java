package Jobsheet12;

import java.util.Scanner;

    public class Latihan4 {
        
        
        public static void jokowi (double a, double b){
        System.out.println("Kecepatan :" +(a / b)+"Km/jam");
        }
         public static void main(String[] args) {
         Scanner hab = new Scanner(System.in);
        
        System.out.print("Masukan Jarak : ");
        int jarak = hab.nextInt();
        
        System.out.print("Masukan Waktu tempuh : ");
        int waktu = hab.nextInt();
        
        jokowi(jarak,waktu);
        
    }
    
}
