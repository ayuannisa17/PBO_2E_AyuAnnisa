package praktikum2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namGame;
    public int lamaSewa;
    public double harga;

    public double hitungHarga() {
        return lamaSewa * harga;
    }

    public void tampilData() {
        System.out.println("ID : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namGame);
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
        System.out.println("Harga/hari : Rp " + harga);
        System.out.println("Total Bayar : " + hitungHarga());
    }
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = "p001";
        p1.namaMember = "Ayu";
        p1.namGame = "PS 4";
        p1.lamaSewa = 3;
        p1.harga = 25000;

        p1.tampilData();
    }
}
