
package com.mycompany.karsamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class KarsaMahasiswa {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Produk> daftarProduk = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== KARSA MAHASISWA ===");
            System.out.println("1. Tambah penawaran");
            System.out.println("2. Lihat semua penawaran");
            System.out.println("3. Cari penawaran");
            System.out.println("4. Hapus penawaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPenawaran();
                    break;
                case 2:
                    lihatPenawaran();
                    break;
                case 3:
                    cariPenawaran();
                    break;
                case 4:
                    hapusPenawaran();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);

        input.close();
    }

    static void tambahPenawaran() {
        System.out.println("\nPilih jenis penawaran:");
        System.out.println("1. Barang atau karya");
        System.out.println("2. Jasa");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Nama penawaran: ");
        String nama = input.nextLine();

        System.out.print("Deskripsi: ");
        String deskripsi = input.nextLine();

        System.out.print("Kategori: ");
        String kategori = input.nextLine();

        System.out.print("Harga atau kisaran harga: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Nomor kontak atau Instagram: ");
        String kontak = input.nextLine();

        if (jenis == 2) {
            System.out.print("Jenis layanan: ");
            String layanan = input.nextLine();

            Jasa jasaBaru = new Jasa(
                    nama, deskripsi, kategori, harga, kontak, layanan
            );

            daftarProduk.add(jasaBaru);
        } else {
            Produk produkBaru = new Produk(
                    nama, deskripsi, kategori, harga, kontak
            );

            daftarProduk.add(produkBaru);
        }

        System.out.println("Penawaran berhasil ditambahkan.");
    }

    static void lihatPenawaran() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada penawaran.");
            return;
        }

        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.println("\nPenawaran ke-" + (i + 1));
            daftarProduk.get(i).tampilkanInfo();
        }
    }

    static void cariPenawaran() {
        System.out.print("Masukkan kata yang dicari: ");
        String kataKunci = input.nextLine().toLowerCase();

        boolean ditemukan = false;

        for (Produk produk : daftarProduk) {
            if (produk.getNama().toLowerCase().contains(kataKunci)
                    || produk.getDeskripsi().toLowerCase().contains(kataKunci)
                    || produk.getKategori().toLowerCase().contains(kataKunci)) {
                System.out.println();
                produk.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Penawaran tidak ditemukan.");
        }
    }

    static void hapusPenawaran() {
        lihatPenawaran();

        if (daftarProduk.isEmpty()) {
            return;
        }

        System.out.print("\nMasukkan nomor penawaran yang ingin dihapus: ");
        int nomor = input.nextInt();
        input.nextLine();

        if (nomor >= 1 && nomor <= daftarProduk.size()) {
            daftarProduk.remove(nomor - 1);
            System.out.println("Penawaran berhasil dihapus.");
        } else {
            System.out.println("Nomor penawaran tidak valid.");
        }
    }
}
