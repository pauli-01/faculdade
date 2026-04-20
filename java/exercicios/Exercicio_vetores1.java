
package com.mycompany.exercicio_vetores1;

import javax.swing.JOptionPane;

public class Exercicio_vetores1 {

    public static void main(String[] args) {
        // entrada
        String nome[] = new String[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alunos"));
        for(int i = 0;i < n; i++){
            nome [i] = JOptionPane.showInputDialog("digite o nome [" + (i+1)+"]: ");
        }
        //saida
        for(int i = 0;i < n;i++){
            System.out.println("Nome :" + i + ":" + nome[i]);
        }
    }
}
