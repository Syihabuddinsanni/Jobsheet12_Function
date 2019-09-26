package Jobsheet12;

import java.util.Scanner;

    public class Latihan {
        public static void hitung(int a, int b)
        {
            System.out.println("Hasil : " + (a + b));
        }
        public static void main(String[]args )
        {
            Scanner hab = new Scanner(System.in);
            System.out.print("Masukan bilangan I : ");
            int bill = hab.nextInt();
            
            System.out.print("Masukan bilangan II : ");
            int bil2 = hab.nextInt();
            
            hitung(bill, bil2);
        }
    
}
