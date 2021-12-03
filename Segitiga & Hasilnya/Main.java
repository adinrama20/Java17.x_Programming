package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner drop = new Scanner(System.in);
        
        String input, ambilKata, ambilAngka;
        String gabungKata = "";
        String casting;
        int a = 0;
        int b = 0;
        int[] convert = new int[3];

        int keliling = 0;
        for (int i = 0; i < 3; i++) {
            input = drop.next();

            a = input.length()-2;
            b = input.length();

            ambilKata = input.substring(0, a);
            casting = String.valueOf(ambilKata);
            ambilAngka = input.substring(a,b);
            convert[i] = Integer.parseInt(ambilAngka);

            gabungKata += casting;
            keliling += convert[i];
        }

        Arrays.sort(convert);
        int A = convert[2];
        int B = convert[1];
        int C = convert[0];

        double luas = (double) B * (double) C;

        if (A >= B+C) {
            System.out.println("Bukan Segitiga");
        } else if ((A*A) == (B*B)+(C*C)) {
            System.out.println("Segitiga Siku-Siku");
        } else if ((A*A) > (B*B)+(C*C)) {
            System.out.println("Segitiga Tumpul");
        } else if ((A*A) < (B*B)+(C*C)) {
            System.out.println("Segitiga Lancip");
        } else if (A == B || A == B || B == C) {
            System.out.println("Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga Sama Sisi");
        }

        System.out.println(gabungKata);
        System.out.println("Keliling : " + keliling);
        System.out.printf("Luas : %.2f", luas/2);
    }
}


// Sample Input :           // Sample Output :
// P08                      // Segitiga Siku-siku
// T15                      // PTI
// I17                      // Keliling : 40
                            // Luas : 60.00