package overloadingexercise2;

public class Pegawai {
     protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 500000;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
