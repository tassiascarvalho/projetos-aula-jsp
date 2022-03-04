/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.model;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa {
    
    private Integer idCliente;
    private String rgCliente;
    private String cidadeCliente;
    private int quantidadeDependentesCliente;
    private String caminhoImagem;
    private int fItem;
    
    public Cliente() {
    }

    public Cliente(Integer idCliente, String rgCliente, String cidadeCliente, int quantidadeDependentesCliente, String caminhoImagem, int fItem, Integer idPessoa, String nomePessoa, String cpfPessoa, String loginPessoa, String senhaPessoa, String tipoPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, loginPessoa, senhaPessoa, tipoPessoa);
        this.idCliente = idCliente;
        this.rgCliente = rgCliente;
        this.cidadeCliente = cidadeCliente;
        this.quantidadeDependentesCliente = quantidadeDependentesCliente;
        this.caminhoImagem = caminhoImagem;
        this.fItem = fItem;
    }


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public int getQuantidadeDependentesCliente() {
        return quantidadeDependentesCliente;
    }

    public void setQuantidadeDependentesCliente(int quantidadeDependentesCliente) {
        this.quantidadeDependentesCliente = quantidadeDependentesCliente;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public int getfItem() {
        return fItem;
    }

    public void setfItem(int fItem) {
        this.fItem = fItem;
    }
    
}
