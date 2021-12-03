package com.tutorial;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner drop = new Scanner(System.in);
        int ulang = drop.nextInt();
        String[] input = new String[ulang];
        input[0] = drop.nextLine();

        String k,l,a;
        int total = 0;
        char x,z,barang;

        for (int i = 0; i < input.length; i++) {
            input[i] = drop.nextLine();

            k = input[i].substring(0,2);
            int tanggal = Integer.parseInt(k);

            l = input[i].substring(6,10);
            int tahun = Integer.parseInt(l);
            
            a = input[i].substring(11,input[i].length()-1);
            int jumlah= Integer.parseInt(a);

            barang = input[i].charAt(input[i].length()-1);
            if (barang == 'S' || barang == 's') {
                System.out.print(jumlah + " Sneakers     ");
            } else if (barang == 'J' || barang == 'j') {
                System.out.print(jumlah + " Jaket        ");
            } else if (barang == 'T' || barang == 't') {
                System.out.print(jumlah + " Topi         ");
            } else {
                jumlah = 0;
                System.out.println("Invalid       ");
            }

            total += jumlah;
            System.out.print(tanggal + " ");

            x = input[i].charAt(3);
            z = input[i].charAt(4);

            if (x == '0' && z == '1') {
                System.out.print("Januari");
            } else if (x == '0' && x == '2') {
                System.out.print("Februari");
            } else if (x == '0' && z == '3') {
                System.out.print("Maret");
            } else if (x == '0' && z == '4') {
                System.out.print("April");
            } else if (x == '0' && z == '5') {
                System.out.print("Mei");
            } else if (x == '0' && x == '6') {
                System.out.print("Juni");
            } else if (x == '0' && z == '7') {
                System.out.print("Juli");
            } else if (x == '0' && z == '8') {
                System.out.print("Agustus");
            } else if (x == '0' && z == '9') {
                System.out.print("September");
            } else if (x == '1' && z == '0') {
                System.out.print("Oktober");
            } else if (x == '1' && z == '1') {
                System.out.print("November");
            } else if (x == '1' && z == '2') {
                System.out.print("Desember");
            }

            System.out.println(" " + tahun);
        }

        System.out.println("Total       = " + total + " barang");
    }
}


// Sample Input :               // Sample Output :
// 3                            // 9 Jaket        11 November 2020
// 11/11/2020 9j                // 12 Sneakers    11 Oktober 2020
// 11/10/2020 12s               // 4 Topi         12 Agustus 2020
// 12/08/2020 4T                // Total          = 25 barang
