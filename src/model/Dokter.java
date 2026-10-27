package model;

public class Dokter {
    private String idDokter;
    private String nama;
    private String spesialis;
    private boolean tersedia;

    public Dokter(String idDokter, String nama, String spesialis) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.tersedia = true; // Default dokter siap melayani
    }

    public String getIdDokter() {
        return idDokter;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}