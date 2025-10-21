package pertemuan9;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    // Overloading: Metode dengan nama yang sama tetapi signature (parameter) berbeda
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    // Overriding: Metode dengan nama dan signature yang sama dengan superclass
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP \t\t:" + this.getNip());
        System.out.println("Nama \t\t:" + this.getNama());
        System.out.println("Golongan \t:" + this.getGolongan());
        System.out.println("Jml Lembur \t:" + this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji \t\t:%.0f\n", this.getGaji());
    }
}
