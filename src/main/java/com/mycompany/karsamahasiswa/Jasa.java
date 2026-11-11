package com.mycompany.karsamahasiswa;

public class Jasa extends Produk {
    private String jenisLayanan;

    public Jasa(String nama, String deskripsi, String kategori,
                double harga, String kontak, String jenisLayanan) {
        super(nama, deskripsi, kategori, harga, kontak);
        this.jenisLayanan = jenisLayanan;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis layanan: " + jenisLayanan);
    }
}
