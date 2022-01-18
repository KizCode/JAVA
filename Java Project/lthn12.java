import java.util.Scanner;


public class lthn12 {  
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nilai;

        System.out.print("Nilai : ");
        nilai = in.nextInt();
        
        if (nilai%2==0) {
            if(nilai>0) {
                System.out.println("Output Genap (+) ");
            } else if (nilai<0) {
                System.out.println("Output Genap (-) ");
            } else if (nilai==0) {
                System.out.println("Output Nilai 0 ");
            }
        } else if (nilai%2!=0) {
            if (nilai>0) {
                System.out.println("Ouput Ganjil (+) ");
            } else if (nilai<0) {
                System.out.println("Ouput Ganjil (-) ");
            } else if (nilai==0) {
                System.out.println("Output Nilai 0 ");
            }
    }   
}
}