package com.tutorial;

import java.lang.StringBuilder;

public class Main {
    
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printAddress(builder);

        // appen
        builder.append(" semuanya");
        printAddress(builder);

        builder.append(" para warga Gamping");
        printAddress(builder);

        // insert
        builder.insert(24, " Desa");
        printAddress(builder);

        // delete
        builder.delete(24, 29);
        printAddress(builder);

        // merubah character pada index tertentu
        builder.setCharAt(0, 'H');
        printAddress(builder);

        // replace
        builder.replace(14, 18, "masyarakat");
        printAddress(builder);

        // casting menjadi String biasa
        String kalimat = builder.toString();
        System.out.println(kalimat);

        int address = System.identityHashCode(kalimat);
        System.out.println("address   = " + Integer.toHexString(address) + "\n");
    }

    private static void printAddress(StringBuilder builder) {
        System.out.println("data      = " + builder);
        System.out.println("panjang   = " + builder.length());
        System.out.println("kapasitas = " + builder.capacity());

        int address = System.identityHashCode(builder);
        System.out.println("address   = " + Integer.toHexString(address) + "\n");
    }
}