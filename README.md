# Program Data Mahasiswa (CLI)

Mini project mata kuliah Pemrograman Berorientasi Objek (PBO) – Minggu 3 & 4: Java Control Flow dan Dasar OOP.

Program berbasis command line (CLI) untuk menginput data mahasiswa, menampilkannya, dan mengecek status kelulusan.

## Fitur

- Input data 3 mahasiswa (nama, NIM, nilai) menggunakan `Scanner`
- Validasi nilai: harus berupa angka antara 0 sampai 100, jika tidak akan diminta input ulang
- Menampilkan data setiap mahasiswa
- Mengecek kelulusan dan menentukan grade
- Menampilkan ringkasan jumlah mahasiswa yang lulus dan tidak lulus

## Aturan Kelulusan

| Nilai | Grade | Status      |
|-------|-------|-------------|
| ≥ 85  | A     | Lulus       |
| ≥ 75  | B     | Lulus       |
| ≥ 60  | C     | Lulus       |
| < 60  | D     | Tidak Lulus |

## Struktur File

| File             | Keterangan                                                                      |
|------------------|---------------------------------------------------------------------------------|
| `Mahasiswa.java` | Class `Mahasiswa` dengan attribute `nama`, `nim`, `nilai` dan method `tampilkanData()`, `cekKelulusan()` |
| `Main.java`      | Program utama: input data, membuat object, dan menampilkan hasil                |

## Cara Menjalankan

Pastikan JDK sudah terpasang, lalu jalankan di terminal pada folder project:

```
javac Mahasiswa.java Main.java
java Main
```

## Contoh Output

```
=== PROGRAM DATA MAHASISWA ===

Data Mahasiswa ke-1
Nama  : ihsan
NIM   : 2455
Nilai (0-100): 100

...

=== HASIL DATA MAHASISWA ===

Mahasiswa ke-1
Nama  : ihsan
NIM   : 2455
Nilai : 100.0
Status: LULUS (Grade A)

...

=== RINGKASAN ===
Lulus       : 3 mahasiswa
Tidak lulus : 0 mahasiswa
```

## Konsep yang Digunakan

variable, data type, konversi `String` ke `double`, `Scanner`, `if / else`, loop (`for`, `while`), class, object, dan method.
