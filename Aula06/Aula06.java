/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author Instrutor
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Carro v1 = new Carro("Opala", "Chevrolet", "Branco");
     
     v1.setDirecao("Hidraulica");
     v1.setQtdPorta(2);
              
        System.out.println("Nome do carro: " + v1.getNome());
        System.out.println("Marca do carro: " + v1.getMarca());
        System.out.println("Cor do carro: " + v1.getCor());
        System.out.println("Tipo de direção: " + v1.getDirecao());
        System.out.println("Quantidade de portas: " + v1.getQtdPorta());
        
        System.out.println("---------------------------------------------");
        
     Moto m1 = new Moto("CG TITAN", "Honda", "Vermelha");
     
     m1.setCilindrada(150);
     m1.setCarenagem(true);
              
        System.out.println("Nome da Moto: " + m1.getNome());
        System.out.println("Marca da Moto: " + m1.getMarca());
        System.out.println("Cor da Moto: " + m1.getCor());
        System.out.println("Cilindradas: " + m1.getCilindrada());
        System.out.println("Possui Carenagem: " + m1.isCarenagem());
        
        
    }
    
}
