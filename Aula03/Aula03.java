/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.senai.aula03;

import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula03 {

    public static void main(String[] args) {
        
        float n1, n2, n3, media, total;
        
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        n1 = en.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = en.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = en.nextFloat();
        
        media = (n1 + n2 + n3)/ 3;
        
        if (media >= 60) {
            
            total = media * 2;
            System.out.println("Você foi Aprovado, Sua nota final é " + total);
        } else {
            total = media / 2;
            System.out.println("Você foi Reprovado, Sua nota final é " + total);
        }
    }
}
