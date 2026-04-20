package com.mycompany.exercicioaula;
import javax.swing.JOptionPane;
public class Exercicioaula {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("digite o numero do dia da semana"));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "domingo");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "segunda");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "terça");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "quarta");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "quinta");
            break;
            case 6:
                JOptionPane.showMessageDialog(null, "sexta");
            break;
            case 7:
                JOptionPane.showMessageDialog(null, "sabado");
            break;

            default:
                JOptionPane.showMessageDialog(null, "erro");
        }
    }
}
