import java.util.Scanner;

public class lthn11 {  
    
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    System.out.println("+-------------------------------------------------+");
    System.out.println("|Silahkan pilih daftar program yang akan di gunkan");
    System.out.println("+-------------------------------------------------+");
    System.out.println("|1.Konversi Waktu");
    System.out.println("|2.Konversi Suhu");
    System.out.println("|3.Menghitung Rata Rata");
    System.out.println("+-------------------------------------------------+");

    int l, 
    kw = 1, 
    ks = 2, 
    rtrt1 = 3;

    System.out.print("Masukkan Menu Pilihan :");
    l = in.nextInt();

    if (l == 1 ) {
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("              Konversi Detik               ");
        System.out.println("===========================================");

        int d;

        System.out.print("Masukan Detik : ");
        d = input.nextInt();

        int d1, m, j, h;
        
        d1 = (d%86400)%60;
        if (d1>=60) {
            d1=0;
        } else if (d1<60) {
            d1=d1;
        }             
        m = (d%86400)/60;
        if (m>=60){
            m=0;
        } else if (m<60) {
            m=m;
        }
        j = (d%86400)/60/60;
        if (j>=24) {
            j=0;
        } else if (j<24) {
            j=j;
        } 
        h = d/86400;

        System.out.println("+-----------------------------------------+");
        System.out.println("|             Hasil Konversi              |");
        System.out.println("+-----------------------------------------+");
        System.out.println(h + " Hari " + j + " Jam " + m + " Menit " + d1 + " Detik " ); 

    }else if (l == 2) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("            Java Konversi Suhu             ");
        System.out.println("===========================================");

        double c; 

        System.out.print("Masukan Celsius : ");
        c = input.nextInt();

        double                  f, k, r, rtrt;

        f = (c*1.8)+32;
        k = c+273.15;
        r = c*0.8;
        rtrt = (f+k+r)/3;

        System.out.println("+-----------------------------------------+");
        System.out.println("|           Data Konversi Suhu            |");
        System.out.println("+-----------------------------------------+");
        System.out.println("|Kelfin      : " + k ); 
        System.out.println("|Fahrenheit  : " + f );
        System.out.println("|Reamuru     : " + r ); 
        System.out.println("|Rata-Rata   : " + rtrt ); 
        System.out.println("+-----------------------------------------+");

    }else if (l == 3) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("               Nilai Siswa                 ");
        System.out.println("===========================================");

        String nama, nim;
        int uts, tgs, uas, rtrt;

        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukan Niilai Tugas : ");
        tgs = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextInt();

        rtrt = (uts + uas + tgs)/3;

        System.out.println("+-----------------------------------------+");
        System.out.println("|           Data Nilai Siswa              |");
        System.out.println("+-----------------------------------------+");
        System.out.println("|Nama        : " + nama ); 
        System.out.println("|NIM         : " + nim  ); 
        System.out.println("|Rata-Rata   : " + rtrt ); 
        System.out.println("+-----------------------------------------+");
    }

}
}


    