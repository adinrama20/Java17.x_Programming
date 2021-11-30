package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner drop = new Scanner(System.in);
        int[] bilangan;
        int kuadrat;

        System.out.print("masukkan nilai awal : ");
        int awal = drop.nextInt();
        System.out.print("masukkan nilai akhir : ");
        int akhir = drop.nextInt();

        bilangan = new int[awal + akhir];

        // jika user memasukkan nilai awal < nilai akhir
        for (int i = awal ; i <= akhir ; i++) {
            bilangan[i] = i;
        }
        // jika user memasukkan nilai awal > nilai akhir
        for (int i = awal ; i >= akhir ; i--) {
            bilangan[i] = i;
        }


        if (awal == akhir) {
            System.out.println("input salah");

        } else if (awal%2 == 0 && akhir%2 == 0) {
            System.out.println("tidak ditemukan angka ganjil");

        } else if (awal < akhir) { //jika nilai awal < nilai akhir
            for (int i = 0 ; i < bilangan.length ; i++) {
                kuadrat = bilangan[i] * bilangan[i];
                if (bilangan[i] % 2 != 0) {
                    System.out.println(bilangan[i] + "^2 = " + kuadrat);
                }
            }
        } else { //jika nilai awal > nilai akhir
            for (int i = bilangan.length-1 ; i > 0 ; i--) {
                kuadrat = bilangan[i] * bilangan[i];
                if (bilangan[i] % 2 != 0) {
                    System.out.println(bilangan[i] + "^2 = " + kuadrat);
                }
            }
        }

    }
}