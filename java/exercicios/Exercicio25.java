package com.mycompany.exercicio25;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[20];
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
            soma = soma + n[i];
        }
        
        double media = soma / 20;
        System.out.println("soma = " + soma);
        System.out.println("média = " + media);
    }
}
