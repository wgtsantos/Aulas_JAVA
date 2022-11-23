/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senai.aula04;

/**
 *
 * @author Instrutor
 */
public class Caneta {
    
    String cor;
    String marca;
    float preco;
    int quantidade;
    float total;
    String nomeCliente;
    int idCliente;
    
    void exibirCor() {
        System.out.println("Cor da caneta: " + this.cor);
    }
    
    void exibirMarca() {
        System.out.println("Marca da Caneta: " + this.marca);
    }
    
    void calcularPrecoQtd() {
        total = this.preco * this.quantidade;
    }
    
    void inserirCliente(String nome, int id) {
        
        this.nomeCliente = nome;
        this.idCliente = id;
    }
    
    void exibirCliente() {
        System.out.println("-------- Informações do Cliente ----------");
        System.out.println("ID: " + this.idCliente);
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("-------------------------------------------");
    }
    
    void verificaCor() {
        
        if(this.cor.equals("Azul") || this.cor.equals("Preta")) {
            
            System.out.println("Cor da Caneta Permitida!");
            System.out.println("Você comprou " + this.quantidade + " canetas.");
            System.out.println("Cada Caneta custa R$" + this.preco);
            System.out.println("O valor total a pagar é de R$" + total);
            
        } else {
            System.out.println("Cor da Caneta não Permitida!");
            System.out.println("Não foi possível realizar a compra!");
        }
    }
    
}
