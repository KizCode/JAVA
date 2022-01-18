import java.util.Scanner;

public class lthn16dly {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

        int pilihan;

        System.out.println();
        System.out.println("Pogram Pengulangan Dalam Bahasa java");
        System.out.println("1. Program Menerima Inputan N Ganjil dan Genap Java");
        System.out.println("2. Pogram Menghitung Rata-rata Java");
        System.out.println("3. Pogram Menghitung N Faktorial");
        System.out.println();
        System.out.print("Masukkan Pilihan (1-3) : ");
        pilihan=scan.nextInt();
        System.out.println();

        switch (pilihan) {

            case 1:

                System.out.println("1. Program Menerima Inputan N Ganjil dan Genap Java");
                System.out.println();

                int mbn,gg1,gg2,hp;

                System.out.print("Masukkan Bilangan N : ");
                mbn=scan.nextInt();
                System.out.println();

                gg1=1;
                gg2=-1;

                if (mbn > 0) {

                    while (gg1 <= mbn) {

                        hp=gg1%2;
                    
                        if (hp==0) {

                            System.out.println("Bilangan Ke - "+gg1+" Adalah Bilangan Genap Positif");

                        }

                        else {

                            System.out.println("Bilangan Ke - "+gg1+" Adalah Bilangan Ganjil Positif");
                        }

                        gg1++;

                    }

                }

                else if (mbn < 0) {

                    while (gg2 >= mbn) {

                        hp=gg2%2;
                    
                        if (hp==0) {

                            System.out.println("\tBilangan Ke - "+gg2+" Adalah Bilangan Genap Negatif");

                        }

                        else {

                            System.out.println("\tBilangan Ke - "+gg2+" Adalah Bilangan Ganjil Negatif");
                        }

                        gg2--;

                    }

                }

                else {

                    System.out.println("\tN Adalah Bilangan 0");

                }

            break;

            case 2:

                int jn,jb,mb,hrr;

                System.out.println("\t2. Program Menghitung Rata-rata Java");
                System.out.println();
                System.out.print("\tMasukkan N : ");
                jn=scan.nextInt();
                System.out.println("\tMasukkan "+jn+" Buah Bilangan : ");

                jb=1;

                do {

                    System.out.print("\tMasukkan Bilangan Ke - "+jb+" : ");
                    mb=scan.nextInt();

                    hrr=mb=+
                            
                    jb++;

                } while (jb <= jn);

                double hrr2=hrr/jn;
                
                System.out.println("\tRata-ratanya adalah : "+hrr2);
                
            break;

            case 3:
            break;

            default:

            System.out.println("\tMaaf Pilihan Anda Tidak Ada!!!");
            System.out.println("\tSilahkan Pilih Kembali!!!");
            System.out.println("\tTetap Ingat Yang Tersulit Bukanlah Memilih,");
            System.out.println("\tTetapi Tetap Bertahan Pada Pilihan.");

            break;

        }

    }
}