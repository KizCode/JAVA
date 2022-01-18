import java.util.Scanner;

public class tgsklmpk4 {
    public static void main(String[] args) {
        
        boolean run = true;
        String h;

        while (run) {

            Scanner in = new Scanner(System.in);
            System.out.println("Latihan Nested For");
            System.out.println("");
            System.out.println("Level 1 :  " + " \tLevel 2 : ");
            System.out.println("1. Soal 1  " + " \t4. Soal 4 ");
            System.out.println("2. Soal 2  " + " \t5. Soal 5 ");
            System.out.println("3. Soal 3  " + " \t6. Soal 6 ");
            System.out.println("");
            System.out.print("Masukan Pilihan : ");
            int d = in.nextInt();
            System.out.println();
            switch (d) {

            case 1:
                boolean bv = true;
                String fr;

                while (bv) {
                    int ft;
                    System.out.println("Anda masuk latihan level 1 Soal 1");
                    System.out.print("Masukan Nilai x : ");
                    ft = in.nextInt();
                    for (int i = 1; i <= ft; i++) {
                        for (int x = 1; x <= i; x++) {
                            System.out.print(x + " ");
                        }
                        System.out.print("\n");
                    }
                    Scanner s = new Scanner(System.in);
                    System.out.print("Ulang Program Ini ? (y/n) ");
                    fr = s.nextLine();
                    System.out.println();

                    if (fr.equalsIgnoreCase("n")) {
                        bv = false;
                    }
                }
                Scanner lh = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = lh.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }
                break;

            case 2:
                boolean fp = true;
                String gf;

                while (fp) {
                    int ft,b,c,a;
                    System.out.println("Anda masuk latihan level 1 Soal 2");
                    System.out.print("Masukan nilai x : ");
                    ft = in.nextInt();
                    for (a=ft; a>= 1;a--) {
                        for (b = ft; b > a; b--) {
                            System.out.print(" ");
                        }
                        for ( c = 1; c < a+1; c++) {
                            System.out.print(c+" ");
                        }
                    System.out.println();
                    } 
                    Scanner u = new Scanner(System.in);
                    System.out.print("Ulang Program Ini ? (y/n) ");
                    gf = u.nextLine();
                    System.out.println();

                    if (gf.equalsIgnoreCase("n")) {
                        fp = false;

                    }
                }
                Scanner oo = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = oo.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }
                break;
            

            case 3:
                boolean mn = true;
                String tf;

                while (mn) {
                    int ft;
                    System.out.println("Anda masuk latihan level 1 Soal 3");
                    System.out.print("Masukan nilai x : ");
                    ft = in.nextInt();  
                        for (int i=1;i<=ft;i++){ 
                            for (int j = 1; j <= i; j--) {
                                System.out.print(j);
                            }
                            System.out.println("\n");
                        }
                    Scanner j = new Scanner(System.in);
                    System.out.print("Ulang Program Ini ? (y/n) ");
                    tf = j.nextLine();
                    System.out.println();

                    if (tf.equalsIgnoreCase("n")) {
                        mn = false;

                    }
                }   
                Scanner lp = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = lp.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }
                break;

            case 4:

                boolean rn = true;
                String f;

                while (rn) {
                    int ft;
                    System.out.println("Anda masuk latihan Level 2 Soal 4");
                    System.out.print("Masukan Nilai x : ");
                    ft = in.nextInt();
                    for (int i = 0; i < ft; i++) {
                        for (int j = 0; j < ft; j++) {
                            System.out.print("*");
                            if (i == j) {
                                break;
                            }
                        }
                        System.out.print("\n");
                    }
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ulangi Program Ini ? (y/n) ");
                    f = p.nextLine();
                    System.out.println("");

                    if (f.equalsIgnoreCase("n")) {
                        rn = false;

                    }

                }
                Scanner ln = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = ln.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }
                break;

            case 5:
                boolean ran = true;
                String g;

                while (ran) {
                    int ft;
                    System.out.println("Anda masuk latihan Level 2 Soal 5");
                    System.out.print("Masukan Baris : ");
                    ft = in.nextInt();
                    int y = 1;
                    for (int i = 1; i <= ft; i++) {
                        for (int j = ft - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int b = 1; b <= y; b++) {
                            System.out.print("*");
                        }
                        y += 2;
                        System.out.print("\n");
                    }
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ulangi Program Ini ? (y/n) ");
                    g = p.nextLine();
                    System.out.println("");

                    if (g.equalsIgnoreCase("n")) {
                        ran = false;
                    }
                }
                Scanner lm = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = lm.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }
                break;

            case 6:
                boolean rin = true;
                String v;
                while (rin) {

                    int ft;
                    System.out.println("Anda masuk ltihan level 2 Soal 6");
                    System.out.print("Masukan Baris : ");
                    ft = in.nextInt();
                    for (int i = 0; i <= ft; i++) {
                        for (int j = ft - i; j >= 0; j--) {
                            System.out.print(" ");
                        }
                        for (int b = ft - i; b <= ft; b++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ulangi Program Ini ? (y/n) ");
                    v = p.nextLine();
                    System.out.println("");

                    if (v.equalsIgnoreCase("n")) {
                        rin = false;
                    }
                }
                Scanner n = new Scanner(System.in);
                System.out.print("Apakah anda ingin mengakhiri program ini ? (y/n) ");
                h = n.nextLine();
                System.out.println();

                if (h.equalsIgnoreCase("y")) {
                    run = false;

                }

            }
        }

    }
}








