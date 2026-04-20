/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd1060;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contagem = 0;
        for (int i = 1; i <= 6; i++) {
            double numero = sc.nextDouble();
            if (numero > 0) {
                contagem++;
                System.out.println(contagem);
            }
        }
    }
}

