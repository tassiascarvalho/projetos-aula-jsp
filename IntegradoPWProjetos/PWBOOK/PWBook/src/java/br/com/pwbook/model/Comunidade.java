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
public class Comunidade {
    private Integer idComunidade;
    private String nomeComunidade;
    private String descricaoComunidade;
    private String caminhofotoComunidade;

    public Comunidade() {
    }

    public Comunidade(Integer idComunidade, String nomeComunidade, String descricaoComunidade, String caminhofotoComunidade) {
        this.idComunidade = idComunidade;
        this.nomeComunidade = nomeComunidade;
        this.descricaoComunidade = descricaoComunidade;
        this.caminhofotoComunidade = caminhofotoComunidade;
    }

    /**
     * @return the idComunidade
     */
    public Integer getIdComunidade() {
        return idComunidade;
    }

    /**
     * @param idComunidade the idComunidade to set
     */
    public void setIdComunidade(Integer idComunidade) {
        this.idComunidade = idComunidade;
    }

    /**
     * @return the nomeComunidade
     */
    public String getNomeComunidade() {
        return nomeComunidade;
    }

    /**
     * @param nomeComunidade the nomeComunidade to set
     */
    public void setNomeComunidade(String nomeComunidade) {
        this.nomeComunidade = nomeComunidade;
    }

    /**
     * @return the descricaoComunidade
     */
    public String getDescricaoComunidade() {
        return descricaoComunidade;
    }

    /**
     * @param descricaoComunidade the descricaoComunidade to set
     */
    public void setDescricaoComunidade(String descricaoComunidade) {
        this.descricaoComunidade = descricaoComunidade;
    }

    /**
     * @return the caminhofotoComunidade
     */
    public String getCaminhofotoComunidade() {
        return caminhofotoComunidade;
    }

    /**
     * @param caminhofotoComunidade the caminhofotoComunidade to set
     */
    public void setCaminhofotoComunidade(String caminhofotoComunidade) {
        this.caminhofotoComunidade = caminhofotoComunidade;
    }
    
    
}
