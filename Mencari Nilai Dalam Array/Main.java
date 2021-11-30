package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner drop = new Scanner(System.in);
        
        System.out.print("masukkan jumlah index array = ");
        int jumlah = drop.nextInt();
        int[] angka = new int[jumlah];

        System.out.println("masukkan nilai di dalam array :");
        for (int i=0 ; i<angka.length ; i++) {
            angka[i] = drop.nextInt();
        }

        System.out.print("masukkan nilai array yang akan dicari = ");
        int cari = drop.nextInt();

        int x = 0;
        for (int i=0 ; i<angka.length ; i++) {
            if (cari == angka[i]) {
                System.out.println("angka " + cari + " berada di index ke-" + i);
                x++;
            } else if (x == 0) {
                System.out.println("angka " + cari + " tidak ada di dalam array");
                x++;
            }
        }
        
    }
}