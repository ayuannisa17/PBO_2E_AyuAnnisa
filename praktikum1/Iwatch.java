package praktikum1;

public class Iwatch extends Handphone {
    private String jenisTali;

    public void setJenisTali(String newValue) {
        jenisTali = newValue;
    }

    @Override
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jenis Tali: " + jenisTali);
    }
}
