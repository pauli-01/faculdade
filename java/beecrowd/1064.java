/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                cont++;
                soma += n;
            }
        }

        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", soma / cont);
    }
}