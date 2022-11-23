/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Instrutor
 */
public class Vip extends Ingresso {
    
    private double calcVip;
    
    public Vip(double _valor) {
        super(_valor);
        
        this.calcVip = _valor + 20;
    }

    /**
     * @return the calcVip
     */
    public double getCalcVip() {
        return calcVip;
    }

    /**
     * @param calcVip the calcVip to set
     */
    public void setCalcVip(double calcVip) {
        this.calcVip = calcVip;
    }
        
    
}
