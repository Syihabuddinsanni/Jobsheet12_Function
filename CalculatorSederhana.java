package Pekan4;

import java.util.Scanner;

    public class CalculatorSederhana {
        public static void main(String[] args){
                       System.out.println("**************" +   "   ******      ******" + " *******" + "        *******" + "        *******" + "                *******" + "               *******" + "*******");
            System.out.println("**************" +   "   ******    ******" + "   *******" + "        *******" + "        *******" + "            *******" + " *******" + "           *******"    + "     *******");
            System.out.println("****" +             "             ******  ****** " + "    *******" + "        *******" + "        *******" + "          *******" + "      *******" + "        *******"+ "        *******");
            System.out.println("*****" +            "              ****** *****" + "     *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "        *******");
            System.out.println("*****" +            "              **********" + "       *******" + "        *******"+ "*******" + " *******" + "        *******" + "        *******" + "        *******"+ "        *******") ;
            System.out.println("**************" +   "      *******" + "         *******" + "        *******" + "*******" + " *******" + "        *******" + "        *******" + "        *******"+ "   *******");
            System.out.println("**************" +   "      ******" + "          *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "        *******");
            System.out.println("         *****" +   "      ******" + "          *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "        *******");
            System.out.println("         *****" +   "      ******" + "          *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "        *******");
            System.out.println("**************" +   "      ******" + "          *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "        *******");
            System.out.println("**************" +   "      ******" + "          *******" + "        *******" + "        *******" + "        *******" + "        *******" + "        *******"+ "  *******");
            
            
            int p, i;
            Scanner hab = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("===== KALKULATOR BY ME =====");
            System.out.println(" Hasil nya :" +penjumlahan()); // t
            System.out.println(" Hasil nya : " +pengurangan()); // y
            System.out.println(" Hasil nya : " + perkalian()); // u 
            System.out.println(" Hasil nya : " + pembagian()); // i
            System.out.println(" Hasil nya :" + sisabagi());
            
            
          
      
        }
        public static int penjumlahan(){
           
            System.out.println("=== PENJUMLAHAN ===");
            Scanner hab = new Scanner (System.in);
            System.out.print("Masukan Bil 1 : ");
            int p, s;
            p = hab.nextInt();
            System.out.print("Masukan Bil 2 : ");
            s = hab.nextInt();
            int hasil = p + s;
            return hasil;
        }
         public static double pengurangan(){
        System.out.println(" " + "\n");
            System.out.println("=== PENGURANGAN === ");
            Scanner hab = new Scanner(System.in);
            System.out.print("Masukan Bil 1 : ");
            int p;
            p = hab.nextInt();
            System.out.print("Masukan Bil 2 : ");
            int l;
            l = hab.nextInt();
            double hasil = p - l;
            return hasil;
         }
            
         public static int perkalian(){
             System.out.println(" " + "\n");
             System.out.println("=== PERKALIAN ===");
             Scanner hab = new Scanner(System.in);
             int p, s;
             System.out.print("Masukan Bil 1 : ");
             p = hab.nextInt();
             System.out.print("Masukan Bil 2 : ");
             s = hab.nextInt();
             int hasil = p * s;
             return hasil;
         }
          public static double pembagian(){
               System.out.println(" " + "\n");
              System.out.println("=== PEMBAGIAN ===");
              Scanner hab = new Scanner(System.in);
               System.out.print("Masukan Bil 1 : ");
               double e;
               e = hab.nextInt();
                System.out.print("Masukan Bil 2 : ");
                double r;
                r = hab.nextInt();
                double hasil = e / r;
                return hasil;
          }
           public static double sisabagi(){
               System.out.println(" " + "\n");
               System.out.println("=== SISA HASIL BAGI ===");
                 Scanner hab = new Scanner(System.in);
                  System.out.print("Masukan Bil 1 : ");
                  double y;
                  y = hab.nextInt();
                   System.out.print("Masukan Bil 2 : ");
                   double u;
                   u = hab.nextInt();
                  double hasil = y % u;
                  if(y > u){
                           System.out.println("Sisa hasil bagi : ");
                       
                       
                           
                       }else if (y < u){
                       System.err.println("Maaf Angka tidak ditemukan ");
                       
                   }
                  if(y > u){
                  return hasil;
           }else if (y < u){
                       
                       return 0;
           
    
           
    }
            return hasil;
            
            
           }
           
           }
    
            
    
                
            
                    
    
    
    


    




