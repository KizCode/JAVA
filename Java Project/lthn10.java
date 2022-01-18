import java.util.Scanner;


public class lthn10 {  
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mn;
        int jm;
        int sp = 45000;
        int lp = 65000;
        int eb = 30000;
        int gy = 15000;
        int hs2,hs3,hs4,hs9,hs,hsb,hsg,hs0,hsl;
        int by;

        System.out.println("Daftar Menu Pilihan : ");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("1. Sapu    : Rp.45000");
        System.out.println("2. Lappel  : Rp.65000");
        System.out.println("3. Ember   : Rp.30000");
        System.out.println("4. Gayung  : Rp.15000");
        System.out.println("=======================================");
        System.out.print("Masukan Menu Pilihan : ");
        mn = in.nextInt();
        System.out.println("=======================================");
        System.out.println("Anda Memilih : "+mn);
        if (mn == 1||mn == sp) {
            System.out.println("Harga Satuan Sapu : Rp."+sp);
            System.out.print("Silahkan Mau Beli Berapa : ");
            jm = in.nextInt();
            hs9 = sp*jm;
            hs0 = hs9;
            System.out.println("Total Harga Pembelian : Rp."+hs0);
            System.out.println("=======================================");
            System.out.println();
            System.out.print("Bayar : ");
            by = in.nextInt();
            hs9 = by-hs0;
            System.out.println("Total Kembalian Anda :"+hs9);
            
        } else if (mn == 2||mn == lp) {
            System.out.println("Harga Satuan Lappel : Rp."+lp);
            System.out.print("Silahkan Mau Beli Berapa : ");
            jm = in.nextInt();
            hs2 =lp*jm;
            hsl = hs2;
            System.out.println("Total Harga Pembelian : Rp."+hsl);
            System.out.println("=======================================");
            System.out.println();
            System.out.print("Bayar : ");
            by = in.nextInt();
            hs2 = by-hsl;
            System.out.println("Total Kembalian Anda :"+hs2);

        } else if (mn == 3||mn == eb) {
            System.out.println("Harga Satuan Amber : Rp."+eb);
            System.out.print("Silahkan Mau Beli Berapa : ");
            jm = in.nextInt();
            hs3 = eb*jm;
            hsb = hs3;
            System.out.println("Total Harga Pembelian : "+hsb);
            System.out.println("=======================================");
            System.out.println();
            System.out.print("Bayar : ");
            by = in.nextInt();
            hs3 = by-hsb;
            System.out.println("Total Kembalian Anda Rp.: "+hs3);

        } else if (mn == 4||mn == gy) {
            System.out.println("Harga Satuan Gayung : Rp."+gy);
            System.out.print("Silahkan Mau Beli Berapa : ");
            jm = in.nextInt();
            hs4 = gy*jm;
            hsg = hs4;
            System.out.println("Total Harga Pembelian : Rp."+hsg);
            System.out.println("=======================================");
            System.out.println();
            System.out.print("Bayar : ");
            by = in.nextInt();
            hs4 = by-hsg;
            System.out.println("Total Kembalian Anda : Rp."+hs4);
        } else {
            System.out.println("Barang Tidak Ada/Habis");
        }
        //hsl = hs0;
        //System.out.println("Total Harga Pembelian : "+hs0);
        //System.out.println("=======================================");
        //System.out.println();
        //System.out.print("Bayar : ");
        //by = in.nextInt();
        //hs6 = hsl%by;
        //System.out.println("Total Kembalian Anda :"+hs6);
    
        
             
    }   
}