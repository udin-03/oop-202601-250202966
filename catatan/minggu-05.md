# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
- Mengubah kelas `Aset` menjadi kelas abstrak serta melengkapi method `bisaDipinjam()` agar aset hanya dapat dipinjam jika statusnya `TERSEDIA` dan kondisinya bukan `RUSAK_BERAT`.
- Membuat dua kelas perhitungan denda yang mengimplementasikan interface `AturanDenda`, yaitu `DendaFlat` (denda normal) dan `DendaProgresif` (denda yang makin mahal kalau telatnya makin lama).

## Keputusan desain
Saya membuat method `hitungDenda()` di kelas `Aset` menjadi *abstract* supaya setiap jenis aset (seperti `Laptop`, `AlatLab` atau `Ruang`) wajib punya cara hitung dendanya masing-masing. Untuk `DendaProgresif`, saya memakai rumus denda normal ditambah biaya ekstra sebesar 50% dikali jumlah hari terlambat, supaya dendanya terus naik dan pasti lebih mahal dari denda biasa saat telat lama.

## Kendala
Menentukan rumus untuk `DendaProgresif` agar tidak melanggar syarat tes (tidak boleh turun saat hari bertambah dan pada hari ke-30 harus lebih mahal dari `DendaFlat`). Masalah ini teratasi dengan memakai rumus kelipatan hari dan fungsi `Math.max()` supaya nilai denda progresif tidak pernah lebih kecil dari denda normal.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: proses pembuatan kode.
- Prompt utama: Bagaimana cara membuat method `bisaDipinjam()` di kelas Aset jika syaratnya status TERSEDIA dan kondisi bukan RUSAK_BERAT?.Buatkan contoh rumus untuk DendaProgresif agar tidak pernah lebih murah dari DendaFlat dan selalu naik.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan rumusnya menggunakan pengali `0.5` per hari dan memastikan tipe datanya memakai `long` supaya sesuai dengan aturan di proyek ini.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih paham bedanya kegunaan *abstract class* (untuk kerangka dasar yang punya atribut/sifat) dengan *interface* (untuk kontrak aturan yang bisa dipakai lintas kelas).