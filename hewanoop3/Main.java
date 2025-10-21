package hewanoop3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();

        System.out.println();

        Anjing anjing = new Anjing("Buddy", 3);
        anjing.berjalan();
        anjing.menyusui();
        anjing.menggonggong();
    }
}
