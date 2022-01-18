import java.util.Scanner;

public class lthn16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Program Pengulngan Java");
        System.out.println("1.Program Menerima Inputan N Ganjil dan Genap Java");
        System.out.println("2.Program Menghitunag Rata-rata Java");
        System.out.println("3.Program Menghitung N Faktorial");
        System.out.println();
        int v;
        System.out.print("Masukan Pilihan (1-3) : ");
        v = in.nextInt();
        
        switch (v) {

            case 1 :

                System.out.println();
                System.out.println("1.Program Menerima Inputan Ganjil Genap Java");
                System.out.println("");
                int n, e = 1, l = -1,p;
                System.out.print("Masukan Bilangan N : ");
                n = in.nextInt();
                System.out.println("");
                if (n > 0) {

                    while (e<=n) {
                        p = e%2;
                        if (p == 0) {
                            System.out.println("Bilangan Ke-"+ e + " Adalah Bilangan Ganjil");
                        } else {
                            System.out.println("Bilangan Ke-"+ e + " Adalah Bilangan Ganjil");
                        }
                        n++;
                    } 

                }         
            
            case 2 :
                
                int o,x,c,b=0;
                double k;
                System.out.println("2.Program Menghitung Java");
                System.out.println("");
                System.out.print("Masukan Jumlah N : ");
                o = in.nextInt();
                System.out.println("Masukan "+o+" Buah Bilangan");
                x = 1;
                do {
                    System.out.print("Masukan Bilangan  Ke- "+x+" : ");
                    c=in.nextInt();
                    b=b+c;
                    x++;
                } while (x<=o);
                k=b/o;
                System.out.println("Rata-ratanya Adalah : "+k);
                break;

            case 3 :
                
                System.out.println("3. Program Menghitung N Faktorial");
                System.out.println ("");
                int i;
                int y=1;
                System.out.print("Masukan Bilangan N : ");
                i = in.nextInt();
                for (int a=1; a <= i; a++   ) {
                    y=y*a;
                    if (a<i) {
                        System.out.print (a +" x ");
                    } else {
                        System.out.print (a +" = ");
                    }
                    
                }
                System.out.println (y);


                
        
            
            
              
        } 
    }

}