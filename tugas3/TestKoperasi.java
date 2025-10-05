package tugas3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("=== Sistem Koperasi Simpan Pinjam ===");
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman : ");
        int pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran : ");
        int angsuran = input.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

        input.close();
    }
}
