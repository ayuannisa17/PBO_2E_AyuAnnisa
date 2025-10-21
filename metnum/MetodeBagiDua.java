package metnum;

import java.text.DecimalFormat;

public class MetodeBagiDua {
    static double f(double x) {
        return x + Math.exp(x);
    }
    public static void main(String[] args) {
        double a = -1, b = 0, c = 0;
        double fa, fb, fc;
        double toleransi = 1e-6;
        int maxIter = 50;

        DecimalFormat df = new DecimalFormat("0.000000");

        fa = f(a);
        fb = f(b);

        if (fa * fb > 0) {
            System.out.println("Tidak ada perubahan tanda di interval [" + a + ", " + b + "]");
            return;
        }

        System.out.println("Iterasi\t\ta\t\tb\t\tc\t\tf(c)");
        for (int i = 1; i <= maxIter; i++) {
            c = (a + b) / 2;
            fc = f(c);

            System.out.println(i + "\t\t" + df.format(a) + "\t" + df.format(b) + "\t" 
                               + df.format(c) + "\t" + df.format(fc));

            if (Math.abs(fc) < toleransi || (b - a) / 2 < toleransi) {
                System.out.println("\nAkar ditemukan pada x ≈ " + df.format(c));
                return;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        System.out.println("\nMaksimum iterasi tercapai. Perkiraan akar = " + df.format(c));
    }
}
