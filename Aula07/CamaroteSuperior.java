/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Instrutor
 */
public class CamaroteSuperior extends Vip {
    
    private double valorIngressoCamSup;
    
    public CamaroteSuperior(double _valor) {
        super(_valor);
        
        this.valorIngressoCamSup = _valor + 50;
    }

    /**
     * @return the valorIngressoCamSup
     */
    public double getValorIngressoCamSup() {
        return valorIngressoCamSup;
    }

    /**
     * @param valorIngressoCamSup the valorIngressoCamSup to set
     */
    public void setValorIngressoCamSup(double valorIngressoCamSup) {
        this.valorIngressoCamSup = valorIngressoCamSup;
    }
    
}
