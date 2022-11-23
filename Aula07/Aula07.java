/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import javax.sound.midi.Soundbank;

/**
 *
 * @author Instrutor
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ingresso ig = new Ingresso(100);
        
        System.out.println("Valor do Ingresso: " + ig.getValor());
        
        Normal ingN = new Normal(ig.getValor());
        
        System.out.println("Ingresso Normal: " + ingN.getValorIng());
        
        Vip vp = new Vip(ig.getValor());
        
        System.out.println("Ingresso Vip: " + vp.getCalcVip());
        
        CamaroteInferior camInf = new CamaroteInferior(ig.getValor(), "Setor Azul");
        
        System.out.println("Ingresso Vip/CamaroteInferior: " + camInf.getCalcVip());
        System.out.println("Localização: " + camInf.getLocalizacao());
        
        CamaroteSuperior camSup = new CamaroteSuperior(ig.getValor());
        
        System.out.println("Ingresso Vip/CamaroteSuperior: " + camSup.getValorIngressoCamSup());
    }
    
}
