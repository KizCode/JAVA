import java.util.Scanner;
import java.util.zip.GZIPInputStream;

import javax.swing.JOptionPane;

public class kuis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in);
        boolean rin = true;
        while (rin) {
            System.out.println("\t QUIZ REKAYASA PERANGKAT LUNAK");
            System.out.println("1.Program Sistem Menghitung Gaji Kariawan");
            System.out.println("2.Program Sistem Informasi Revervasi Hotel");
            System.out.println("3.Program Menghitung Rumus Fisika Berbasis Java");
            System.out.println("4.Program Array Mencari Nilai Tertinggi dan Terendah Mahasiswa");
            System.out.println("5.Program Array Matrix");
            System.out.println("6.Program Array Bubble Short");
            System.out.println("7.Program Array Jual Beli Helm");
            System.out.print("Masukan Pilihan (1 s/d 7) : ");
            int pl = in.nextInt();
            System.out.println();

            switch (pl) {
                case 1 :
                boolean run = true;
                while (run)  {
                    System.out.println();
                    System.out.println("\tProgram Perhitungan Gaji Kariawan\t");
                    System.out.println("\tSMK ASSALAAM BANDUNG");
                    System.out.println("======================================================+");
                    System.out.print("Masukan Nama : ");
                    String nm = on.nextLine();
                    System.out.print("Masukan NIK : ");
                    String nk = on.nextLine();
                    System.out.println();
                    System.out.println("1. Golongan 1A");
                    System.out.println("2. GOlongan 1B");
                    System.out.println("3. GOlongan 2A");
                    System.out.println("4. Golongan 2B");
                    System.out.println("5. Golongan 3A");
                    System.out.println("6. GOlongan 3B");
                    System.out.print("Masukan Pilihan Golongan : ");
                    int pl2 = in.nextInt();
                    System.out.println("======================================================+");
                    switch (pl2) {
                        case 1 :
                        double gp = 1000000, tia = 100000;
                        double pjk = ((5/2)*(gp+tia))/100;
                        double tgp = ((gp+tia)-pjk);
                        System.out.println("Nama Kriawan               = "+nm);
                        System.out.println("NIK Kariawan               = "+nk);
                        System.out.println("Gaji Pokok                 = "+gp);
                        System.out.println("Tunjangan Anak Istri       = "+tia);
                        System.out.println("Pajak                      = "+pjk);
                        System.out.println("Total Gaji yang Diterima   = " + tgp);
                        System.out.println("===================================================+");
                    }

                Scanner qi = new Scanner(System.in);
                System.out.print("Ingin Mengulang Program? (y/n)");
                String qe = qi.nextLine();
                System.out.println();

                if (qe.equalsIgnoreCase("y")) {
                    run = false;
                }

                } 
            }


        } 

    }
    
}
