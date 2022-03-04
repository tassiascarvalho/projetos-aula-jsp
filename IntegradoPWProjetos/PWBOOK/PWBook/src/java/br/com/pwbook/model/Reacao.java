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
public class Reacao {
    private Integer idReacao;
    private String tipoReacao;
    private Usuario usuario;
    private Comentario comentario;
    private Publicacao publicacao;

    public Reacao() {
    }

    public Reacao(Integer idReacao, String tipoReacao, Usuario usuario, Comentario comentario, Publicacao publicacao) {
        this.idReacao = idReacao;
        this.tipoReacao = tipoReacao;
        this.usuario = usuario;
        this.comentario = comentario;
        this.publicacao = publicacao;
    }

    /**
     * @return the idReacao
     */
    public Integer getIdReacao() {
        return idReacao;
    }

    /**
     * @param idReacao the idReacao to set
     */
    public void setIdReacao(Integer idReacao) {
        this.idReacao = idReacao;
    }

    /**
     * @return the tipoReacao
     */
    public String getTipoReacao() {
        return tipoReacao;
    }

    /**
     * @param tipoReacao the tipoReacao to set
     */
    public void setTipoReacao(String tipoReacao) {
        this.tipoReacao = tipoReacao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the comentario
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
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
