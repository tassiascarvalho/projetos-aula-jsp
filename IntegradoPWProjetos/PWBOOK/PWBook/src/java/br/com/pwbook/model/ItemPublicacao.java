/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.model;

/**
 *
 * @author Tassia
 */
public class ItemPublicacao {
    private Integer idItemPublicacao;
    private String caminhoArquivoItemPublicacao;
    private String descricaoItemPublicacao;
    private Publicacao publicacao;

    public ItemPublicacao() {
    }

    public ItemPublicacao(Integer idItemPublicacao, String caminhoArquivoItemPublicacao, String descricaoItemPublicacao, Publicacao publicacao) {
        this.idItemPublicacao = idItemPublicacao;
        this.caminhoArquivoItemPublicacao = caminhoArquivoItemPublicacao;
        this.descricaoItemPublicacao = descricaoItemPublicacao;
        this.publicacao = publicacao;
    }

    /**
     * @return the idItemPublicacao
     */
    public Integer getIdItemPublicacao() {
        return idItemPublicacao;
    }

    /**
     * @param idItemPublicacao the idItemPublicacao to set
     */
    public void setIdItemPublicacao(Integer idItemPublicacao) {
        this.idItemPublicacao = idItemPublicacao;
    }

    /**
     * @return the caminhoArquivoItemPublicacao
     */
    public String getCaminhoArquivoItemPublicacao() {
        return caminhoArquivoItemPublicacao;
    }

    /**
     * @param caminhoArquivoItemPublicacao the caminhoArquivoItemPublicacao to set
     */
    public void setCaminhoArquivoItemPublicacao(String caminhoArquivoItemPublicacao) {
        this.caminhoArquivoItemPublicacao = caminhoArquivoItemPublicacao;
    }

    /**
     * @return the descricaoItemPublicacao
     */
    public String getDescricaoItemPublicacao() {
        return descricaoItemPublicacao;
    }

    /**
     * @param descricaoItemPublicacao the descricaoItemPublicacao to set
     */
    public void setDescricaoItemPublicacao(String descricaoItemPublicacao) {
        this.descricaoItemPublicacao = descricaoItemPublicacao;
    }

    /**
     * @return the publicacao
     */
    public Publicacao getPublicacao() {
        return publicacao;
    }

    /**
     * @param publicacao the publicacao to set
     */
    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
    
    
}
