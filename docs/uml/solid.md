# Penerapan Prinsip SOLID pada Proyek Aset-Pinjam

## 1. Open-Closed Principle (OCP)
- Kelas/Interface Terkait: `AturanDenda`, `DendaFlat`, dan `DendaProgresif`.
- Penjelasan: Sistem perhitungan denda dibuat "terbuka untuk penambahan, tapi tertutup untuk perubahan". Jika nanti ada aturan denda baru, kita tinggal membuat kelas baru tanpa harus mengotak-atik atau merusak kode lama yang sudah berjalan.

## 2. Dependency Inversion Principle (DIP)
- Kelas/Interface Terkait: `Peminjaman` dan `AturanDenda`.
- Penjelasan: Kelas utama (`Peminjaman`) tidak bergantung langsung pada jenis denda yang spesifik, melainkan cukup melalui perantara antarmuka (`AturanDenda`). Hal ini membuat hubungan antar kode tidak kaku (loose coupling) sehingga lebih mudah diuji.