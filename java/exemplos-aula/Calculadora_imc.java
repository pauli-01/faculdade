
package com.mycompany.calculadora_imc;

import java.util.Scanner;

public class Calculadora_imc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva seu peso");
        int peso = sc.nextInt();
        System.out.println("escreva sua altura");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("seu IMC é" + imc);
    }
}
