package model;

public class JadwalTemu {
    private String idJadwal;
    private Pasien pasien; // Relasi Aggregation/Association ke Pasien
    private Dokter dokter; // Relasi Aggregation/Association ke Dokter
    private String tanggal;
    private String status; // "Menunggu", "Selesai", "Dibatalkan"

    public JadwalTemu(String idJadwal, Pasien pasien, Dokter dokter, String tanggal) {
        this.idJadwal = idJadwal;
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggal = tanggal;
        
        // Validasi ketersediaan dokter saat jadwal dibuat
        if (dokter.isTersedia()) {
            this.status = "Menunggu";
            dokter.setTersedia(false); // Dokter menjadi sibuk
        } else {
            this.status = "Ditolak (Dokter Sibuk)";
            System.out.println("Gagal membuat jadwal: Dokter " + dokter.getNama() + " sedang tidak tersedia.");
        }
    }

    public void selesaikanJanji() {
        if (this.status.equals("Menunggu")) {
            this.status = "Selesai";
            this.dokter.setTersedia(true); // Dokter kembali tersedia
            System.out.println("Janji temu " + idJadwal + " telah diselesaikan.");
        }
    }

    public void batalkanJanji() {
        if (this.status.equals("Menunggu")) {
            this.status = "Dibatalkan";
            this.dokter.setTersedia(true);
            System.out.println("Janji temu " + idJadwal + " dibatalkan.");
        }
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public String getStatus() {
        return status;
    }

    public String getTanggal() {
        return tanggal;
    }
}