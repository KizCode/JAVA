import java.util.Scanner;


public class lthn13 {  
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double h,k,jlh,jk,jo,lm,lh,lk;
        double b = 9000;
        double g = 12000;
        double t = 17000;
        double m = 20000;
        double te = 5000;
        System.out.println ("**************************************");
        System.out.println ("*             BERLIAN                *");
        System.out.println ("*         Jl.Cibaduyut NO.71         *");
        System.out.println ("* Email : berliferizadam16.gmail.com *");
        System.out.println ("*         NoHP : 088270845460        *");
        System.out.println ("**************************************");
        System.out.println ();
        System.out.println ("     Melayani Degngan Sepenuh Hati    ");
        System.out.println ();
        System.out.println ("         Daftar Barang Di Toko        ");
        System.out.println ();
        System.out.println ("1.Beras  Harga => Rp  9.000/Kg");
        System.out.println ("2.Gula   Harga => RP 12.000/Kg");
        System.out.println ("3.Telur  Harga => Rp 17.000/Kg");
        System.out.println ("4.Minyak Harga => Rp 20.000/Kg");
        System.out.println ("5.Tepung Harga => Rp  5.000/Kg");
        System.out.println ();
        System.out.print ("Silahkan Pilih No Barang Yg Akan Anda Beli : ");
        h = in.nextInt();
        if (h==1) {
            System.out.println("Beras Kami Telah Anda Beli");
            System.out.println("Dengan Harga Rp 9000/Kg");
            System.out.print ("Berapa Kg Beras Yang Anda Beli? ");
            jlh = in.nextDouble();
            jk = b*jlh;
            System.out.println("Jumlah Total Belanja Anda Adalah : "+ jk);
            System.out.println();
            if (jk>=100000) { 
                jo = jk*25/100;
                System.out.println("Anda Mendapatkan Diskon 25%");
                System.out.println("Diskon Anda Sebesar "+jo);
                lm = jk-jo;
                System.out.println("Jadi Anda Harus Membayar Rp "+lm);
                System.out.println();
                System.out.print("Input Bayar : ");
                lh = in.nextDouble();
                if (lh>lm) {
                    lk = lh-lm;
                    System.out.println("Kembalian Anda "+lk);
                } else if (lh<lm) {
                    System.out.println("Maaf Uang Anda Kurang");
                }
            } 
     
        } else if (h==2) {
          System.out.println("Beras Kami Telah Anda Beli");
            System.out.println("Dengan Harga Rp 12.000/Kg");
            System.out.print ("Berapa Kg Beras Yang Anda Beli? ");
            jlh = in.nextDouble();
            jk = g*jlh;
            System.out.println("Jumlah Total Belanja Anda Adalah : "+ jk);
            System.out.println();
            if (jk>=100000) { 
                jo = jk*30/100;
                System.out.println("Anda Mendapatkan Diskon 30%");
                System.out.println("Diskon Anda Sebesar "+jo);
                lm = jk-jo;
                System.out.println("Jadi Anda Harus Membayar Rp "+lm);
                System.out.println();
                System.out.print("Input Bayar : ");
                lh = in.nextDouble();
                if (lh>lm) {
                    lk = lh-lm;
                    System.out.println("Kembalian Anda "+lk);
                } else if (lh<lm) {
                    System.out.println("Maaf Uang Anda Kurang");
                }
            }
        } else if (h==3){
            System.out.println("Beras Kami Telah Anda Beli");
            System.out.println("Dengan Harga Rp 17.000/Kg");
            System.out.print ("Berapa Kg Beras Yang Anda Beli? ");
            jlh = in.nextDouble();
            jk = t*jlh;
            System.out.println("Jumlah Total Belanja Anda Adalah : "+ jk);
            System.out.println();
            if (jk>=100000) { 
                jo = jk*20/100;
                System.out.println("Anda Mendapatkan Diskon 20%");
                System.out.println("Diskon Anda Sebesar "+jo);
                lm = jk-jo;
                System.out.println("Jadi Anda Harus Membayar Rp "+lm);
                System.out.println();
                System.out.print("Input Bayar : ");
                lh = in.nextDouble();
                if (lh>lm) {
                    lk = lh-lm;
                    System.out.println("Kembalian Anda "+lk);
                } else if (lh<lm) {
                    System.out.println("Maaf Uang Anda Kurang");
                }
            }
        } else if (b==4){
            System.out.println("Beras Kami Telah Anda Beli");
            System.out.println("Dengan Harga Rp 20.000/Kg");
            System.out.print ("Berapa Kg Beras Yang Anda Beli? ");
            jlh = in.nextDouble();
            jk = m*jlh;
            System.out.println("Jumlah Total Belanja Anda Adalah : "+ jk);
            System.out.println();
            if (jk>=100000) { 
                jo = jk*35/100;
                System.out.println("Anda Mendapatkan Diskon 35%");
                System.out.println("Diskon Anda Sebesar "+jo);
                lm = jk-jo;
                System.out.println("Jadi Anda Harus Membayar Rp "+lm);
                System.out.println();
                System.out.print("Input Bayar : ");
                lh = in.nextDouble();
                if (lh>lm) {
                    lk = lh-lm;
                    System.out.println("Kembalian Anda "+lk);
                } else if (lh<lm) {
                    System.out.println("Maaf Uang Anda Kurang");
                }
            }
        } else if (b==5) {
            System.out.println("Beras Kami Telah Anda Beli");
            System.out.println("Dengan Harga Rp 5.000/Kg");
            System.out.print ("Berapa Kg Beras Yang Anda Beli? ");
            jlh = in.nextDouble();
            jk = te*jlh;
            System.out.println("Jumlah Total Belanja Anda Adalah : "+ jk);
            System.out.println();
            if (jk>=100000) { 
                jo = jk*5/100;
                System.out.println("Anda Mendapatkan Diskon 5%");
                System.out.println("Diskon Anda Sebesar "+jo);
                lm = jk-jo;
                System.out.println("Jadi Anda Harus Membayar Rp "+lm);
                System.out.println();
                System.out.print("Input Bayar : ");
                lh = in.nextDouble();
                if (lh>lm) {
                    lk = lh-lm;
                    System.out.println("Kembalian Anda "+lk);

                } else if (lh<lm) {
                    System.out.println("Maaf Uang Anda Kurang");
                }
            }  
            
        }
        
    
    }
}
    
 

