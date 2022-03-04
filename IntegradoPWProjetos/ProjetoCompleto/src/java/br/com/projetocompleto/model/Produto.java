/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Produto {
    private Integer idProduto;
    private String nomeProduto;
    private Double valorProduto;
    private Date dataFabricacaoProduto;
    //Demonstra associção.
    private Juridica juridica;

    public Produto() {
    }

    public Produto(Integer idProduto, String nomeProduto, Double valorProduto, Date dataFabricacaoProduto, Juridica juridica) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.dataFabricacaoProduto = dataFabricacaoProduto;
        this.juridica = juridica;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Date getDataFabricacaoProduto() {
        return dataFabricacaoProduto;
    }

    public void setDataFabricacaoProduto(Date dataFabricacaoProduto) {
        this.dataFabricacaoProduto = dataFabricacaoProduto;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }
    
    
    
}
