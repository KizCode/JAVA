import java.util.Scanner;
public class lthn16j2 {
    public static void main(String[] args) {

        boolean run = true;
        String h;

        while (run) {
             int pilihan,i;
         String n;

          Scanner scan = new Scanner(System.in);

     System.out.println("");
     System.out.println("");
    System.out.println("\tprogram  pengulanga  dalam bahasa java");
    System.out.println("");
    System.out.println("\t1. program menerima inputan N ganjil genap java");
    System.out.println("");
    System.out.println("\t2. program menghitung rata-rata");
    System.out.println("");
    System.out.println("\t3. program menghitung N faktorial");
    System.out.println("");
    System.out.println("");


     System.out.print("\tMasukaan pilihan (1-3) :  ");
         pilihan = scan.nextInt();
         System.out.println("");

         switch (pilihan) {

         case 1:

         System.out.println("\t1.Anda memasuki program menerima inputan N ganjil genap java");
         System.out.println();

         int mbn,gg1,gg2,hp;

         System.out.print("\tmasukan bilangan N  :");
         mbn=scan.nextInt();
         System.out.println();

         gg1=1;
         gg2=2;

         if (mbn > 0) {

           while (gg1 <= mbn) {
             hp=gg1%2;
             if(hp==0) {
               System.out.println("\t Bilangan ke - "+gg1+" Adalah bilangan genap");
             }
             else{
               System.out.println("\tBilangan ke - "+gg1+" Adalah bilangan ganjil");
             }
             gg1++;
           }
         }

             break;
             case 2:

             int jn,jb;
             double mb,hrr=0;

             System.out.println("\t2. Program menghitung rata rata java");
             System.out.println();
             System.out.print("\tMasukan N : ");
             jn=scan.nextInt();
             
             jb=1;

             do {

               System.out.print("\tMasukan Bilangan ke -"+jb +" : ");
               mb=scan.nextDouble();
               jb++;
               hrr=hrr+mb;
             }while (jb <= jn);
             double hrr2=hrr/jn;
             System.out.println("\t Rata-ratanya adalah : "+hrr2);
             break;   

      case 3:

            int mnf,vmnf=1,prc=0;
            System.out.println("\t3. Pogram Menghitung N Faktorial");
            System.out.println();
            System.out.print("\tMasukkan Bilangan : ");
            mnf=scan.nextInt();
            System.out.println();
            System.out.print("\t"+mnf+"! = ");

                while (mnf > prc) {

                    if (mnf==1) {

                        System.out.print(mnf+" = ");

                    }

                    else {

                        System.out.print(mnf+" x ");
                
                    }

                    vmnf=vmnf*mnf;

                    mnf--;

                }

                System.out.print(vmnf);
                System.out.println();

            break;

            default:

            System.out.println("\tMaaf Pilihan Anda Tidak Ada!!!");
            System.out.println("\tSilahkan Pilih Kembali!!!");

            break;
         }
         Scanner ber = new Scanner(System.in);

            System.out.println();
            System.out.println("\t apakah anda ingin mengakhiri program ini ? ");
            System.out.print("\tApakah jawabanmu (ya/tidak) = ");
            h=ber.nextLine();
            System.out.println();

            if ( h == "ya") {
                run=false;
   
        }
    }
  }
}