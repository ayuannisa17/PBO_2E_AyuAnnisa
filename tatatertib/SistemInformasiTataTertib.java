package tatatertib;

import java.util.ArrayList;

public class SistemInformasiTataTertib {
    private ArrayList<Pelanggaran> daftarPelanggaran;

    public SistemInformasiTataTertib() {
        daftarPelanggaran = new ArrayList<>();
    }

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        daftarPelanggaran.add(pelanggaran);
    }

    public void tampilkanPelanggaran() {
        System.out.println("===== DATA PELANGGARAN TATA TERTIB KAMPUS =====");
        for (Pelanggaran p : daftarPelanggaran) {
            System.out.println(p.getDataPelanggaran());
            System.out.println("---------------------------------------------");
        }
    }
}
