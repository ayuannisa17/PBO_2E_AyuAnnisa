package praktikum1;

public class GadgetDemo {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setMerek("iPhone");
        hp.nyalakan();
        hp.isiBaterai(80);
        hp.gunakanBaterai(20);
        hp.cetakStatus();

        System.out.println();

        Iwatch iw = new Iwatch();
        iw.setMerek("Apple Watch");
        iw.nyalakan();
        iw.isiBaterai(90);
        iw.gunakanBaterai(10);
        iw.setJenisTali("Kulit");
        iw.cetakStatus();

        System.out.println();

        Laptop laptop = new Laptop();
        laptop.setMerek("Asus ROG");
        laptop.tambahRAM(16);
        laptop.nyalakan();
        laptop.cetakStatus();

        System.out.println();

        Printer printer = new Printer();
        printer.setMerek("Canon");
        printer.isiKertas(100);
        printer.gunakanKertas(10);
        printer.nyalakan();
        printer.cetakStatus();
    }
}
