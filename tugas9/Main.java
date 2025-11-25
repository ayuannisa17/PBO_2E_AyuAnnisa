package tugas9;

class Manusia {
    void bernafas() {
        System.out.println("Manusia bernafas menggunakan paru-paru.");
    }

    void makan() {
        System.out.println("Manusia makan untuk bertahan hidup.");
    }
}

class Dosen extends Manusia {
    @Override
    void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa.");
    }

    void lembur() {
        System.out.println("Dosen lembur menyiapkan materi kuliah.");
    }
}

class Mahasiswa extends Manusia {
    @Override
    void makan() {
        System.out.println("Mahasiswa makan di kantin kampus.");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar semalaman.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia manusia; 

        manusia = new Dosen(); 
        System.out.println("=== Objek Dosen ===");
        manusia.bernafas();
        manusia.makan(); 

        manusia = new Mahasiswa(); 
        System.out.println("\n=== Objek Mahasiswa ===");
        manusia.bernafas();
        manusia.makan(); 
    }
}

