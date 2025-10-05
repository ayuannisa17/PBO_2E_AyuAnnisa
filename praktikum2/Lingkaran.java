package praktikum2;

public class Lingkaran {
    double phi = 3.14;
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran(7);
        System.out.println("Jari-jari : " + ling1.r);
        System.out.println("Luas : " + ling1.hitungLuas());
        System.out.println("Keliling : " + ling1.hitungKeliling());
    }
}
