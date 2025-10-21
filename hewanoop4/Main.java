package hewanoop4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Orange");
        kucing.info();
        kucing.berjalan();
        // System.out.println(kucing.nama);
        // System.out.println(kucing.umur);

        System.out.println("Umur (akses langsung): " + kucing.umur); 

        System.out.println();

        Anjing anjing = new Anjing("Buddy", 3, "Pendek");
        anjing.info();
        System.out.println("Jenis bulu (via getter): " + anjing.getJenisBulu());
    }
}
