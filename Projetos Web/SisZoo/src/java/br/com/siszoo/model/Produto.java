/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.model;

/**
 *
 * @author Aluno
 */
public class Produto {
    private Integer idProduto;
    private String nomeProduto;
    private Double valorVendaProduto;
    private Double valorCompraProduto;

    public Produto() {
    }

    public Produto(Integer idProduto, String nomeProduto, Double valorVendaProduto, Double valorCompraProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorVendaProduto = valorVendaProduto;
        this.valorCompraProduto = valorCompraProduto;
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

    public Double getValorVendaProduto() {
        return valorVendaProduto;
    }

    public void setValorVendaProduto(Double valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }

    public Double getValorCompraProduto() {
        return valorCompraProduto;
    }

    public void setValorCompraProduto(Double valorCompraProduto) {
        this.valorCompraProduto = valorCompraProduto;
    }
}
