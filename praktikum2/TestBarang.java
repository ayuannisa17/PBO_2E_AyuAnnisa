package praktikum2;

public class TestBarang {
    public static void main(String[] args) {
        BarangP3 brg1 = new BarangP3();
        brg1.namaBrg = "pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();

        System.out.println("Stok Baru adalah " +brg1.tambahStok(20 ));
    }
}
