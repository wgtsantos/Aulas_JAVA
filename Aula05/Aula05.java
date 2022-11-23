/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author Instrutor
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogo game = new Jogo();
        
        game.setNome("Minecraft");
        game.setTipo("Sobrevivência");
        game.setPlataforma("PC");
        game.setValor(199.90);
        game.setQuant(5);
        
        System.out.println("Nome do Jogo: " + game.getNome());
        System.out.println("Tipo do Jogo: " + game.getTipo());
        System.out.println("Plataforma: " + game.getPlataforma());
        System.out.println("Preço do Jogo: " + game.getValor());
        System.out.println("Quantidade: " + game.getQuant());
        
        
    }
    
}
