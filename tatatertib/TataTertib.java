package tatatertib;

public class TataTertib {
    private String peraturan;
    private String sanksi;

    public TataTertib(String peraturan, String sanksi) {
        this.peraturan = peraturan;
        this.sanksi = sanksi;
    }
    public String getPeraturan() {
        return peraturan;
    }
    public String getSanksi() {
        return sanksi;
    }
    public String getPeraturanSanksi(AnggotaKampus anggota) {
        return "Pelanggar: " + anggota.getNama() +
                "Peraturan: " + peraturan +
                "Sanksi: " + sanksi;
    }
}
