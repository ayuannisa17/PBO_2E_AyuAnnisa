package praktikum2;

import java.util.Scanner;

public class karyawanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        karyawan[] daftarKaryawan = new karyawan[10]; 
        int jumlahKaryawan = 0;

        int pilihan;
        do {
            System.out.println("\n=== Sistem Data Karyawan ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Semua Data Karyawan");
            System.out.println("3. Cari Karyawan berdasarkan ID");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (jumlahKaryawan < daftarKaryawan.length) {
                        System.out.print("Masukkan ID: ");
                        String id = input.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Jenis Kelamin: ");
                        String jk = input.nextLine();
                        System.out.print("Masukkan Jabatan: ");
                        String jabatan = input.nextLine();
                        System.out.print("Masukkan Gaji: ");
                        double gaji = input.nextDouble();
                        input.nextLine();

                        daftarKaryawan[jumlahKaryawan] = new karyawan(id, nama, jk, jabatan, gaji);
                        jumlahKaryawan++;
                        System.out.println("Karyawan berhasil ditambahkan!");
                    } else {
                        System.out.println("Data karyawan penuh!");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Daftar Karyawan ---");
                    if (jumlahKaryawan == 0) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        for (int i = 0; i < jumlahKaryawan; i++) {
                            daftarKaryawan[i].tampilDataDiri();
                            daftarKaryawan[i].lihatGaji();
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID yang dicari: ");
                    String cariId = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        if (daftarKaryawan[i].getId().equalsIgnoreCase(cariId)) {
                            daftarKaryawan[i].tampilDataDiri();
                            daftarKaryawan[i].lihatGaji();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Karyawan dengan ID " + cariId + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
        }
    }

