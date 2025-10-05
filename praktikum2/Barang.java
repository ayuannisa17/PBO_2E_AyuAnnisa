package praktikum2;

public class Barang {
    String kode;
    String namaBarang;
    double hargaDasar;
    double diskon;

    public Barang(String kode, String namaBarang, double hargadasar, double diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargadasar;
        this.diskon = diskon;
    }

    public double hitungHargaJual() {
        return hargaDasar - (diskon * hargaDasar);
    }

    public void tampilData() {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Diskon : " + (diskon * 100) + "%");
        System.out.println("Harga Jual : Rp " + hitungHargaJual() );
    }

    public static void main(String[] args) {
        Barang b1 = new Barang("B001", "Laptop", 5000000, 0.1);
        Barang b2 = new Barang("B002", "Handphone", 3000000, 0.2);

        System.out.println("==== Data Barang 1 ====");
        b1.tampilData();

        System.out.println("\n==== Data Barang 2 ====");
        b2.tampilData();
    }
}

