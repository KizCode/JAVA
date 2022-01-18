import java.util.Scanner;

public class lthn4 {  
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        String nama;
        String nim;
        String jk;
        String nmhp;
        String alam;
        
        System.out.println("            Isi Biodata Siswa              ");
        System.out.println("===========================================");

        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukan Jenis Klamin : ");
        jk = input.nextLine();
        System.out.print("Masukan Alamat : ");
        alam = input.nextLine();
        System.printSystem.ou("Masukan Nomor HP : ");
        nmhp = input.nextLine();
        System.printSystem.ou(" : ");
        = input.nextLine();
        System.printSystem.ou(" : ");
        = input.nextLine();
        System.printSystem.ou(" : ");
        = input.nextLine();



        System.out.println("+-----------------------------------------+");
        System.out.println("|           Data Biodata Siswa            |");
        System.out.println("+-----------------------------------------+");
        System.out.println("|Nama     : " + nama ); 
        System.out.println("|NIM      : " + nim  ); 
        System.out.println("|Jenis    : " + jk   ); 
        System.out.println("|Alamat   : " + alam );
        System.out.println("|Nomor HP : " + nmhp );
        System.out.println("+-----------------------------------------+");
        

    }
}    