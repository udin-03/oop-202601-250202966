# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
- Method Overriding & Dynamic Binding: Menerapkan metode hitungDenda(int) secara spesifik di setiap kelas anak (Ruang, Laptop, AlatLab) dengan multiplier denda yang berbeda-beda (1x, 2x, 4x) serta mengambil nilai tarif dasar secara dinamis dari Varian.aktif().dendaPerHari berdasarkan konfigurasi NIM.
- Method Overloading: Membuat beberapa metode dengan nama yang sama (cari) namun dengan parameter yang berbeda di dalam kelas KatalogAset.java untuk memudahkan pencarian nama aset secara fleksibel.

## Keputusan desain
Saya memutuskan untuk menggunakan tipe data kembalian long pada metode hitungDenda agar konsisten dengan kerangka di kelas induk Aset. Saya juga menambahkan validasi pengecekan hari negatif yang akan melemparkan IllegalArgumentException guna mengamankan aturan bisnis dari input yang tidak valid.

## Kendala
Sempat mengalami error kompilasi (illegal start of expression dan salah ketik tipe data Sting) karena kesalahan penempatan kurung kurawal pada blok validasi if di metode cari. Kendala ini diatasi dengan memeriksa ulang letak kurung kurawal pembuka dan penutup serta memperbaiki ejaan tipe data.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: proses pembuatan kode.
- Prompt utama: Berikan contoh pembuatan kode untuk overloading cari.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI memberikan contoh yang mirip tugas untuk kode tugas ditulis sendiri berdasarkan contoh.
- Satu hal yang saya pahami lebih baik sekarang: Cara membedakan kapan harus menggunakan overriding dan overloading, serta pentingnya memahami dynamic binding pada polimorfisme runtime.