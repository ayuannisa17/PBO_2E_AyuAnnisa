package praktikum1;

public class Printer {
    private String merek;
    private int jumlahKertas;
    private boolean status;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void isiKertas(int tambah) {
        jumlahKertas = jumlahKertas + tambah;
    }

    public void gunakanKertas(int kurang) {
        jumlahKertas = jumlahKertas - kurang;
    }

    public void nyalakan() {
        status = true;
    }

    public void matikan() {
        status = false;
    }

    public void cetakStatus() {
        System.out.println("Printer merek: " + merek);
        System.out.println("Sisa kertas: " + jumlahKertas);
        System.out.println("Status: " + (status ? "Menyala" : "Mati"));
    }
}
