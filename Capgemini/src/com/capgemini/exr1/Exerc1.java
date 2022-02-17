package com.capgemini.exr1;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("informe um valor inteiro: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
