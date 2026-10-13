public class Mahasiswa {
 
    String nama;
    String nim;
    double nilai;
 
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    void cekKelulusan() {
        String grade;
 
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
 
        if (nilai >= 60) {
            System.out.println("Status: LULUS (Grade " + grade + ")");
        } else {
            System.out.println("Status: TIDAK LULUS (Grade " + grade + ")");
        }
    }
}
