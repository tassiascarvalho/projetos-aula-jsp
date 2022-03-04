/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.model;

/**
 *
 * @author Tassia
 */
public class Especialidade {
    private Integer idEspecialidade;
    private String nomeEspecialidade;
    private String descricaoEspecialidade;

    public Especialidade() {
    }

    public Especialidade(Integer idEspecialidade, String nomeEspecialidade, String descricaoEspecialidade) {
        this.idEspecialidade = idEspecialidade;
        this.nomeEspecialidade = nomeEspecialidade;
        this.descricaoEspecialidade = descricaoEspecialidade;
    }

    /**
     * @return the idEspecialidade
     */
    public Integer getIdEspecialidade() {
        return idEspecialidade;
    }

    /**
     * @param idEspecialidade the idEspecialidade to set
     */
    public void setIdEspecialidade(Integer idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    /**
     * @return the nomeEspecialidade
     */
    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    /**
     * @param nomeEspecialidade the nomeEspecialidade to set
     */
    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    /**
     * @return the descricaoEspecialidade
     */
    public String getDescricaoEspecialidade() {
        return descricaoEspecialidade;
    }

    /**
     * @param descricaoEspecialidade the descricaoEspecialidade to set
     */
    public void setDescricaoEspecialidade(String descricaoEspecialidade) {
        this.descricaoEspecialidade = descricaoEspecialidade;
    }
    
    
    
    
}
