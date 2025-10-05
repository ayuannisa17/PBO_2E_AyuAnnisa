package praktikum1;

public class Handphone {
    private String merek;
    private int baterai;
    private boolean status;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void isiBaterai(int tambah) {
        baterai = baterai + tambah;
    }

    public void gunakanBaterai(int kurang) {
        baterai = baterai - kurang;
    }

    public void nyalakan() {
        status = true;
    }

    public void matikan() {
        status = false;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Baterai: " + baterai + "%");
        System.out.println("Status: " + (status ? "Menyala" : "Mati"));
    }
}
