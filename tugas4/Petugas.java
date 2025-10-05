public class Petugas {
    private String idPetugas;
    private String nama;

    public Petugas(String idPetugas, String nama) {
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    public String getInfo() {
        return "ID Petugas: " + idPetugas + ", Nama: " + nama;
    }
}
