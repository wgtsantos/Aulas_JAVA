/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author Instrutor
 */
public class Moto extends Veiculo{
    
    private int cilindrada;
    private boolean carenagem;
     
    public Moto(String _nome, String _marca, String _cor) {
        super(_nome, _marca, _cor);
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the carenagem
     */
    public boolean isCarenagem() {
        return carenagem;
    }

    /**
     * @param carenagem the carenagem to set
     */
    public void setCarenagem(boolean carenagem) {
        this.carenagem = carenagem;
        
    }
    
    
}
