
package com.mycompany.exercicio26;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Exercicio26 {

    public static void main(String[] args) {
        int n[] = new int[20];
        for(int i=0;i<20;i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        }
        Arrays.sort(n);
        JOptionPane.showMessageDialog(null, Arrays.toString(n));
    }
}
