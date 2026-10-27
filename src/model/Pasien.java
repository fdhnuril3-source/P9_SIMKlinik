package model;

public class Pasien {
    private String idPasien;
    private String nama;
    private int umur;

    public Pasien(String idPasien, String nama, int umur) {
        this.idPasien = idPasien;
        this.nama = nama;
        setUmur(umur); // Validasi state melalui method
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Error: Umur pasien harus lebih dari 0!");
            this.umur = 1;
        }
    }
}