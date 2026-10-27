package model;

public class RekamMedis {
    private String idRekamMedis;
    private JadwalTemu jadwal; // Relasi ke JadwalTemu
    private String diagnosis;
    private String resepObat;
    private double biaya;

    public RekamMedis(String idRekamMedis, JadwalTemu jadwal, String diagnosis, String resepObat) {
        this.idRekamMedis = idRekamMedis;
        this.jadwal = jadwal;
        this.diagnosis = diagnosis;
        this.resepObat = resepObat;
        this.biaya = 0.0;
    }

    // Method berisi logic bisnis (bukan sekadar setter)
    public void hitungTotalBiaya(double biayaKonsultasi, double biayaObat) {
        if (biayaKonsultasi > 0 && biayaObat >= 0) {
            this.biaya = biayaKonsultasi + biayaObat;
        } else {
            System.out.println("Error: Biaya tidak valid!");
        }
    }

    public void cetakRekamMedis() {
        System.out.println("\n========== REKAM MEDIS PASIEN ==========");
        System.out.println("ID Rekam Medis : " + idRekamMedis);
        System.out.println("ID Jadwal      : " + jadwal.getIdJadwal());
        System.out.println("Tanggal        : " + jadwal.getTanggal());
        System.out.println("Pasien         : " + jadwal.getPasien().getNama() + " (" + jadwal.getPasien().getUmur() + " thn)");
        System.out.println("Dokter         : " + jadwal.getDokter().getNama() + " (" + jadwal.getDokter().getSpesialis() + ")");
        System.out.println("Diagnosis      : " + diagnosis);
        System.out.println("Resep Obat     : " + resepObat);
        System.out.println("Total Biaya    : Rp " + String.format("%,.2f", biaya));
        System.out.println("========================================\n");
    }
}