package model;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM INFORMASI MANAJEMEN KLINIK ===\n");

        // 1. Inisialisasi Data Master
        Pasien pasien1 = new Pasien("P001", "Budi Santoso", 35);
        Dokter dokter1 = new Dokter("D001", "dr. Andi Sp.PD", "Penyakit Dalam");

        // 2. Pembuatan Jadwal Temu
        System.out.println("--- Membuat Janji Temu ---");
        JadwalTemu jadwal1 = new JadwalTemu("J001", pasien1, dokter1, "27-10-2026");
        System.out.println("Status Janji Temu: " + jadwal1.getStatus());
        System.out.println("Ketersediaan Dokter: " + dokter1.isTersedia());

        // 3. Proses Pemeriksaan & Selesaikan Janji
        System.out.println("\n--- Pelaksanaan Pemeriksaan ---");
        jadwal1.selesaikanJanji();
        System.out.println("Ketersediaan Dokter Sekarang: " + dokter1.isTersedia());

        // 4. Pencatatan Rekam Medis
        RekamMedis rm1 = new RekamMedis("RM001", jadwal1, "Gastritis Akut", "Antasida, Omeprazole");
        rm1.hitungTotalBiaya(150000, 75000); // Biaya Dokter + Obat

        // 5. Cetak Output Rekam Medis
        rm1.cetakRekamMedis();
    }
}