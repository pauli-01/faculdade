/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_veteores3;

import javax.swing.JOptionPane;

public class Exercicio_veteores3 {

    public static void main(String[] args) {
        String aluno[] = new String[100];
        double nota[] = new double[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alunos"));
        for (int i = 0; i < n; i++) {
            aluno[i] = JOptionPane.showInputDialog("digite o nome do aluno" + i);
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("digite a nota do aluno" + i));
        }
        int m = 6;
        for (int i = 0; i < n; i++) {
            if (nota[i] >= m) {
                JOptionPane.showMessageDialog(null, "APROVADO\n" + "aluno:  " + aluno[i] + "  nota: " + nota[i]);
            } else {
                JOptionPane.showMessageDialog(null, "REPROVADO\n" + "aluno:  " + aluno[i] + "  nota: " + nota[i]);
            }
        }
    }
}
