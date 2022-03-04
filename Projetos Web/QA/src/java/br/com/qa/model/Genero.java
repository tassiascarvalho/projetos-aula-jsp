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
public class Genero {
    private Integer idGenero;
    private String nomeGenero;
    private String descricaoGenero;

    public Genero(Integer idGenero, String nomeGenero, String descricaoGenero) {
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
        this.descricaoGenero = descricaoGenero;
    }

    public Genero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Genero(Integer idGenero, String nomeGenero) {
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
    }

    public Genero() {
    }

    /**
     * @return the idGenero
     */
    public Integer getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * @return the nomeGenero
     */
    public String getNomeGenero() {
        return nomeGenero;
    }

    /**
     * @param nomeGenero the nomeGenero to set
     */
    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    /**
     * @return the descricaoGenero
     */
    public String getDescricaoGenero() {
        return descricaoGenero;
    }

    /**
     * @param descricaoGenero the descricaoGenero to set
     */
    public void setDescricaoGenero(String descricaoGenero) {
        this.descricaoGenero = descricaoGenero;
    }
    
    
    
}
