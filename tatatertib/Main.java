package tatatertib;

public class Main {
   public static void main(String[] args) {
        AnggotaKampus mhs = new Mahasiswa("Annisa Aryani", "M001", "234101004", "Teknik Informatika");
        AnggotaKampus dosen = new Dosen("Dr. Budi Santoso", "D001", "19780923", "Teknologi Informasi");

        TataTertib t1 = new TataTertib("Tidak memakai almamater di area kampus", "Teguran lisan");
        TataTertib t2 = new TataTertib("Datang terlambat saat kuliah", "Peringatan tertulis");

        Pelanggaran p1 = new Pelanggaran(mhs, t1, "05 Oktober 2025");
        Pelanggaran p2 = new Pelanggaran(dosen, t2, "04 Oktober 2025");

        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();
        sistem.catatPelanggaran(p1);
        sistem.catatPelanggaran(p2);

        sistem.tampilkanPelanggaran();
    }
}
