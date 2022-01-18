import java.util.Scanner;

public class lthn17full {
    public static void main(String[] args) {

        
        boolean run = true;
        String h;
        
        while (run) {

            Scanner in = new Scanner(System.in);
            System.out.println("Latihan Nested For");
            System.out.println("");
            System.out.println("Level 1 :  "+" \tLevel 2 : ");
            System.out.println("1. Soal 1  "+" \t4. Soal 4 ");
            System.out.println("2. Soal 2  "+" \t5. Soal 5 ");
            System.out.println("3. Soal 3  "+" \t6. Soal 6 ");
            System.out.println("");
            System.out.print("Masukan Pilihan : ");
            int d = in.nextInt();
            System.out.println();
            if ( d == 1) {
            
            }else if (d == 4) {
                
                    boolean rn = true;
                    String f;
                
                    while (rn) {
                        int ft;
                        System.out.println("Anda masuk latihan Level 2 Soal 4"); 
                        System.out.print("Masukan Baris : ");
                        ft = in.nextInt();
                        for (int i = 0; i < ft; i++) {
                            for (int j = 0; j < ft; j++) {
                                System.out.print("*");
                                if (i==j) {
                                    break;
                                }
                            }   
                            System.out.print ("\n");
                        }
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ulangi Program Ini ? (y/n) ");
                    f = p.nextLine();
                    System.out.println("");

                        if (f.equalsIgnoreCase("n")) {
                            rn=false;
                
                        }
                    
                    }

            } else if (d == 5) { 
                boolean ran = true;
                String t;

                while (ran) {
                    int ft;
                    System.out.println("Anda masuk latihan Level 3 Soal 5");
                    System.out.print("Masukan Baris : ");
                    ft = in.nextInt();
                    int y = 1;
                    for (int i = 1; i <= ft; i++) {
                        for (int j = ft-i; j > 0; j--) {
                        System.out.print(" ");
                        }
                        for (int b = 1;b <= y; b++) {
                        System.out.print ("*");
                        }   
                    y+=2;
                    System.out.print("\n");
                    }
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ulangi Program Ini ? (y/n) ");
                    t = p.nextLine();
                    System.out.println("");
        
                        if (t.equalsIgnoreCase("n")) {
                            ran=false;
                        }
                }
            } else if ( d == 6) {

                int ft; 
                System.out.print("Masukan Baris : ");
                ft = in.nextInt();
                    for (int i = 0; i <= ft; i++) {
                        for (int j = ft - i; j >= 0; j--) {
                            System.out.print(" ");
                        }
                        for (int b = ft - i;b <= ft; b++) {
                            System.out.print ("*");
                        }   
                        System.out.print("\n");
                    }
            
                
                Scanner n = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h=n.nextLine();
                System.out.println();
                
                if (h.equalsIgnoreCase("y")) {
                    run=false;
                    
                }    
                System.out.println("Plihan Anda Tidak Ada");
            }
        }
        
            
    }
}
