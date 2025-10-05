import java.util.ArrayList;

public class Peminjaman {
    private Anggota anggota;
    private Petugas petugas;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman(Anggota anggota, Petugas petugas, String tglPinjam, String tglKembali) {
        this.anggota = anggota;
        this.petugas = petugas;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public String getInfo() {
        String info = anggota.getInfo() + "\n" +
                      petugas.getInfo() + "\n" +
                      "Tanggal Pinjam: " + tglPinjam + 
                      ", Tanggal Kembali: " + tglKembali + "\n";
        info += "Daftar Buku:\n";
        for (Buku b : daftarBuku) {
            info += "- " + b.getInfo() + "\n";
        }
        return info;
    }
}
