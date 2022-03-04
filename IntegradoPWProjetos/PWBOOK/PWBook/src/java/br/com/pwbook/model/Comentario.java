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
public class Comentario {
    private Integer idComentario;
    private String textoComentario;
    private Integer respostaComentario;   
    private Usuario usuario;
    private Publicacao publicacao;

    public Comentario() {
    }

    public Comentario(Integer idComentario, String textoComentario, Integer respostaComentario, Usuario usuario, Publicacao publicacao) {
        this.idComentario = idComentario;
        this.textoComentario = textoComentario;
        this.respostaComentario = respostaComentario;
        this.usuario = usuario;
        this.publicacao = publicacao;
    }

    /**
     * @return the idComentario
     */
    public Integer getIdComentario() {
        return idComentario;
    }

    /**
     * @param idComentario the idComentario to set
     */
    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    /**
     * @return the textoComentario
     */
    public String getTextoComentario() {
        return textoComentario;
    }

    /**
     * @param textoComentario the textoComentario to set
     */
    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    /**
     * @return the respostaComentario
     */
    public Integer getRespostaComentario() {
        return respostaComentario;
    }

    /**
     * @param respostaComentario the respostaComentario to set
     */
    public void setRespostaComentario(Integer respostaComentario) {
        this.respostaComentario = respostaComentario;
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