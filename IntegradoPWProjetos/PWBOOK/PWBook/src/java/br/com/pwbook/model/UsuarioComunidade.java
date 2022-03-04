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
public class UsuarioComunidade {
    private Integer idUsuarioComunidade;
    private Date dataIngressoUsuarioComunidade;
    private String statusUsuarioComunidade;
    private String tipoUsuarioComunidade;

    public UsuarioComunidade() {
    }

    public UsuarioComunidade(Integer idUsuarioComunidade, Date dataIngressoUsuarioComunidade, String statusUsuarioComunidade, String tipoUsuarioComunidade) {
        this.idUsuarioComunidade = idUsuarioComunidade;
        this.dataIngressoUsuarioComunidade = dataIngressoUsuarioComunidade;
        this.statusUsuarioComunidade = statusUsuarioComunidade;
        this.tipoUsuarioComunidade = tipoUsuarioComunidade;
    }

    /**
     * @return the idUsuarioComunidade
     */
    public Integer getIdUsuarioComunidade() {
        return idUsuarioComunidade;
    }

    /**
     * @param idUsuarioComunidade the idUsuarioComunidade to set
     */
    public void setIdUsuarioComunidade(Integer idUsuarioComunidade) {
        this.idUsuarioComunidade = idUsuarioComunidade;
    }

    /**
     * @return the dataIngressoUsuarioComunidade
     */
    public Date getDataIngressoUsuarioComunidade() {
        return dataIngressoUsuarioComunidade;
    }

    /**
     * @param dataIngressoUsuarioComunidade the dataIngressoUsuarioComunidade to set
     */
    public void setDataIngressoUsuarioComunidade(Date dataIngressoUsuarioComunidade) {
        this.dataIngressoUsuarioComunidade = dataIngressoUsuarioComunidade;
    }

    /**
     * @return the statusUsuarioComunidade
     */
    public String getStatusUsuarioComunidade() {
        return statusUsuarioComunidade;
    }

    /**
     * @param statusUsuarioComunidade the statusUsuarioComunidade to set
     */
    public void setStatusUsuarioComunidade(String statusUsuarioComunidade) {
        this.statusUsuarioComunidade = statusUsuarioComunidade;
    }

    /**
     * @return the tipoUsuarioComunidade
     */
    public String getTipoUsuarioComunidade() {
        return tipoUsuarioComunidade;
    }

    /**
     * @param tipoUsuarioComunidade the tipoUsuarioComunidade to set
     */
    public void setTipoUsuarioComunidade(String tipoUsuarioComunidade) {
        this.tipoUsuarioComunidade = tipoUsuarioComunidade;
    }
    
    
    
    
}
