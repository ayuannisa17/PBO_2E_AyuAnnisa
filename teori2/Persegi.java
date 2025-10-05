package teori2;

class Persegi {
    int sisi;

     Persegi(int sisi) {
        this.sisi = sisi;
    }
    void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }
     int luasPersegi() {
        return sisi * sisi;
    }
      int kelilingPersegi() {
        return 4 * sisi;
    }
}
