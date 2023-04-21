/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpatter_proxy;

import java.math.BigDecimal;
import model.Orcamento;
import model.OrcamentoProxy;

/**
 *
 * @author Bianca
 */
public class DesignPatter_Proxy {

    public static void main(String[] args) {
     Orcamento orcamento = new Orcamento (new BigDecimal("100"), new BigDecimal(10));
     System.out.println("Valor do orcamento = " + orcamento.getValorOrcamento());
     System.out.println("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());
        
     OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
     System.out.println("Valor sem Proxy = " + proxy.getDescontoOrcamento());
     System.out.println("Valor com Proxy = " + proxy.getDescontoOrcamento());

     
    }
}
