package com.mycompany.ex_aula;
import javax.swing.JOptionPane;
public class Ex_aula {

    public static void main(String[] args) {
        int soma = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou -1"));
        
                while(n>0){
                    soma = soma + n;
                    n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero positivo ou -1"));
                    System.out.println(soma);
                }
    }
}
