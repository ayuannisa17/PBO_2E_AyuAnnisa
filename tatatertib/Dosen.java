package tatatertib;

public class Dosen extends AnggotaKampus {
     private String nip;
    private String departemen;

    public Dosen(String nama, String id, String nip, String departemen) {
        super(nama, id);
        this.nip = nip;
        this.departemen = departemen;
    }
    public String getNip() {
        return nip;
    }
    public String getDepartemen() {
        return departemen;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", NIP: " + nip + ", Departemen: " + departemen;
    }
}
