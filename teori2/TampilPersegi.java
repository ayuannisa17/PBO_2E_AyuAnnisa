package teori2;

import java.util.Scanner;

public class TampilPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        int s = input.nextInt();

        Persegi p = new Persegi(s);

        System.out.println("\n=== DATA PERSEGI ===");
        p.dataPersegi();
        System.out.println("Luas persegi: " + p.luasPersegi());
        System.out.println("Keliling persegi: " + p.kelilingPersegi());
    }
}
