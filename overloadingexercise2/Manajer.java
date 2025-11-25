package overloadingexercise2;

public class Manajer extends Pegawai {

    public Manajer(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        gaji += 1000000;
    }
}
