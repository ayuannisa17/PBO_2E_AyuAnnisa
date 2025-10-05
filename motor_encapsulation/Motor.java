package motor_encapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
    if (kontakOn) {
        if (kecepatan < 100) {
            kecepatan += 5;
            if (kecepatan >= 100) {  
                kecepatan = 100;
                System.out.println("Kecepatan sudah maksimal (100)!");
            }
        } else {
            System.out.println("Kecepatan sudah maksimal (100)!");
        }
    } else {
        System.out.println("Kecepatan tidak bisa bertambah karena Mesin off!");
    }
}


    public void kurangiKecepatan() {
        if (kontakOn) {
            if (kecepatan > 0) {
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan sudah 0, tidak bisa dikurangi lagi!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off!");
        }
    }

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }

}
