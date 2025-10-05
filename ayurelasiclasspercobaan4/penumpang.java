package ayurelasiclasspercobaan4;

public class penumpang {
    private String ktp;
    private String nama;

    public penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKtp() {
        this.ktp = ktp;
    }
    public String getKtp() {
        return ktp;
    }
    public void setNama() {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
