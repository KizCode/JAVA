import java.util.Scanner;


public class ytloop {  
    
    public static void main(String[] args) {

    int a = 1;
    boolean knds = true;

    System.out.println("Awal Program");

    while (knds) {
        System.out.println("Loop ke-" +a);

        if (a == 100000000){
            knds = false;
        }
        a++;
    }

    System.out.println("Akhir Program"); 
    }   
}