/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acheopar;
import java.util.Scanner;
/**
 *
 * @author mateu
 */
public class Acheopar {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     int n = sc.nextInt();
     for(int i=2;i<=n;i=i+2){
         System.out.println(i);
     }
    }
}
