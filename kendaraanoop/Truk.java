package kendaraanoop;

public class Truk extends Kendaraan{
    int kapasitasMuatan; 

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " sedang mengangkut barang berat...");
    }

    @Override
    void info() {
        super.info();
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " kg");
    }
}
