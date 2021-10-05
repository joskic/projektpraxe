package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"pomeranč 3CZK", "jablko 2CZK", "banán 3CZK", "hruška 3CZK", "citron 4CZK", "limetka 5CZK", "kiwi 1CZK", "švestka 2CZK"};

        int j = 1;

        int price = 0;

        System.out.println("0... Konec nákupu");
        for (int i = 0; i < 8; i++) {
            System.out.println(j + "... " + fruits[i]);
            j++;
        }
        System.out.println("Zadejte co chcete koupit(1-8): ");

        int[] fruitsNumber = new int[8];
        int x = 1;
        while (x != 0) {
            int y = sc.nextInt();
            x = y;
            switch (y) {
                case 1 -> {
                    fruitsNumber[0] += 1;
                    price += 3;
                }
                case 2 -> {
                    fruitsNumber[1] += 1;
                    price += 2;
                }
                case 3 -> {
                    fruitsNumber[2] += 1;
                    price += 3;
                }
                case 4 -> {
                    fruitsNumber[3] += 1;
                    price += 3;
                }
                case 5 -> {
                    fruitsNumber[4] += 1;
                    price += 4;
                }
                case 6 -> {
                    fruitsNumber[5] += 1;
                    price += 5;
                }
                case 7 -> {
                    fruitsNumber[6] += 1;
                    price += 1;
                }
                case 8 -> {
                    fruitsNumber[7] += 1;
                    price += 2;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            if (fruitsNumber[i] > 0) {
                System.out.println(fruitsNumber[i] + "... " + fruits[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Zaplatit: " + price + "CZK");
    }
}