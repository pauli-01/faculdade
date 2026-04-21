/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_vetores2;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class Exercicio_vetores2 {

    public static void main(String[] args) {
        //entrada
        String nome[] = new String[100];
        float nota[] = new float[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade"));
        for (int i = 0; i < n; i++) {
            nome[i] = JOptionPane.showInputDialog("digite o nome" + i + ":");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog("digite a nota" + i + ":"));
        }
        //procesamento
        float soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + nota[i];
        }
        float media = soma / n;
        System.out.println("A media das notas é" + media);
        for (int i = 0; i < n; i++) {
            System.out.println("nome: " + nome[i] + "nota: " + nota[i]);
        }

    }
}
