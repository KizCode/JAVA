import java.util.Scanner;
import javax.swing.JOptionPane;

public class cnth13 {
    public static void main(String[] args) {
        double alas, tinggi, sisimiring, keliling, luas, lebar, panjang, volume;

        alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Alas : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Tinggi : "));
        lebar = Double.parseDouble(JOptionPane.showInputDialog(null, "Lebar : "));
        panjang = Double.parseDouble(JOptionPane.showInputDialog(null, "Panjang : "));

        sisimiring = Math.sqrt(alas * alas + tinggi * tinggi);
        keliling = alas + tinggi + sisimiring;
        luas = 0.5 * alas * tinggi;
        volume = 0.5 * panjang * lebar * tinggi;

        JOptionPane.showMessageDialog(null, "Alas : " + alas + "\nTinngi : " + tinggi + "\nLebar : " + lebar + "\nPanjang : " + panjang + "\nSisismiring : " + sisimiring + "\nKeliling : " + keliling + "\nLuas : " + luas + "\nVolume : " + volume, "SEGITIGA", JOptionPane.INFORMATION_MESSAGE);
    }
}
