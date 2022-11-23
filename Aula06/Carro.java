/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author Instrutor
 */
public class Carro extends Veiculo {
    
    private String direcao;
    private int qtdPorta;
    
    public Carro(String _nome, String _marca, String _cor) {
        super(_nome, _marca, _cor);
    }

    /**
     * @return the direcao
     */
    public String getDirecao() {
        return direcao;
    }

    /**
     * @param direcao the direcao to set
     */
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    /**
     * @return the qtdPorta
     */
    public int getQtdPorta() {
        return qtdPorta;
    }

    /**
     * @param qtdPorta the qtdPorta to set
     */
    public void setQtdPorta(int qtdPorta) {
        this.qtdPorta = qtdPorta;
    }
       
}
