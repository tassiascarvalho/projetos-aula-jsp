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
public class Especie {
    private Integer idEspecie;
    private String nomeEspecie;
    private String descricaoEspecie;

    public Especie() {
    }

    public Especie(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }
    
    public Especie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }
    
    public Especie(Integer idEspecie, String nomeEspecie, String descricaoEspecie) {
        this.idEspecie = idEspecie;
        this.nomeEspecie = nomeEspecie;
        this.descricaoEspecie = descricaoEspecie;
    }

    public Integer getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public String getDescricaoEspecie() {
        return descricaoEspecie;
    }

    public void setDescricaoEspecie(String descricaoEspecie) {
        this.descricaoEspecie = descricaoEspecie;
    }
    
    
}
