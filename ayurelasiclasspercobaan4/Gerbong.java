package ayurelasiclasspercobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
     private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setPenumpang(penumpang penumpang, int nomor) {
        Kursi k = this.arrayKursi[nomor - 1];
        if (k.getPenumpang() == null) {
            k.setPenumpang(penumpang);
         } else {
            System.out.println("Kursi nomor " + nomor + " sudah terisi!");
        }
    }

    public Kursi getKursi(int nomor) {
        return arrayKursi[nomor - 1];
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
