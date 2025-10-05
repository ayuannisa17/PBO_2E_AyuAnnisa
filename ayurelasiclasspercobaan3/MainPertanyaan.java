package ayurelasiclasspercobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob SquarePants");
        KeretaApi KeretaApi = new KeretaApi("Gaya BAru", "Bisnis", masinis);
        System.out.println(KeretaApi.info());
    }
}
