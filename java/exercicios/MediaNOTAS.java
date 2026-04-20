/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medianotas;
import javax.swing.JOptionPane;
/**
 *
 * @author mateu
 */
public class MediaNOTAS {

    public static void main(String[] args) {
        String a1 = JOptionPane.showInputDialog("insira a nota da A1");
        int n1 = Integer.parseInt(a1);
        String a2 = JOptionPane.showInputDialog("insira a nota da A2");
        int n2 = Integer.parseInt(a2);
        String a3 = JOptionPane.showInputDialog("insira a nota da A3");
        int n3 = Integer.parseInt(a3);
        String a4 = JOptionPane.showInputDialog("insira a nota da A4");
        int n4 = Integer.parseInt(a4);
        String a5 = JOptionPane.showInputDialog("insira a nota da A5");
        int n5 = Integer.parseInt(a5);
        
        int media = (n1 + n2 + n3 + n4 + n5)/5;
        JOptionPane.showMessageDialog(null, "sua média é" + media);
    }
}
