public class Anggota {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getInfo() {
        return "ID Anggota: " + id + ", Nama: " + nama;
    }
}
