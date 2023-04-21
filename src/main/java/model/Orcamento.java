/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Bianca
 */
public class Orcamento {
        private BigDecimal valorOrcamento, descontoOrcamento;

    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;
    }

    public Orcamento() {
    //construtor vazio
    }
    
    

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
            Thread.sleep(5000);   //sonolência da informação é de 5 segundos  
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
        
        
}
