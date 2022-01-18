import java.util.Scanner;

public class lthn18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Selamat Satang Di Progaram Latihan Array");
        System.out.println("1. Program Array 1 Dimensi");
        System.out.println("2. Program Array 2 Dimensi");
        System.out.println("3. Program Array Bubble Short");
        System.out.println();
        System.out.print("Masukan Pilihan : ");
        int v = in.nextInt();
        System.out.println();

        switch (v) {
        case 1:
            double h, lh, jmlh;
            int i, y; 
            int bil[] = new int[100];
            Scanner yr = new Scanner(System.in);
            System.out.println("1. Selamat datang Di Array Siswa 1 Dimensi");
            System.out.println();
            System.out.print("Berapa Jumlah Siswa? ");
            y = in.nextInt();
            for (i = 0; i < y; i++) {
                System.out.print("Nialai ujian siswa ke-" + (i + 1) + " adalah : ");
                bil[i] = yr.nextInt();
                lh = jmlh + bil[i];  
                h = lh/y;
            }
            System.out.println("Nilai rata-rata hasil ujina siswa adalah : "+h);
        }

    }
}
