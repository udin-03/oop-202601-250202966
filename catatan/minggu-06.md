# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Membuat diagram kelas (Class Diagram) dan diagram alur (Sequence Diagram) untuk proyek Aset-Pinjam menggunakan draw.io, lalu menulis penjelasan tentang prinsip SOLID. Class Diagram berisi daftar kelas, paket, atribut, method, dan hubungannya. Sequence Diagram menggambarkan langkah-langkah saat seseorang meminjam barang, lengkap dengan kondisi berhasil atau gagal (bentrok). Terakhir, saya membuat ringkasan prinsip SOLID (OCP dan DIP) yang diterapkan pada kode.

## Keputusan desain
Saya membagi kelas-kelas ke dalam beberapa folder atau paket (seperti model, denda, katalog, dan kontrak) agar kodenya teratur dan rapi. Untuk aturan denda, saya menggunakan prinsip OCP dan DIP agar jika nanti ada penambahan jenis denda baru, saya tidak perlu merombak ulang kode utama peminjaman.

## Kendala
Tantangan terbesarnya adalah merapikan garis-garis penghubung dan kotak paket di draw.io supaya tidak saling bertumpuk dan mudah dibaca. Saya mengatasinya dengan mengatur ulang posisi kotak dan merapikan arah garisnya.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: Mengecek hubungan antar kelas di diagram, menyusun alur sequence diagram.
- Prompt utama: Berikan panduan ringkas cara menyusun Class Diagram dan Sequence Diagram di draw.io.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan sendiri posisi dan letak kotak di diagram agar benar-benar pas dan sesuai dengan kode Java yang saya buat.
- Satu hal yang saya pahami lebih baik sekarang: Pentingnya membuat diagram UML yang benar-benar sesuai dengan kodenya, bukan hanya sekadar gambar rancangan kosong, agar sistem lebih mudah dikembangkan.

## Kuis
1. Perbedaan aggregation dan composition:
- Aggregation, jika induknya dihapus, bagiannya masih bermakna. Dinotasikan dengan gambar belah ketupat kosong.
- Composition, jika induknya dihapus, bagiannya sudah tidak bermakna. Dinotasikan dengan gambar belah ketupat penuh.
2. Mengapa OCP memudahkan pengembangan, karena jika ingin membuat kelas baru bisa langsung ditambahkan tanpa harus merubah kode lama yang sudah berjalan.
3. Mengapa DIP meningkatkan testability, karena kelas utama tidak terhubung langsung dengan kelas tertentu. Jadi hubungan antar kelas lebih longgar yang memudahkan saat test karena test bisa dilakukan secara terpisah.