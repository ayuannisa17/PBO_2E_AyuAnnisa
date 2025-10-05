package ayurelasiclasspercobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        penumpang p = new penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        penumpang budi = new penumpang("12345", "Budi");
        gerbong.setPenumpang(budi, 1); 
        gerbong.setPenumpang(budi, 2); 
        System.out.println(gerbong.info()); 
    }
}
