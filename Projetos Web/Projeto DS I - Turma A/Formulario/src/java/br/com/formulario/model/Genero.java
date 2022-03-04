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
public class Genero {
    private Integer idGenero;
    private String nomeGenero;
    private String descricaoGenero;

    public Genero() {
    }

    public Genero(Integer idGenero, String nomeGenero, String descricaoGenero) {
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
        this.descricaoGenero = descricaoGenero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public String getDescricaoGenero() {
        return descricaoGenero;
    }

    public void setDescricaoGenero(String descricaoGenero) {
        this.descricaoGenero = descricaoGenero;
    }
    
    
}
