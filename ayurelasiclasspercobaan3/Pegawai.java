package ayurelasiclasspercobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip) {
        this.nip = nip;
    }
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public String Info() { String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
