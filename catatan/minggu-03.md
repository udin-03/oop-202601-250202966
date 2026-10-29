# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
- Membuat hierarki class subclass turunan dari kelas induk Aset, yaitu Ruang.java, Laptop.java, dan AlatLab.java.
- Menambahkan atribut khusus, konstruktor dengan pemanggilan super(), serta validasi ketat menggunakan IllegalArgumentException (seperti pengecekan kapasitas > 0, teks kosong dengan trim().isEmpty(), dan pengecekan *null*).
- Melakukan overriding pada metode getJenis() di masing-masing subclass untuk mengembalikan jenis aset yang sesuai menggunakan *enum* (JenisAset).

## Keputusan desain
Atribut umum yang dimiliki oleh semua jenis aset (seperti kode dan nama) ditarik ke kelas induk (Aset) agar terjadi *code reuse*. Sedangkan atribut spesifik yang hanya dimiliki oleh benda tertentu (seperti kapasitas pada ruang atau spesifikasi pada laptop) diletakkan di subclass masing-masing.

## Kendala
Sempat sedikit bingung saat memastikan aturan validasi trim().isEmpty() dan pengecekan nilai <= 0 agar tidak salah melempar jenis exception. Kendala tersebut berhasil diatasi dengan meninjau kembali materi contoh penanganan argumen pada konstruktor dan mengujinya langsung lewat terminal.

## Penggunaan AI
- Alat yang dipakai: Gemini.
- Bagian yang dibantu AI: proses pembuatan kode.
- Prompt utama: Jelaskan inheritance, jelaskan overide, dan berikan contoh dan jelaskan kode yang berisi inheritance dan overide.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI memberikan contoh yang mirip tugas untuk kode tugas ditulis sendiri berdasarkan contoh.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih paham cara kerja inheritance secara nyata di Java terutama wajibnya memanggil konstruktor induk menggunakan super(), menggabungkan validasi data, sampai menggunakan anotasi @Override untuk menyesuaikan perilaku metode di kelas anak.
- Contoh di mana inheritance kurang tepat dibanding komposisi: 
    - class Laptop extends StatusAset atau class Ruang extends Kondisi. Ini kurang tepat karena sebuah laptop bukanlah sebuah status aset, dan sebuah ruangan bukanlah sebuah kondisi fisik. Jika kita memaksakan inheritance, hierarki kelas akan rusak, kaku, dan sulit dikembangkan karena kelas anak akan mewarisi semua sifat induk yang sebenarnya tidak dibutuhkannya.