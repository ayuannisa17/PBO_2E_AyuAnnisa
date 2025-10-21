package hewanoop3;

public class Mamalia extends Hewan {
    public Mamalia(String nama, int umur) {
        super(nama, umur);
    }
    void menyusui() {
        System.out.println("Menyusui anaknya.....");
    }
    void berjalan() { 
        System.out.println("Berjalan dengan kaki..."); 
    }
}
