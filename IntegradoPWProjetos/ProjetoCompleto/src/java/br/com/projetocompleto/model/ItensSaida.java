/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.model;

/**
 *
 * @author Tassia
 */
public class ItensSaida {
    private Integer idItem;
    private Integer cfopItem;
    private Integer qtdItem;
    private Double valorUnItem;
    private Produto oProduto;
    private Saida oSaida;

    public ItensSaida() {
    }

    public ItensSaida(Integer idItem, Integer cfopItem, Integer qtdItem, Double valorUnItem, Produto oProduto, Saida oSaida) {
        this.idItem = idItem;
        this.cfopItem = cfopItem;
        this.qtdItem = qtdItem;
        this.valorUnItem = valorUnItem;
        this.oProduto = oProduto;
        this.oSaida = oSaida;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getCfopItem() {
        return cfopItem;
    }

    public void setCfopItem(Integer cfopItem) {
        this.cfopItem = cfopItem;
    }

    public Integer getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(Integer qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Double getValorUnItem() {
        return valorUnItem;
    }

    public void setValorUnItem(Double valorUnItem) {
        this.valorUnItem = valorUnItem;
    }

    public Produto getoProduto() {
        return oProduto;
    }

    public void setoProduto(Produto oProduto) {
        this.oProduto = oProduto;
    }

    public Saida getoSaida() {
        return oSaida;
    }

    public void setoSaida(Saida oSaida) {
        this.oSaida = oSaida;
    }
    
    
}
