package overloadingexercise2;

public class Supervisor extends Pegawai {

    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        gaji += 500000;
    }
}
