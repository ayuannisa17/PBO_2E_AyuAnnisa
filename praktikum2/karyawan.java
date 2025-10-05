package praktikum2;

public class karyawan {
    private String id;
    private String nama;
    private String jenisKelamin;
    private String jabatan;
    private double gaji;

    public karyawan(String id, String nama, String jenisKelamin, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }    

    public String getId() { return id; }

    public void tampilDataDiri() {
        System.out.println("ID           : " + id);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan      : " + jabatan);
    }

     public void lihatGaji() {
        System.out.println("Gaji: Rp" + gaji);
    }
}
