/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.model;

/**
 *
 * @author Tassia
 */
public class CategoriaProduto {
    private Integer idCategoriaProduto;
    private String nomeCategoriaProduto;
    private String descricaoCategoriaProduto;

    public CategoriaProduto() {
    }

    public CategoriaProduto(Integer idCategoriaProduto, String nomeCategoriaProduto, String descricaoCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
        this.nomeCategoriaProduto = nomeCategoriaProduto;
        this.descricaoCategoriaProduto = descricaoCategoriaProduto;
    }

    /**
     * @return the idCategoriaProduto
     */
    public Integer getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    /**
     * @param idCategoriaProduto the idCategoriaProduto to set
     */
    public void setIdCategoriaProduto(Integer idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    /**
     * @return the nomeCategoriaProduto
     */
    public String getNomeCategoriaProduto() {
        return nomeCategoriaProduto;
    }

    /**
     * @param nomeCategoriaProduto the nomeCategoriaProduto to set
     */
    public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
        this.nomeCategoriaProduto = nomeCategoriaProduto;
    }

    /**
     * @return the descricaoCategoriaProduto
     */
    public String getDescricaoCategoriaProduto() {
        return descricaoCategoriaProduto;
    }

    /**
     * @param descricaoCategoriaProduto the descricaoCategoriaProduto to set
     */
    public void setDescricaoCategoriaProduto(String descricaoCategoriaProduto) {
        this.descricaoCategoriaProduto = descricaoCategoriaProduto;
    }
    
    
    
}
