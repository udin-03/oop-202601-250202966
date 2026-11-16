# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

## A-02: Rumus Denda Progresif Minggu-05
- Pertanyaan: Rumus matematika seperti apa yang dipakai di `DendaProgresif` supaya dendanya tidak lebih murah dari denda biasa (*flat*), terus naik setiap hari, dan pas hari ke-30 jauh lebih mahal?
- Keputusan: Mengambil hasil denda dasar (`dendaFlat`), lalu ditambah dengan komponen ekstra kelipatan hari (`dendaFlat * hariTerlambat * 0.5`), dan dilindungi menggunakan perintah `Math.max()` supaya hasilnya tidak pernah di bawah denda flat.
- Alasan: Cara ini sangat ampuh bikin denda makin membengkak seiring lamanya keterlambatan (terutama pas hari ke-30 yang naiknya drastis), tapi tetap aman dan tidak melanggar aturan batas minimal tes.
- Dampak ke kode: Kelas `id.ac.upb.asetpinjam.denda.DendaProgresif` di bagian method `hitung()`.
- Tes yang membuktikan: `Minggu05AbstraksiTest`

## A-03: Batas Waktu Bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: Tidak bentrok (mengembalikan nilai `false`).
- Alasan: Karena pada jam 11:00, barangnya sudah selesai dipakai sama peminjam pertama, jadi bisa langsung dipakai sama peminjam berikutnya tanpa tabrakan waktu.
- Dampak ke kode: Di dalam fungsi `bentrok()`, perbandingan waktunya pakai tanda lebih kecil dari (`<`), jadi ketika (11:00 ketemu 11:00) tidak dianggap bentrok.
- Tes yang membuktikan: Tes `BatasBentrokTest.selesaiSamaDenganMulai()` yang ada di folder mahasiswa, di mana kodenya memastikan hasilnya `isFalse()`.

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.
