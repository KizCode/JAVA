public class lthn2
 {
        public static void main(String[] args) {
                
        System.out.println();
        System.out.println("Program Datar Menghitung Luas dan Keliling Bangun Datar");
        System.out.println();
        System.out.println("Macam macam bangun datar :");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.Lingkaran");

//Persegi 
        int sisi = 20;
        int luas;
        int keliling;

        luas = sisi * sisi;
        keliling = 4 * sisi;

        //Method
        System.out.println("");
        System.out.println("?Persegi");
        System.out.println("Di Ketahui sisi persegi = " + sisi + "cm");
        System.out.println("Mencari luas persegi : sisi x sisi" );
        System.out.println("Mencari keliling persegi : 4 x sisi");
        System.out.println("Maka hasil keliling persegi adalah = " + keliling + "cm");
        System.out.println("Maka hasil luas persegi adalah = " + luas + "cm");
        

//Persegi panajang    
        int panjang = 8;
        int lebar = 6;
        int luas2;
        int keliling2;
        
        luas2 = panjang * lebar;
        keliling2 = 2*panjang + 2*lebar;

        //Method
        System.out.println("");
        System.out.println("?Persegi Panjang");
        System.out.println("Di  n     panjang persegi panjang = " + panjang + "cm");
        System.out.println("Di Ketahui lebar persegi panjang = " + lebar + "cm");
        System.out.println("Mencari keliling  persegi pnajang : 2(panjang + lebar)" );
        System.out.println("Mencari luas persegi panjang : panjang x lebar");
        System.out.println("Maka hasil keliling persegi adalah = " + keliling2 + "cm");
        System.out.println("Maka hasil luas persegi adalah = " + luas2 + "cm");
             
 //Segitiga
        int alas = 20;
        int tinggi =30;
        int s1 =10, s2 =20, s3 =30;
        int keliling3;
        double luas3;
        
        keliling3 = s1 + s2 + s3;
        luas3 = 0.5 * alas * tinggi;

        System.out.println();
        System.out.println("?Segitiga");
        System.out.println("Diketahui alas = " + alas + ", tinggi = " + tinggi);
        System.out.println("Diketahui s1 = " + s1 + ", s2 = " + s2 + ", s3 = " + s3);
        System.out.println("Mencari luas segitiga : 1/2 x alas x tinggi");
        System.out.println("Mencari keliling segitiga : s1 + s2 + s3");
        System.out.println("Maka hasil luas segitiga adalah = " +luas3);
        System.out.println("Maka hasil keliling segitiga adalah = " +keliling3);

//Lingkaran 
        double phi = 3.14;
        int r = 15;
        int d = 87;
        
        double luas4 = phi * r * r;
        double keliling4 = phi * d;

        System.out.println();
        System.out.println("?Lingkaran");
        System.out.println("Diketahui phi = " + phi + ", r = " + r + ", d = " + d);
        System.out.println("Mencari luas lingkaran : phi x r x r");
        System.out.println("Mencari keliling lingkaran : phi x D");
        System.out.println("Maka hasil luas lingkaran adalah = " +luas4);
        System.out.println("Maka hasil keliling lingkaran adalah = " +keliling4);

    }
}     