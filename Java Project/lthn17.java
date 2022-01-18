import java.util.Scanner;

public class lthn17 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int v;
        System.out.print("Input Pilihan  : ");
        v = in.nextInt();
        switch (v){

            case 1 :
            int ft; 
            System.out.print("Masukan Baris : ");
            ft = in.nextInt();
            int y = 1;
                for (int i = 0; i <= ft; i++) {
                    for (int j = ft - i; j >= 0; j--) {
                        System.out.print(" ");
                    }
                    for (int b = ft - i;b <= ft; b++) {
                        System.out.print ("*");
                    }   
                    y+=2;
                    System.out.print("\n");
                }
        }                     
              
            
            
            
            
    }
}
