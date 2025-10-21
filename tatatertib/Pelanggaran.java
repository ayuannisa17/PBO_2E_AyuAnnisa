package tatatertib;

public class Pelanggaran {
    private AnggotaKampus pelanggar;
    private TataTertib dilanggar;
    private String tanggal;

    public Pelanggaran(AnggotaKampus pelanggar, TataTertib dilanggar, String tanggal) {
        this.pelanggar = pelanggar;
        this.dilanggar = dilanggar;
        this.tanggal = tanggal;
    }
    public AnggotaKampus getPelanggar() {
        return pelanggar;
    }
    public TataTertib getDilanggar() {
        return dilanggar;
    }
    public String getTanggal() {
        return tanggal;
    }
    public String getDataPelanggaran() {
         return "Tanggal: " + tanggal + "\n"
             + "Pelanggar: " + pelanggar.getNama() + "\n"
             + "Peraturan: " + dilanggar.getPeraturan() + "\n"
             + "Sanksi: " + dilanggar.getSanksi() + "\n";
    }
}
