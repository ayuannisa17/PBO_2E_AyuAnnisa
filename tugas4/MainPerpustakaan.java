public class MainPerpustakaan {
    public static void main(String[] args) {
        Anggota a1 = new Anggota("A001", "Budi");
        Petugas p1 = new Petugas("P001", "Siti");

        Buku b1 = new Buku("B001", "Pemrograman Java", "Andi");
        Buku b2 = new Buku("B002", "Struktur Data", "Rina");

        Peminjaman pinjam1 = new Peminjaman(a1, p1, "20-09-2025", "27-09-2025");
        pinjam1.tambahBuku(b1);
        pinjam1.tambahBuku(b2);

        System.out.println(pinjam1.getInfo());
    }
}
