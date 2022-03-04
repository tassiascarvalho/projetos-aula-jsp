/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Publicacao {
    private Integer idPublicacao;
    private Date dataPublicacao;
    private String textoPublicacao;
    private Integer tipoPublicacao;
    private Usuario usuario;  //Classe que tem dependecia 

    public Publicacao() {
    }

    public Publicacao(Integer idPublicacao, Date dataPublicacao, String textoPublicacao, Integer tipoPublicacao, Usuario usuario) {
        this.idPublicacao = idPublicacao;
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.tipoPublicacao = tipoPublicacao;
        this.usuario = usuario;
    }

    public Integer getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(Integer idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public Integer getTipoPublicacao() {
        return tipoPublicacao;
    }

    public void setTipoPublicacao(Integer tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
