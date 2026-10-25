# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
Melengkapi kelas Aset.java dengan menerapkan prinsip encapsulation (pembungkusan data). Menambahkan field private (kode, nama, status, kondisi), pembuatan konstruktor dengan validasi parameter menggunakan IllegalArgumentException.

## Keputusan desain
Saya menggunakan tipe data enum (StatusAset dan Kondisi) pada atribut status dan kondisi agar nilai yang dimasukkan lebih terstruktur dan sesuai dengan aturan bisnis sistem.

## Kendala
Belun memahami cara kerja tipe data enum (StatusAset dan Kondisi) di Java serta bagaimana cara menyinkronkannya dengan atribut privat dan metode setter agar tidak terjadi kesalahan tipe data saat program dikompilasi atau diuji.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: proses pembuatan kode.
- Prompt utama: saya meminta ai untuk menjelaskan isi kode dan membuat contoh kode yang mirip seperti soal yang dikerjakan.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: mengubah "private String kondisi" menjadi "private Kondisi kondisi".
- Satu hal yang saya pahami lebih baik sekarang: Saya sekarang lebih mengerti bagaimana sintaksis dasarnya dari mendeklarasikan tipe data, membuat konstruktor, menangani error menggunakan IllegalArgumentException, hingga memanfaatkan fungsi pembersihan teks seperti trim().isEmpty().
