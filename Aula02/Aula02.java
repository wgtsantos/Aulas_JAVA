/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.senai.aula02;

import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula02 {

    public static void main(String[] args) {
        
        int num1, num2, total;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite outo número: ");
        num2 = entrada.nextInt();
        
        total = num1 + num2;
        
        System.out.println("O resultado é " + total);
    }
}
