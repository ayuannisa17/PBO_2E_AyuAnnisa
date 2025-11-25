package tugas9;

public class Segitiga {
    private int sudut;

    // Method 1: totalSudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Method 2: totalSudut dengan 2 parameter (Overloading)
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Method 3: keliling dengan 3 parameter bertipe int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method 4: keliling dengan 2 parameter bertipe int (Overloading)
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiC;
    }

    // Method main untuk menguji program
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("=== Total Sudut ===");
        System.out.println("Sisa sudut jika sudutA = 60°  : " + segitiga.totalSudut(60));
        System.out.println("Sisa sudut jika sudutA = 60°, sudutB = 30° : " + segitiga.totalSudut(60, 30));

        System.out.println("\n=== Keliling ===");
        System.out.println("Keliling segitiga (sisiA=3, sisiB=4, sisiC=5): " + segitiga.keliling(3, 4, 5));
        System.out.println("Sisi miring segitiga siku-siku (sisiA=3, sisiB=4): " + segitiga.keliling(3, 4));
    }
}

