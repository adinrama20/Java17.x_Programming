package com.tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner drop = new Scanner(System.in);
        ArrayList barang = new ArrayList();

        boolean menu = true;
        int pilihan;
        String tambah, cari, hapus;

        while (menu) {
            System.out.println("daftar barang :");
            System.out.println("1. tambah barang");
            System.out.println("2. list barang");
            System.out.println("3. cari barang");
            System.out.println("4. hapus barang");
            System.out.println("0. keluar");
            System.out.print("masukkan pilihan : ");
            pilihan = drop.nextInt();

            if (pilihan == 1) {
                System.out.println("anda memilih menu tambah barang");

                System.out.print("masukkan barang = ");
                tambah = drop.next();
                barang.add(tambah);

            } else if (pilihan == 2) {
                System.out.println("anda memilih menu list barang");

                System.out.println("list barang :");
                for (int i = 0; i < barang.size(); i++) {
                    System.out.println((i+1) + ". " + barang.get(i));
                }

            } else if (pilihan == 3) {
                System.out.println("anda memilih menu cari barang");

                System.out.print("masukkan barang yang ingin dicari = ");
                cari = drop.next();

                int jumlah = 0;
                boolean jumlah2 = true;
                for (int i = 0; i < barang.size(); i++) {
                    if (barang.get(i).toString().equalsIgnoreCase(cari)) {
                        jumlah++;
                        jumlah2 = true;
                    }
                }
                if (jumlah2 == true) {
                    System.out.println("ditemukan barang " + cari + " sejumlah " + jumlah);
                } else {
                    System.out.println("barang " + cari + " tidak ditemukan");
                }

            } else if (pilihan == 4) {
                System.out.println("anda memilih menu hapus barang");

                System.out.print("masukkan nama barang yang ingin dihapus = ");
                hapus = drop.next();

                for (int i = 0; i < barang.size(); i++) {
                    if (barang.get(i).toString().equalsIgnoreCase(hapus)) {
                        barang.remove(i);
                    }
                }

                for (int i = 0; i < barang.size(); i++) {
                    if (barang.get(i).toString().equalsIgnoreCase(hapus)) {
                        System.out.println("barang " + hapus + " telah dihapus dari list barang");
                    } else {
                        System.out.println("barang " + hapus + " tidak ada di dalam list barang");
                    }
                }

            } else if (pilihan == 0) {
                System.out.println("anda keluar");
                break;
            } else {
                System.out.println("input yang anda masukkan salah");
            }
        }
        
    }
}
