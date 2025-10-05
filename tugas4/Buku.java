public class Buku {
    private String kode;
    private String judul;
    private String penulis;

    public Buku(String kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getInfo() {
        return "Kode: " + kode + ", Judul: " + judul + ", Penulis: " + penulis;
    }
}
