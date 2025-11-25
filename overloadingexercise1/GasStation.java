package overloadingexercise1;

public class GasStation {
    public void isiBahanBakar(MobilKuno mk, int bayar) {
        int hargaPertalite = 5000;
        int liter = bayar / hargaPertalite;
        System.out.println("Mobil tua diisi pertalite sebanyak " + liter + " liter");
    }

    public void isiBahanBakar(MobilMewah mm, int bayar) {
        int hargaPertamax = 10000;
        int liter = bayar / hargaPertamax;
        System.out.println("Mobil mewah diisi pertamax sebanyak " + liter + " liter");
    }
}
