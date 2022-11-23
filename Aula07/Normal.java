/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Instrutor
 */
public class Normal extends Ingresso {
    
    private double valorIng;
    
    public Normal(double _valor) {
        super(_valor);
        this.valorIng = _valor + 10;
    }

    /**
     * @return the valorIng
     */
    public double getValorIng() {
        return valorIng;
    }

    /**
     * @param valorIng the valorIng to set
     */
    public void setValorIng(double valorIng) {
        this.valorIng = valorIng;
    }
    

    
}
