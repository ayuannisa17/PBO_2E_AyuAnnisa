package ayurelasiclasspercobaan4;

public class Kursi {
    private String nomor;
    private penumpang Penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    public void setPenumpang(penumpang penumpang) {
        this.Penumpang = penumpang;
    }
    public penumpang getPenumpang() {
        return Penumpang;
    }
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.Penumpang != null) {
            info += "Penumpang: " + Penumpang.info() + "\n";
        }
        return info;
    }
}
