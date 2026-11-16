# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Membuat kode untuk mengatur daftar jadwal peminjaman di kelas `JadwalPeminjaman`. Fitur yang diselesaikan meliputi: mengecek jadwal yang bentrok, mengurutkan jadwal berdasarkan waktu mulai dengan `Comparator`, mengelompokkan data berdasarkan kode aset menggunakan `Map`, dan menghapus data berdasarkan ID. Saya juga menulis kode pengujian di `BatasBentrokTest.java` untuk menguji kondisi saat waktu peminjaman saling bersambung.

## Keputusan desain
Saya memutuskan bahwa jika ada peminjaman yang jam selesainya pas banget sama jam mulai peminjaman berikutnya (misal jam 09:00-11:00 lalu disambung 11:00-13:00), itu tidak dihitung bentrok. Alasannya, jam tersebut adalah waktu peralihan barang. Saya memakai List untuk menampung semua data peminjaman apa adanya secara berurutan. Lalu, khusus untuk mengelompokkan data berdasarkan kode aset di metode perAset(), saya memakai tambahan Map.

## Kendala
Memastikan logika pengecekan waktu dan pengelompokan datanya tidak meleset. Saya mengatasinya dengan memanfaatkan fungsi bawaan Java yang sudah ada sehingga kodenya lebih rapi dan aman.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: Proses pembuatan kode.
- Prompt utama: Bagaimana cara membuat logika cek rentang waktu dan melakukan sorting dengan Comparator.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada yang ditolak secara khusus, saya hanya mengambil konsep dasar dari AI lalu mengetik ulang kodenya secara mandiri agar lebih paham.
- Satu hal yang saya pahami lebih baik sekarang: Jadi lebih mengerti cara kerja `List` dan `Map` di Java serta pentingnya membuat tes sendiri untuk memastikan program berjalan normal.
