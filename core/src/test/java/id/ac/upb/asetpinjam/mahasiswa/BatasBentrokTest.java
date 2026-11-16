package id.ac.upb.asetpinjam.mahasiswa;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Laptop;
import id.ac.upb.asetpinjam.model.Peminjam;
import id.ac.upb.asetpinjam.model.Peminjaman;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Tes dosen sengaja tidak menentukan: apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama
 * bentrok? Putuskan, catat alasannya di docs/asumsi.md, lalu tuliskan tesnya di sini.
 * Hapus @Disabled setelah Anda mengisinya.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
class BatasBentrokTest {

    @Test
    
    void selesaiSamaDenganMulai() {
        // TODO: buat dua peminjaman pada aset yang sama, satu selesai tepat saat yang lain mulai,
        // lalu nyatakan hasil yang Anda putuskan dengan assertThat(...).
        JadwalPeminjaman jadwal = new JadwalPeminjaman(5);
        Laptop laptop = new Laptop("L01", "MacBook Pro", "Core i7", "INV-001");
        Peminjam peminjam = new Peminjam("P1", "Andi");

        LocalDateTime mulai1 = LocalDateTime.of(2026, 6, 1, 9, 0);
        LocalDateTime selesai1 = LocalDateTime.of(2026, 6, 1, 11, 0);
        Peminjaman p1 = new Peminjaman("1", peminjam, laptop, mulai1, selesai1);
        jadwal.tambah(p1);

        LocalDateTime mulai2 = LocalDateTime.of(2026, 6, 1, 11, 0);
        LocalDateTime selesai2 = LocalDateTime.of(2026, 6, 1, 13, 0);
        Peminjaman p2 = new Peminjaman("2", peminjam, laptop, mulai2, selesai2);

        assertThat(jadwal.bentrok(p2)).isFalse();
    }
}
