/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial;
import java.util.Scanner;
/**
 *
 * @author mateu
 */
public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;
        for(int i=1;i<=n;i++){
            fatorial = fatorial * i;}
        System.out.println(fatorial);
    }
}
