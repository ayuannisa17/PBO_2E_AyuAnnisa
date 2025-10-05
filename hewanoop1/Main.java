package hewanoop1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        kucing.bersuara();
        kucing.mengeong();

        System.out.println();

        Anjing anjing = new Anjing("boby");
        anjing.bersuara();
        anjing.menggonggong();
    }
}
