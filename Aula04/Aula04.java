/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.senai.aula04;

import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class Aula04 {

    public static void main(String[] args) {
       
        Scanner dados = new Scanner(System.in);
        
        Caneta c1 = new Caneta();
        
        System.out.print("Informe a cor da Caneta: ");     
        c1.cor = dados.nextLine();
        
        System.out.print("Informe a marca da Caneta: ");
        c1.marca = dados.nextLine();
        
        System.out.print("Digite o valor da Caneta: ");
        c1.preco = dados.nextFloat();
        
        System.out.print("Informe a Quantidade de Canetas: ");
        c1.quantidade = dados.nextInt();
        
        System.out.print("Digite o nome do Cliente: ");
        String n = dados.next();
        int id = 1 + (int) (Math.random() * 100); // números aletórios de 1 a 99
        c1.inserirCliente(n, id);
        
        c1.exibirCliente();
        c1.exibirCor();
        c1.exibirMarca();
        c1.calcularPrecoQtd();
        c1.verificaCor();
        
    }
}
