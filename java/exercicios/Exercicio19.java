package com.mycompany.exercicio19;
import javax.swing.JOptionPane;
public class Exercicio19 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("digite uma frase");
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de vezes q a frase anterior ira se repetir"));
        String r = "";    
        for(int i=1;i<=n;i++){
                r = r + frase + "\n";
            }
        JOptionPane.showMessageDialog(null, r);
    }
}
