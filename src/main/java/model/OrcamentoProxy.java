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
public class OrcamentoProxy extends Orcamento {
    
    private BigDecimal descontoOrcamento;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
    
    public BigDecimal getDescontoOrcamento() {
        if(descontoOrcamento == null) {
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }
        return descontoOrcamento;
    }
    
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
