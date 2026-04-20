package com.mycompany.primo_ou_n;
import javax.swing.JOptionPane;
public class Primo_ou_n {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n) {
            System.out.println("é primo");
        } else {
            System.out.println("não é primo");
        }
    }
}