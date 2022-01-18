import java.util.Scanner;


public class lthn5 {  
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nilai;

        System.out.print("Nilai : ");
        nilai = in.nextInt();
        
        if (nilai>=80) {
            System.out.println("Selamat anda lulus dgn nilai bagus");
        } else if (nilai>=60) {
            System.out.println("Selamat anda lulus dgn nilai kkm");
        } else {
            System.out.println("Maaf anda gagal dan mengulang kembali");
        }
        
    }   
}