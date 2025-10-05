package praktikum1;

public class Laptop {
    private String merek;
    private int ram;
    private boolean status;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void tambahRAM(int tambah) {
        ram = ram + tambah;
    }

    public void nyalakan() {
        status = true;
    }

    public void matikan() {
        status = false;
    }

    public void cetakStatus() {
        System.out.println("Laptop merek: " + merek);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Status: " + (status ? "Menyala" : "Mati"));
    }
}
