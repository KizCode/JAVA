   import java.util.Scanner;

public class lthn7 {  
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        
        int m;
        int h;
        int d;
        int j;
        int d1;
        int d2;

        System.out.println();
        System.out.println("            Java Konversi Suhu             ");
        System.out.println("===========================================");

        System.out.print("Masukan Detik : ");
        d = input.nextInt();
        
        d1 = (d%3600/1);
        if (d1>=60) {
            d1=0;
        } else if (d1<60) {
            d1=d1;
        }
        m = (d%36000)/60;
        if (m>=60) {
            m=0;
        } else if (m<60); {
            m=m;
        }

        j = (d%36000)/60;
        if (j>24) {
            j=0;
        } else if (j<24) {
            j=j;
        }
        h = d/86000;

        System.out.println("+-----------------------------------------+");
        System.out.println("|           Data Konversi Suhu            |");
        System.out.println("+-----------------------------------------+");
        System.out.println(h + " Hari " + j + " Jam " + m + " Menit " + d1 + " Detik " ); 

        

    }
}      