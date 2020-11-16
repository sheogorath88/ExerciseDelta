package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj proszę pierwszą liczbę. Ważne, aby była ona różna od zera!");
        int a = skaner.nextInt();
        System.out.println("Dziękuję. Podaj proszę drugą liczbę");
        int b = skaner.nextInt();
        System.out.println("Dziękuję. Podaj proszę trzecią liczbę");
        int c = skaner.nextInt();

        int delta = (int) Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            int x1 = (((b * -1) + (int) Math.sqrt(delta)) / (2 * a));
            int x2 = (((b * -1) - (int) Math.sqrt(delta)) / (2 * a));
            System.out.println(" Ze względu na to, że delta jest większa od zera istnieją dwa rozwiązania: " + x1 + " lub " + x2);
        } else if (delta == 0) {
            int x = (b * -1) / (2 * a);
            System.out.println("Ze względu na to, że delta jest równa zero, rozwiązanie jest tylko jedno: " + x);
        } else {
            System.out.println("Przykro mi, podałeś złe dane, więc znalezienie rozwiązania nie jest możliwe.");
        }

    }
}
