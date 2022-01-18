 import java.util.Scanner;

public class lthn6 {  
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        double k;
        double f;
        double r;
        double c;
        double rtrt;

        System.out.println();
        System.out.println("            Java Konversi Suhu             ");
        System.out.println("===========================================");

        System.out.print("Masukan Celsius : ");
        c = input.nextInt();

        f = (c*1.8)+32;
        k = c+273.15;
        r = c*0.8;
        rtrt = (f+k+r)/3;

        System.out.println("+-----------------------------------------+");
        System.out.println("|           Data Konversi Suhu            |");
        System.out.println("+-----------------------------------------+");
        System.out.println("|Kelfin      : " + k ); 
        System.out.println("|Fahrenheit  : " + f  );
        System.out.println("|Reamuru     : " + r ); 
        System.out.println("|Rata-Rata   : " + rtrt ); 
        System.out.println("+-----------------------------------------+");
        

    }
}    