package com.mycompany.karsamahasiswa;

public class Produk {
    private String nama;
    private String deskripsi;
    private String kategori;
    private double harga;
    private String kontak;

    public Produk(String nama, String deskripsi, String kategori,
                  double harga, String kontak) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.harga = harga;
        this.kontak = kontak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public void tampilkanInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("Deskripsi : " + deskripsi);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("Kontak    : " + kontak);
    }
}
