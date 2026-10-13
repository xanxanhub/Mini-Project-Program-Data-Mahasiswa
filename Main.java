import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 3; // minimal 3 object mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        System.out.println("=== PROGRAM DATA MAHASISWA ===");

        // LOOP: input data tiap mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            // OBJECT: buat object baru
            Mahasiswa mhs = new Mahasiswa();

            System.out.print("Nama  : ");
            mhs.nama = input.nextLine();

            System.out.print("NIM   : ");
            mhs.nim = input.nextLine();

            // LOOP while: ulangi sampai nilai valid (0 - 100)
            double nilai = -1;
            while (nilai < 0 || nilai > 100) {
                System.out.print("Nilai (0-100): ");
                String teks = input.nextLine();

                // KONVERSI: String -> double
                try {
                    nilai = Double.parseDouble(teks);
                } catch (NumberFormatException e) {
                    nilai = -1;
                }

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid, coba lagi.");
                }
            }
            mhs.nilai = nilai;

            daftar[i] = mhs;
        }

        // LOOP: tampilkan hasil semua mahasiswa
        System.out.println("\n=== HASIL DATA MAHASISWA ===");
        int jumlahLulus = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();

            if (daftar[i].nilai >= 60) {
                jumlahLulus++;
            }
        }

        System.out.println("\n=== RINGKASAN ===");
        System.out.println("Lulus       : " + jumlahLulus + " mahasiswa");
        System.out.println("Tidak lulus : " + (jumlah - jumlahLulus) + " mahasiswa");

        input.close();
    }
}
